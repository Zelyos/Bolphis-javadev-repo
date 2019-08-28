package com.wetic.jersey.service;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;

import com.wetic.jersey.domain.DetailsFacture;
import com.wetic.jersey.service.dto.DetailsFactureDTO;

public interface DetailsFactureService {
	
	DetailsFactureDTO save(DetailsFactureDTO detailsFactureDTO );
	
	Page<DetailsFactureDTO> findAll(Pageable pageable);
	
	Page<DetailsFactureDTO> findByFactureId(Pageable pageable, long id);
	
	void deleteByFactureId(long id);
	
	
	

}
