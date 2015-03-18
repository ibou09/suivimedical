package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Medicament;
import com.mycompany.suivimedical.Ordonnance;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Modeemplois.class)
public class Modeemplois_ { 

    public static volatile SingularAttribute<Modeemplois, String> dose;
    public static volatile SingularAttribute<Modeemplois, Medicament> idMed;
    public static volatile SingularAttribute<Modeemplois, Ordonnance> idOrdonnance;
    public static volatile SingularAttribute<Modeemplois, Integer> idEmp;
    public static volatile SingularAttribute<Modeemplois, Integer> frequence;

}