package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Rendezvous;
import com.mycompany.suivimedical.Specialite;
import com.mycompany.suivimedical.Suivi;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Medecin.class)
public class Medecin_ { 

    public static volatile CollectionAttribute<Medecin, Rendezvous> rendezvousCollection;
    public static volatile SingularAttribute<Medecin, Integer> idMedecin;
    public static volatile SingularAttribute<Medecin, String> grade;
    public static volatile SingularAttribute<Medecin, String> fonction;
    public static volatile SingularAttribute<Medecin, Integer> tel;
    public static volatile CollectionAttribute<Medecin, Suivi> suiviCollection;
    public static volatile CollectionAttribute<Medecin, Specialite> specialiteCollection;
    public static volatile SingularAttribute<Medecin, String> nom;
    public static volatile SingularAttribute<Medecin, String> prenom;
    public static volatile SingularAttribute<Medecin, Date> datenaiss;
    public static volatile SingularAttribute<Medecin, String> email;

}