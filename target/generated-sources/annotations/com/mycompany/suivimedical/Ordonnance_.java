package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Consultation;
import com.mycompany.suivimedical.Modeemplois;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Ordonnance.class)
public class Ordonnance_ { 

    public static volatile SingularAttribute<Ordonnance, Consultation> idConsultation;
    public static volatile SingularAttribute<Ordonnance, Integer> idOrdonnance;
    public static volatile SingularAttribute<Ordonnance, Date> datedebut;
    public static volatile CollectionAttribute<Ordonnance, Modeemplois> modeemploisCollection;
    public static volatile SingularAttribute<Ordonnance, Integer> datefin;
    public static volatile SingularAttribute<Ordonnance, Boolean> assister;

}