package com.mycompany.suivimedical;

import com.mycompany.suivimedical.util.JsfUtil;
import com.mycompany.suivimedical.util.JsfUtil.PersistAction;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("renseignementController")
@SessionScoped
public class RenseignementController implements Serializable {

    @EJB
    private com.mycompany.suivimedical.RenseignementFacade ejbFacade;
    private List<Renseignement> items = null;
    private Renseignement selected;

    public RenseignementController() {
    }

    public Renseignement getSelected() {
        return selected;
    }

    public void setSelected(Renseignement selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
        selected.getRenseignementPK().setIdPatient(selected.getPatient().getIdPatient());
        selected.getRenseignementPK().setIdMaladie(selected.getMaladie().getIdMaladie());
        selected.getRenseignementPK().setIdIndicateur(selected.getIndicateur().getIdIndicateur());
    }

    protected void initializeEmbeddableKey() {
        selected.setRenseignementPK(new com.mycompany.suivimedical.RenseignementPK());
    }

    private RenseignementFacade getFacade() {
        return ejbFacade;
    }

    public Renseignement prepareCreate() {
        selected = new Renseignement();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("RenseignementCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("RenseignementUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("RenseignementDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Renseignement> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Renseignement getRenseignement(com.mycompany.suivimedical.RenseignementPK id) {
        return getFacade().find(id);
    }

    public List<Renseignement> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Renseignement> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Renseignement.class)
    public static class RenseignementControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            RenseignementController controller = (RenseignementController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "renseignementController");
            return controller.getRenseignement(getKey(value));
        }

        com.mycompany.suivimedical.RenseignementPK getKey(String value) {
            com.mycompany.suivimedical.RenseignementPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.mycompany.suivimedical.RenseignementPK();
            key.setIdMaladie(Integer.parseInt(values[0]));
            key.setIdIndicateur(Integer.parseInt(values[1]));
            key.setIdPatient(Long.parseLong(values[2]));
            return key;
        }

        String getStringKey(com.mycompany.suivimedical.RenseignementPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getIdMaladie());
            sb.append(SEPARATOR);
            sb.append(value.getIdIndicateur());
            sb.append(SEPARATOR);
            sb.append(value.getIdPatient());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Renseignement) {
                Renseignement o = (Renseignement) object;
                return getStringKey(o.getRenseignementPK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Renseignement.class.getName()});
                return null;
            }
        }

    }

}
