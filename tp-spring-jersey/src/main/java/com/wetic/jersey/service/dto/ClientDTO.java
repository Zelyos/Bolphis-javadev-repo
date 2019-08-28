package com.wetic.jersey.service.dto;

import java.util.HashSet;
import java.util.Set;


public class ClientDTO {

	private long id;
	private String adresse;
	private String localite;
	private String categorie;
	private double compte;
	private long userId;
	private Set<FactureDTO> facturesDTO = new HashSet<>();

	

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Set<FactureDTO> getFacturesDTO() {
		return facturesDTO;
	}

	public void setFacturesDTO(Set<FactureDTO> facturesDTO) {
		this.facturesDTO = facturesDTO;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLocalite() {
		return localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public double getCompte() {
		return compte;
	}

	public void setCompte(double compte) {
		this.compte = compte;
	}
	
	public ClientDTO facturesDTO(Set<FactureDTO> facturesDTO) {
        this.facturesDTO = facturesDTO;
        return this;
    }
	
	public ClientDTO addFacture(FactureDTO factureDTO) {
        this.facturesDTO.add(factureDTO);
        factureDTO.setClientDTO(this);
        return this;
    }
	
	public ClientDTO removeFacture(FactureDTO factureDTO) {
        this.facturesDTO.remove(factureDTO);
        factureDTO.setClientDTO(null);
        return this;
    }

}
