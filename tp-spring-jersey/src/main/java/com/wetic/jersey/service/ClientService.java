package com.wetic.jersey.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

import com.wetic.jersey.service.dto.ClientDTO;

public interface ClientService {
	
	ClientDTO save(ClientDTO clientDTO);
	
	Page<ClientDTO> findAll(Pageable pageable);
	
	Optional<ClientDTO> findById(long id);
	
	void delete(long id);
	
	long countAll();

}
