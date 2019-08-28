package com.wetic.jersey.service.dto;

import java.time.ZonedDateTime;

public class DepenseDTO {
	private long id;
	private String libelle;
	private Float montant;
	private String description;
	private ZonedDateTime dateFacturation;
	private TypeDepenseDTO typeDepenseDTO;

	public TypeDepenseDTO getTypeDepenseDTO() {
		return typeDepenseDTO;
	}

	public void setTypeDepenseDTO(TypeDepenseDTO typeDepenseDTO) {
		this.typeDepenseDTO = typeDepenseDTO;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Float getMontant() {
		return montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ZonedDateTime getDateFacturation() {
		return dateFacturation;
	}

	public void setDateFacturation(ZonedDateTime dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	
	public DepenseDTO dateFacturationDTO(ZonedDateTime dateFacturationDTO) {
        this.dateFacturation = dateFacturationDTO;
        return this;
    }
	
	public DepenseDTO typeDepenseDTO(TypeDepenseDTO typeDepenseDTO) {
        this.typeDepenseDTO = typeDepenseDTO;
        return this;
    }

}
