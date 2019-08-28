package com.wetic.jersey.service;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.wetic.jersey.service.dto.ProduitDTO;

public interface ProduitService {
	
	ProduitDTO save(ProduitDTO produitDTO);
	
	Page<ProduitDTO> findAll(Pageable pageable);
	
	Optional<ProduitDTO> findById(long id);
	
	void delete(long id);
	
	long countAll();

}
