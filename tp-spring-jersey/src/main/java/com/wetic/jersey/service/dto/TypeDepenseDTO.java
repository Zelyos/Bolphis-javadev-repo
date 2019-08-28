package com.wetic.jersey.service.dto;

import java.util.HashSet;
import java.util.Set;

public class TypeDepenseDTO {

	private long id;
	private String libelle;
	private String description;
	private Set<DepenseDTO> depensesDTO = new HashSet<>();

	public Set<DepenseDTO> getDepensesDTO() {
		return depensesDTO;
	}

	public void setDepensesDTO(Set<DepenseDTO> depensesDTO) {
		this.depensesDTO = depensesDTO;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public TypeDepenseDTO depensesDTO(Set<DepenseDTO> depensesDTO) {
        this.depensesDTO = depensesDTO;
        return this;
    }

    public TypeDepenseDTO addDepenseDTO(DepenseDTO depenseDTO) {
        this.depensesDTO.add(depenseDTO);
        depenseDTO.setTypeDepenseDTO(this);
        return this;
    }

    public TypeDepenseDTO removeDepenseDTO(DepenseDTO depenseDTO) {
        this.depensesDTO.remove(depenseDTO);
        depenseDTO.setTypeDepenseDTO(null);
        return this;
    }

}
