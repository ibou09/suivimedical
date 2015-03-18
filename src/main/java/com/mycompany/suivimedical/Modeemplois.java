/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suivimedical;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author medoune
 */
@Entity
@Table(name = "modeemplois")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modeemplois.findAll", query = "SELECT m FROM Modeemplois m"),
    @NamedQuery(name = "Modeemplois.findByIdEmp", query = "SELECT m FROM Modeemplois m WHERE m.idEmp = :idEmp"),
    @NamedQuery(name = "Modeemplois.findByFrequence", query = "SELECT m FROM Modeemplois m WHERE m.frequence = :frequence"),
    @NamedQuery(name = "Modeemplois.findByDose", query = "SELECT m FROM Modeemplois m WHERE m.dose = :dose")})
public class Modeemplois implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmp")
    private Integer idEmp;
    @Column(name = "frequence")
    private Integer frequence;
    @Size(max = 254)
    @Column(name = "dose")
    private String dose;
    @JoinColumn(name = "idMed", referencedColumnName = "idMed")
    @ManyToOne(optional = false)
    private Medicament idMed;
    @JoinColumn(name = "idOrdonnance", referencedColumnName = "idOrdonnance")
    @ManyToOne(optional = false)
    private Ordonnance idOrdonnance;

    public Modeemplois() {
    }

    public Modeemplois(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }

    public Integer getFrequence() {
        return frequence;
    }

    public void setFrequence(Integer frequence) {
        this.frequence = frequence;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Medicament getIdMed() {
        return idMed;
    }

    public void setIdMed(Medicament idMed) {
        this.idMed = idMed;
    }

    public Ordonnance getIdOrdonnance() {
        return idOrdonnance;
    }

    public void setIdOrdonnance(Ordonnance idOrdonnance) {
        this.idOrdonnance = idOrdonnance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmp != null ? idEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modeemplois)) {
            return false;
        }
        Modeemplois other = (Modeemplois) object;
        if ((this.idEmp == null && other.idEmp != null) || (this.idEmp != null && !this.idEmp.equals(other.idEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.Modeemplois[ idEmp=" + idEmp + " ]";
    }
    
}
