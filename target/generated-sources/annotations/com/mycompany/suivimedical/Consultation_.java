package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Ordonnance;
import com.mycompany.suivimedical.Rendezvous;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Consultation.class)
public class Consultation_ { 

    public static volatile SingularAttribute<Consultation, Long> idConsultation;
    public static volatile SingularAttribute<Consultation, Date> date;
    public static volatile SingularAttribute<Consultation, BigInteger> idAnalyse;
    public static volatile CollectionAttribute<Consultation, Ordonnance> ordonnanceCollection;
    public static volatile SingularAttribute<Consultation, Rendezvous> idRdv;

}