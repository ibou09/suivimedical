/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suivimedical;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author medoune
 */
@Entity
@Table(name = "renseignement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Renseignement.findAll", query = "SELECT r FROM Renseignement r"),
    @NamedQuery(name = "Renseignement.findByIdMaladie", query = "SELECT r FROM Renseignement r WHERE r.renseignementPK.idMaladie = :idMaladie"),
    @NamedQuery(name = "Renseignement.findByIdIndicateur", query = "SELECT r FROM Renseignement r WHERE r.renseignementPK.idIndicateur = :idIndicateur"),
    @NamedQuery(name = "Renseignement.findByIdPatient", query = "SELECT r FROM Renseignement r WHERE r.renseignementPK.idPatient = :idPatient"),
    @NamedQuery(name = "Renseignement.findByValeur", query = "SELECT r FROM Renseignement r WHERE r.valeur = :valeur"),
    @NamedQuery(name = "Renseignement.findByDate", query = "SELECT r FROM Renseignement r WHERE r.date = :date")})
public class Renseignement implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RenseignementPK renseignementPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "valeur")
    private String valeur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @JoinColumn(name = "idIndicateur", referencedColumnName = "idIndicateur", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Indicateur indicateur;
    @JoinColumn(name = "idMaladie", referencedColumnName = "idMaladie", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Maladie maladie;
    @JoinColumn(name = "idPatient", referencedColumnName = "idPatient", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Patient patient;

    public Renseignement() {
    }

    public Renseignement(RenseignementPK renseignementPK) {
        this.renseignementPK = renseignementPK;
    }

    public Renseignement(RenseignementPK renseignementPK, String valeur, Date date) {
        this.renseignementPK = renseignementPK;
        this.valeur = valeur;
        this.date = date;
    }

    public Renseignement(int idMaladie, int idIndicateur, long idPatient) {
        this.renseignementPK = new RenseignementPK(idMaladie, idIndicateur, idPatient);
    }

    public RenseignementPK getRenseignementPK() {
        return renseignementPK;
    }

    public void setRenseignementPK(RenseignementPK renseignementPK) {
        this.renseignementPK = renseignementPK;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Indicateur getIndicateur() {
        return indicateur;
    }

    public void setIndicateur(Indicateur indicateur) {
        this.indicateur = indicateur;
    }

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (renseignementPK != null ? renseignementPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Renseignement)) {
            return false;
        }
        Renseignement other = (Renseignement) object;
        if ((this.renseignementPK == null && other.renseignementPK != null) || (this.renseignementPK != null && !this.renseignementPK.equals(other.renseignementPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.Renseignement[ renseignementPK=" + renseignementPK + " ]";
    }
    
}
