/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.suivimedical;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author medoune
 */
@Entity
@Table(name = "rendezvous")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rendezvous.findAll", query = "SELECT r FROM Rendezvous r"),
    @NamedQuery(name = "Rendezvous.findByIdRdv", query = "SELECT r FROM Rendezvous r WHERE r.idRdv = :idRdv"),
    @NamedQuery(name = "Rendezvous.findByDate", query = "SELECT r FROM Rendezvous r WHERE r.date = :date")})
public class Rendezvous implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRdv")
    private Integer idRdv;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "idMedecin", referencedColumnName = "idMedecin")
    @ManyToOne(optional = false)
    private Medecin idMedecin;
    @JoinColumn(name = "idPatient", referencedColumnName = "idPatient")
    @ManyToOne(optional = false)
    private Patient idPatient;
    @OneToMany(mappedBy = "idRdv")
    private Collection<Consultation> consultationCollection;

    public Rendezvous() {
    }

    public Rendezvous(Integer idRdv) {
        this.idRdv = idRdv;
    }

    public Integer getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(Integer idRdv) {
        this.idRdv = idRdv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Medecin getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(Medecin idMedecin) {
        this.idMedecin = idMedecin;
    }

    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }

    @XmlTransient
    public Collection<Consultation> getConsultationCollection() {
        return consultationCollection;
    }

    public void setConsultationCollection(Collection<Consultation> consultationCollection) {
        this.consultationCollection = consultationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRdv != null ? idRdv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rendezvous)) {
            return false;
        }
        Rendezvous other = (Rendezvous) object;
        if ((this.idRdv == null && other.idRdv != null) || (this.idRdv != null && !this.idRdv.equals(other.idRdv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.Rendezvous[ idRdv=" + idRdv + " ]";
    }
    
}
