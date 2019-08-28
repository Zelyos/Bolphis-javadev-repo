package com.wetic.jersey.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeDepense.class)
public abstract class TypeDepense_ {

	public static volatile SetAttribute<TypeDepense, Depense> depenses;
	public static volatile SingularAttribute<TypeDepense, String> libelle;
	public static volatile SingularAttribute<TypeDepense, String> description;
	public static volatile SingularAttribute<TypeDepense, Long> id;

	public static final String DEPENSES = "depenses";
	public static final String LIBELLE = "libelle";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

