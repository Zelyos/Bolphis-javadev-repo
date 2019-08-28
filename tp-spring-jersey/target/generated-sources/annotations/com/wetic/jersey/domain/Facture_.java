package com.wetic.jersey.domain;

import java.time.ZonedDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Facture.class)
public abstract class Facture_ {

	public static volatile SingularAttribute<Facture, ZonedDateTime> dateFacturation;
	public static volatile SingularAttribute<Facture, Client> client;
	public static volatile SetAttribute<Facture, DetailsFacture> detailsFactures;
	public static volatile SingularAttribute<Facture, Long> id;

	public static final String DATE_FACTURATION = "dateFacturation";
	public static final String CLIENT = "client";
	public static final String DETAILS_FACTURES = "detailsFactures";
	public static final String ID = "id";

}

