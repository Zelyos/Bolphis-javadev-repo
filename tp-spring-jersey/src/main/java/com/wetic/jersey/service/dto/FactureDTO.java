package com.wetic.jersey.service.dto;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;


public class FactureDTO {
	private long id;
	private ZonedDateTime dateFacturation;
	private ClientDTO clientDTO;
	 private Set<DetailsFactureDTO> detailsFacturesDTO = new HashSet<>();

	public ClientDTO getClientDTO() {
		return clientDTO;
	}

	public void setClientDTO(ClientDTO clientDTO) {
		this.clientDTO = clientDTO;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ZonedDateTime getDateFacturation() {
		return dateFacturation;
	}

	public void setDateFacturation(ZonedDateTime dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	
	
	public Set<DetailsFactureDTO> getDetailsFacturesDTO() {
		return detailsFacturesDTO;
	}

	public void setDetailsFacturesDTO(Set<DetailsFactureDTO> detailsFacturesDTO) {
		this.detailsFacturesDTO = detailsFacturesDTO;
	}

	public FactureDTO detailsFacturesDTO(Set<DetailsFactureDTO> detailsFacturesDTO) {
        this.detailsFacturesDTO = detailsFacturesDTO;
        return this;
    }
	
	public FactureDTO addDetailsFacture(DetailsFactureDTO detailsFacture) {
        this.detailsFacturesDTO.add(detailsFacture);
        detailsFacture.setFactureDTO(this);
        return this;
    }
	
	public FactureDTO removeDetailsFactures(DetailsFactureDTO detailsFacture) {
        this.detailsFacturesDTO.remove(detailsFacture);
        detailsFacture.setFactureDTO(null);
        return this;
    }


}
