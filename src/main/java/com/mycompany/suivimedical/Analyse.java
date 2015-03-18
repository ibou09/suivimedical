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
@Table(name = "analyse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Analyse.findAll", query = "SELECT a FROM Analyse a"),
    @NamedQuery(name = "Analyse.findByIdAnalyse", query = "SELECT a FROM Analyse a WHERE a.idAnalyse = :idAnalyse"),
    @NamedQuery(name = "Analyse.findByTypeAnalyse", query = "SELECT a FROM Analyse a WHERE a.typeAnalyse = :typeAnalyse"),
    @NamedQuery(name = "Analyse.findByResultat", query = "SELECT a FROM Analyse a WHERE a.resultat = :resultat")})
public class Analyse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAnalyse")
    private Integer idAnalyse;
    @Size(max = 254)
    @Column(name = "typeAnalyse")
    private String typeAnalyse;
    @Size(max = 254)
    @Column(name = "resultat")
    private String resultat;

    public Analyse() {
    }

    public Analyse(Integer idAnalyse) {
        this.idAnalyse = idAnalyse;
    }

    public Integer getIdAnalyse() {
        return idAnalyse;
    }

    public void setIdAnalyse(Integer idAnalyse) {
        this.idAnalyse = idAnalyse;
    }

    public String getTypeAnalyse() {
        return typeAnalyse;
    }

    public void setTypeAnalyse(String typeAnalyse) {
        this.typeAnalyse = typeAnalyse;
    }

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnalyse != null ? idAnalyse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Analyse)) {
            return false;
        }
        Analyse other = (Analyse) object;
        if ((this.idAnalyse == null && other.idAnalyse != null) || (this.idAnalyse != null && !this.idAnalyse.equals(other.idAnalyse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.suivimedical.Analyse[ idAnalyse=" + idAnalyse + " ]";
    }
    
}
