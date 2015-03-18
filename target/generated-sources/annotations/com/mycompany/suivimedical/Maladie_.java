package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Renseignement;
import com.mycompany.suivimedical.Specialite;
import com.mycompany.suivimedical.Suivi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Maladie.class)
public class Maladie_ { 

    public static volatile SingularAttribute<Maladie, Integer> idMaladie;
    public static volatile CollectionAttribute<Maladie, Renseignement> renseignementCollection;
    public static volatile CollectionAttribute<Maladie, Suivi> suiviCollection;
    public static volatile SingularAttribute<Maladie, String> nomMaladie;
    public static volatile CollectionAttribute<Maladie, Specialite> specialiteCollection;

}