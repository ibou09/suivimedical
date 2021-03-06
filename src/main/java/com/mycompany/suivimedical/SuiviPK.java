/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suivimedical;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author medoune
 */
@Embeddable
public class SuiviPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPatient")
    private long idPatient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMaladie")
    private int idMaladie;

    public SuiviPK() {
    }

    public SuiviPK(long idPatient, int idMaladie) {
        this.idPatient = idPatient;
        this.idMaladie = idMaladie;
    }

    public long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    public int getIdMaladie() {
        return idMaladie;
    }

    public void setIdMaladie(int idMaladie) {
        this.idMaladie = idMaladie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPatient;
        hash += (int) idMaladie;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SuiviPK)) {
            return false;
        }
        SuiviPK other = (SuiviPK) object;
        if (this.idPatient != other.idPatient) {
            return false;
        }
        if (this.idMaladie != other.idMaladie) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.SuiviPK[ idPatient=" + idPatient + ", idMaladie=" + idMaladie + " ]";
    }
    
}
