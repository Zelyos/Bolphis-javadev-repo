package com.wetic.jersey.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Client.class)
public abstract class Client_ {

	public static volatile SingularAttribute<Client, String> categorie;
	public static volatile SingularAttribute<Client, String> localite;
	public static volatile SingularAttribute<Client, String> adresse;
	public static volatile SetAttribute<Client, Facture> factures;
	public static volatile SingularAttribute<Client, Long> id;
	public static volatile SingularAttribute<Client, User> user;
	public static volatile SingularAttribute<Client, Double> compte;

	public static final String CATEGORIE = "categorie";
	public static final String LOCALITE = "localite";
	public static final String ADRESSE = "adresse";
	public static final String FACTURES = "factures";
	public static final String ID = "id";
	public static final String USER = "user";
	public static final String COMPTE = "compte";

}

