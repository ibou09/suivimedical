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
@Table(name = "patient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
    @NamedQuery(name = "Patient.findByIdPatient", query = "SELECT p FROM Patient p WHERE p.idPatient = :idPatient"),
    @NamedQuery(name = "Patient.findByNomPatient", query = "SELECT p FROM Patient p WHERE p.nomPatient = :nomPatient"),
    @NamedQuery(name = "Patient.findByPrenomPatient", query = "SELECT p FROM Patient p WHERE p.prenomPatient = :prenomPatient"),
    @NamedQuery(name = "Patient.findBySexe", query = "SELECT p FROM Patient p WHERE p.sexe = :sexe"),
    @NamedQuery(name = "Patient.findByAdresse", query = "SELECT p FROM Patient p WHERE p.adresse = :adresse"),
    @NamedQuery(name = "Patient.findByTelephone", query = "SELECT p FROM Patient p WHERE p.telephone = :telephone"),
    @NamedQuery(name = "Patient.findByProfession", query = "SELECT p FROM Patient p WHERE p.profession = :profession"),
    @NamedQuery(name = "Patient.findByNumeroCss", query = "SELECT p FROM Patient p WHERE p.numeroCss = :numeroCss"),
    @NamedQuery(name = "Patient.findByMutuel", query = "SELECT p FROM Patient p WHERE p.mutuel = :mutuel")})
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPatient")
    private Long idPatient;
    @Size(max = 254)
    @Column(name = "nomPatient")
    private String nomPatient;
    @Size(max = 254)
    @Column(name = "prenomPatient")
    private String prenomPatient;
    @Size(max = 254)
    @Column(name = "sexe")
    private String sexe;
    @Size(max = 254)
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "telephone")
    private Integer telephone;
    @Size(max = 254)
    @Column(name = "profession")
    private String profession;
    @Size(max = 254)
    @Column(name = "numeroCss")
    private String numeroCss;
    @Size(max = 254)
    @Column(name = "mutuel")
    private String mutuel;
    @OneToMany(mappedBy = "idPatient")
    private Collection<Antecedant> antecedantCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private Collection<Renseignement> renseignementCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private Collection<Suivi> suiviCollection;
    @JoinColumn(name = "idLoc", referencedColumnName = "idLoc")
    @ManyToOne
    private Localite idLoc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPatient")
    private Collection<Rendezvous> rendezvousCollection;

    public Patient() {
    }

    public Patient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        this.prenomPatient = prenomPatient;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNumeroCss() {
        return numeroCss;
    }

    public void setNumeroCss(String numeroCss) {
        this.numeroCss = numeroCss;
    }

    public String getMutuel() {
        return mutuel;
    }

    public void setMutuel(String mutuel) {
        this.mutuel = mutuel;
    }

    @XmlTransient
    public Collection<Antecedant> getAntecedantCollection() {
        return antecedantCollection;
    }

    public void setAntecedantCollection(Collection<Antecedant> antecedantCollection) {
        this.antecedantCollection = antecedantCollection;
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

    public Localite getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(Localite idLoc) {
        this.idLoc = idLoc;
    }

    @XmlTransient
    public Collection<Rendezvous> getRendezvousCollection() {
        return rendezvousCollection;
    }

    public void setRendezvousCollection(Collection<Rendezvous> rendezvousCollection) {
        this.rendezvousCollection = rendezvousCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPatient != null ? idPatient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.idPatient == null && other.idPatient != null) || (this.idPatient != null && !this.idPatient.equals(other.idPatient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.Patient[ idPatient=" + idPatient + " ]";
    }
    
}
