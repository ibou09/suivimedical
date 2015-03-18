package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Renseignement;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Indicateur.class)
public class Indicateur_ { 

    public static volatile CollectionAttribute<Indicateur, Renseignement> renseignementCollection;
    public static volatile SingularAttribute<Indicateur, Integer> idIndicateur;
    public static volatile SingularAttribute<Indicateur, String> nom;

}