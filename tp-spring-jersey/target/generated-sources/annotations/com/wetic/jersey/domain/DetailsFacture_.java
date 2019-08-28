package com.wetic.jersey.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetailsFacture.class)
public abstract class DetailsFacture_ {

	public static volatile SingularAttribute<DetailsFacture, Produit> produit;
	public static volatile SingularAttribute<DetailsFacture, Facture> facture;
	public static volatile SingularAttribute<DetailsFacture, String> description;
	public static volatile SingularAttribute<DetailsFacture, Long> id;
	public static volatile SingularAttribute<DetailsFacture, Integer> qteProduit;

	public static final String PRODUIT = "produit";
	public static final String FACTURE = "facture";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String QTE_PRODUIT = "qteProduit";

}

