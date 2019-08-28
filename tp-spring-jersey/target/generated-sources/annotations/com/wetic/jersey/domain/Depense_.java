package com.wetic.jersey.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Depense.class)
public abstract class Depense_ {

	public static volatile SingularAttribute<Depense, ZonedDateTime> dateFacturation;
	public static volatile SingularAttribute<Depense, String> libelle;
	public static volatile SingularAttribute<Depense, String> description;
	public static volatile SingularAttribute<Depense, TypeDepense> typeDepense;
	public static volatile SingularAttribute<Depense, Float> montant;
	public static volatile SingularAttribute<Depense, Long> id;

	public static final String DATE_FACTURATION = "dateFacturation";
	public static final String LIBELLE = "libelle";
	public static final String DESCRIPTION = "description";
	public static final String TYPE_DEPENSE = "typeDepense";
	public static final String MONTANT = "montant";
	public static final String ID = "id";

}

