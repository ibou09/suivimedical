package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Modeemplois;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Medicament.class)
public class Medicament_ { 

    public static volatile SingularAttribute<Medicament, Integer> idMed;
    public static volatile SingularAttribute<Medicament, String> libelle;
    public static volatile CollectionAttribute<Medicament, Modeemplois> modeemploisCollection;

}