package com.wetic.jersey.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Produit.class)
public abstract class Produit_ {

	public static volatile SingularAttribute<Produit, Float> prix;
	public static volatile SingularAttribute<Produit, String> libelle;
	public static volatile SingularAttribute<Produit, String> description;
	public static volatile SetAttribute<Produit, DetailsFacture> detailsFactures;
	public static volatile SingularAttribute<Produit, Long> id;
	public static volatile SingularAttribute<Produit, Integer> qteStock;

	public static final String PRIX = "prix";
	public static final String LIBELLE = "libelle";
	public static final String DESCRIPTION = "description";
	public static final String DETAILS_FACTURES = "detailsFactures";
	public static final String ID = "id";
	public static final String QTE_STOCK = "qteStock";

}

