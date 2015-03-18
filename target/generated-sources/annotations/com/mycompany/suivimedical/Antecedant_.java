package com.mycompany.suivimedical;

import com.mycompany.suivimedical.Patient;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-18T11:24:54")
@StaticMetamodel(Antecedant.class)
public class Antecedant_ { 

    public static volatile SingularAttribute<Antecedant, String> antecedentPersonnel;
    public static volatile SingularAttribute<Antecedant, String> anecedentFamiliaux;
    public static volatile SingularAttribute<Antecedant, Integer> idDiagnostique;
    public static volatile SingularAttribute<Antecedant, String> facteursRisque;
    public static volatile SingularAttribute<Antecedant, Patient> idPatient;

}