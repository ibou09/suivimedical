package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Patient;
import com.mycompany.suivimedical.Region;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Localite.class)
public class Localite_ { 

    public static volatile SingularAttribute<Localite, Integer> idLoc;
    public static volatile CollectionAttribute<Localite, Patient> patientCollection;
    public static volatile SingularAttribute<Localite, Region> id;
    public static volatile SingularAttribute<Localite, String> nom;

}