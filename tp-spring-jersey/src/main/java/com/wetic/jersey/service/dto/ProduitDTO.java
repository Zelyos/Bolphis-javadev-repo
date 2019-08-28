package com.wetic.jersey.service.dto;

import java.util.HashSet;
import java.util.Set;

public class ProduitDTO {
	private long id;
	private String libelle;
	private Float prix;
	private Integer qteStock;
	private String description;
	private Set<DetailsFactureDTO> detailsFacturesDTO = new HashSet<>();

	public Set<DetailsFactureDTO> getDetailsFacturesDTO() {
		return detailsFacturesDTO;
	}

	public void setDetailsFacturesDTO(Set<DetailsFactureDTO> detailsFacturesDTO) {
		this.detailsFacturesDTO = detailsFacturesDTO;
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

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	public Integer getQteStock() {
		return qteStock;
	}

	public void setQteStock(Integer qteStock) {
		this.qteStock = qteStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public ProduitDTO detailsFacturesDTO(Set<DetailsFactureDTO> detailsFacturesDTO) {
        this.detailsFacturesDTO = detailsFacturesDTO;
        return this;
    }
	
	public ProduitDTO addDetailsFacturesDTO(DetailsFactureDTO detailsFactureDTO) {
        this.detailsFacturesDTO.add(detailsFactureDTO);
        detailsFactureDTO.setProduitDTO(this);
        return this;
    }

    public ProduitDTO removeDetailsFacturesDTO(DetailsFactureDTO detailsFactureDTO) {
        this.detailsFacturesDTO.remove(detailsFactureDTO);
        detailsFactureDTO.setProduitDTO(null);
        return this;
    }
    
    public void setProduitsDTO(Set<DetailsFactureDTO> detailsFacturesDTO) {
        this.detailsFacturesDTO = detailsFacturesDTO;
    }

}
