package com.wetic.jersey.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wetic.jersey.domain.Client;
import com.wetic.jersey.mapper.ClientMapper;
import com.wetic.jersey.repository.ClientRepository;
import com.wetic.jersey.service.ClientService;
import com.wetic.jersey.service.dto.ClientDTO;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private final ClientRepository clientRepository;
	private final ClientMapper clientMapper;
	public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper) {
		super();
		this.clientRepository = clientRepository;
		this.clientMapper = clientMapper;
	}
	
	@Override
	public ClientDTO save(ClientDTO clientDTO) {
		Client client = clientMapper.toEntity(clientDTO);
		client = clientRepository.save(client);
		return clientMapper.toEntityDTO(client);
	}

	@Override
	public Page<ClientDTO> findAll(Pageable pageable) {
		return clientRepository.findAll(pageable).map(clientMapper::toEntityDTO);
	}

	@Override
	public Optional<ClientDTO> findById(long id) {
		return clientRepository.findById(id).map(clientMapper::toEntityDTO);
	}

	@Override
	public void delete(long id) {
		clientRepository.deleteById(id);
		
	}

	@Override
	public long countAll() {
		return clientRepository.CountAll();
	}

}
