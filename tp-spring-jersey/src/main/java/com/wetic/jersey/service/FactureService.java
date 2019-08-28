package com.wetic.jersey.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wetic.jersey.service.dto.FactureDTO;

public interface FactureService {
	
	FactureDTO save(FactureDTO factureDTO);
	
	Page<FactureDTO> findAll(Pageable pageable);
	
	Optional<FactureDTO> findById(long id);
	
	void delete(long id);
	
	Page<FactureDTO> findByClientId(Pageable pageable, long id);
	
	long countAll();

}
