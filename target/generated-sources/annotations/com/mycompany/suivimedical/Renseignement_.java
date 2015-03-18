package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Indicateur;
import com.mycompany.suivimedical.Maladie;
import com.mycompany.suivimedical.Patient;
import com.mycompany.suivimedical.RenseignementPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Renseignement.class)
public class Renseignement_ { 

    public static volatile SingularAttribute<Renseignement, Date> date;
    public static volatile SingularAttribute<Renseignement, Indicateur> indicateur;
    public static volatile SingularAttribute<Renseignement, String> valeur;
    public static volatile SingularAttribute<Renseignement, Patient> patient;
    public static volatile SingularAttribute<Renseignement, RenseignementPK> renseignementPK;
    public static volatile SingularAttribute<Renseignement, Maladie> maladie;

}