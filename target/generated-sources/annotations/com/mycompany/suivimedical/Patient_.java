package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Antecedant;
import com.mycompany.suivimedical.Localite;
import com.mycompany.suivimedical.Rendezvous;
import com.mycompany.suivimedical.Renseignement;
import com.mycompany.suivimedical.Suivi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, String> profession;
    public static volatile CollectionAttribute<Patient, Rendezvous> rendezvousCollection;
    public static volatile CollectionAttribute<Patient, Antecedant> antecedantCollection;
    public static volatile SingularAttribute<Patient, String> sexe;
    public static volatile SingularAttribute<Patient, Integer> telephone;
    public static volatile SingularAttribute<Patient, String> prenomPatient;
    public static volatile SingularAttribute<Patient, String> numeroCss;
    public static volatile SingularAttribute<Patient, Localite> idLoc;
    public static volatile CollectionAttribute<Patient, Renseignement> renseignementCollection;
    public static volatile SingularAttribute<Patient, String> mutuel;
    public static volatile SingularAttribute<Patient, String> adresse;
    public static volatile SingularAttribute<Patient, Long> idPatient;
    public static volatile CollectionAttribute<Patient, Suivi> suiviCollection;
    public static volatile SingularAttribute<Patient, String> nomPatient;

}