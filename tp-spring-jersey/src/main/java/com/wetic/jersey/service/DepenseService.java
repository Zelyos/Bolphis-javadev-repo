package com.wetic.jersey.service;


import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;
import com.wetic.jersey.service.dto.DepenseDTO;

public interface DepenseService {
	
	DepenseDTO save(DepenseDTO depenseDTO);
	
	Page<DepenseDTO> findAll(Pageable pageable);
	
	Optional<DepenseDTO> findOne(long id);
	
	void delete(long id);

	long sumAll();
}
