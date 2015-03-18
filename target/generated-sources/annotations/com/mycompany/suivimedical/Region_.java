package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Localite;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Region.class)
public class Region_ { 

    public static volatile CollectionAttribute<Region, Localite> localiteCollection;
    public static volatile SingularAttribute<Region, Integer> id;
    public static volatile SingularAttribute<Region, String> nom;

}