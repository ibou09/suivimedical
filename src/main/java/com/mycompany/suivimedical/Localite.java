/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suivimedical;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "localite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Localite.findAll", query = "SELECT l FROM Localite l"),
    @NamedQuery(name = "Localite.findByIdLoc", query = "SELECT l FROM Localite l WHERE l.idLoc = :idLoc"),
    @NamedQuery(name = "Localite.findByNom", query = "SELECT l FROM Localite l WHERE l.nom = :nom")})
public class Localite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idLoc")
    private Integer idLoc;
    @Size(max = 100)
    @Column(name = "nom")
    private String nom;
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne
    private Region id;
    @OneToMany(mappedBy = "idLoc")
    private Collection<Patient> patientCollection;

    public Localite() {
    }

    public Localite(Integer idLoc) {
        this.idLoc = idLoc;
    }

    public Integer getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(Integer idLoc) {
        this.idLoc = idLoc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Region getId() {
        return id;
    }

    public void setId(Region id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<Patient> getPatientCollection() {
        return patientCollection;
    }

    public void setPatientCollection(Collection<Patient> patientCollection) {
        this.patientCollection = patientCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLoc != null ? idLoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Localite)) {
            return false;
        }
        Localite other = (Localite) object;
        if ((this.idLoc == null && other.idLoc != null) || (this.idLoc != null && !this.idLoc.equals(other.idLoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.Localite[ idLoc=" + idLoc + " ]";
    }
    
}
