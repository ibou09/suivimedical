package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Maladie;
import com.mycompany.suivimedical.Medecin;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Specialite.class)
public class Specialite_ { 

    public static volatile SingularAttribute<Specialite, Maladie> idMaladie;
    public static volatile SingularAttribute<Specialite, Integer> idSpec;
    public static volatile SingularAttribute<Specialite, Medecin> idMedecin;
    public static volatile SingularAttribute<Specialite, String> nom;

}