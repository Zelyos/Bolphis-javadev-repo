package com.wetic.jersey.service.dto;


public class DetailsFactureDTO {
	private long id;
	private Integer qteProduit;
	private String description;
	private FactureDTO factureDTO;
	private ProduitDTO produitDTO;

	public FactureDTO getFactureDTO() {
		return factureDTO;
	}

	public void setFactureDTO(FactureDTO factureDTO) {
		this.factureDTO = factureDTO;
	}

	public ProduitDTO getProduitDTO() {
		return produitDTO;
	}

	public void setProduitDTO(ProduitDTO produitDTO) {
		this.produitDTO = produitDTO;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getQteProduit() {
		return qteProduit;
	}

	public void setQteProduit(Integer qteProduit) {
		this.qteProduit = qteProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public DetailsFactureDTO factureDTO(FactureDTO factureDTO) {
        this.factureDTO = factureDTO;
        return this;
    }

}
