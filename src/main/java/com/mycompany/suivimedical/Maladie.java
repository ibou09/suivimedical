/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suivimedical;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author medoune
 */
@Entity
@Table(name = "maladie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maladie.findAll", query = "SELECT m FROM Maladie m"),
    @NamedQuery(name = "Maladie.findByIdMaladie", query = "SELECT m FROM Maladie m WHERE m.idMaladie = :idMaladie"),
    @NamedQuery(name = "Maladie.findByNomMaladie", query = "SELECT m FROM Maladie m WHERE m.nomMaladie = :nomMaladie")})
public class Maladie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMaladie")
    private Integer idMaladie;
    @Size(max = 254)
    @Column(name = "nomMaladie")
    private String nomMaladie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMaladie")
    private Collection<Specialite> specialiteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maladie")
    private Collection<Renseignement> renseignementCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maladie")
    private Collection<Suivi> suiviCollection;

    public Maladie() {
    }

    public Maladie(Integer idMaladie) {
        this.idMaladie = idMaladie;
    }

    public Integer getIdMaladie() {
        return idMaladie;
    }

    public void setIdMaladie(Integer idMaladie) {
        this.idMaladie = idMaladie;
    }

    public String getNomMaladie() {
        return nomMaladie;
    }

    public void setNomMaladie(String nomMaladie) {
        this.nomMaladie = nomMaladie;
    }

    @XmlTransient
    public Collection<Specialite> getSpecialiteCollection() {
        return specialiteCollection;
    }

    public void setSpecialiteCollection(Collection<Specialite> specialiteCollection) {
        this.specialiteCollection = specialiteCollection;
    }

    @XmlTransient
    public Collection<Renseignement> getRenseignementCollection() {
        return renseignementCollection;
    }

    public void setRenseignementCollection(Collection<Renseignement> renseignementCollection) {
        this.renseignementCollection = renseignementCollection;
    }

    @XmlTransient
    public Collection<Suivi> getSuiviCollection() {
        return suiviCollection;
    }

    public void setSuiviCollection(Collection<Suivi> suiviCollection) {
        this.suiviCollection = suiviCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaladie != null ? idMaladie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maladie)) {
            return false;
        }
        Maladie other = (Maladie) object;
        if ((this.idMaladie == null && other.idMaladie != null) || (this.idMaladie != null && !this.idMaladie.equals(other.idMaladie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.Maladie[ idMaladie=" + idMaladie + " ]";
    }
    
}
