package com.wetic.jersey.service;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.wetic.jersey.service.dto.TypeDepenseDTO;

public interface TypeDepenseService {
	
	TypeDepenseDTO save(TypeDepenseDTO typeDepenseDTO);
	
	Page<TypeDepenseDTO> findAll(Pageable pageable);
	
	Optional<TypeDepenseDTO> findById(long id);
	
	void delete(long id); 

}
