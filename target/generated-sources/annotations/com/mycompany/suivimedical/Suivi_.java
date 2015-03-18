package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Maladie;
import com.mycompany.suivimedical.Medecin;
import com.mycompany.suivimedical.Patient;
import com.mycompany.suivimedical.SuiviPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Suivi.class)
public class Suivi_ { 

    public static volatile SingularAttribute<Suivi, Medecin> idMedecin;
    public static volatile SingularAttribute<Suivi, Patient> patient;
    public static volatile SingularAttribute<Suivi, SuiviPK> suiviPK;
    public static volatile SingularAttribute<Suivi, Date> datedebut;
    public static volatile SingularAttribute<Suivi, Date> datefin;
    public static volatile SingularAttribute<Suivi, Maladie> maladie;

}