package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Consultation;
import com.mycompany.suivimedical.Medecin;
import com.mycompany.suivimedical.Patient;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Rendezvous.class)
public class Rendezvous_ { 

    public static volatile SingularAttribute<Rendezvous, Date> date;
    public static volatile SingularAttribute<Rendezvous, Medecin> idMedecin;
    public static volatile CollectionAttribute<Rendezvous, Consultation> consultationCollection;
    public static volatile SingularAttribute<Rendezvous, Patient> idPatient;
    public static volatile SingularAttribute<Rendezvous, Integer> idRdv;

}