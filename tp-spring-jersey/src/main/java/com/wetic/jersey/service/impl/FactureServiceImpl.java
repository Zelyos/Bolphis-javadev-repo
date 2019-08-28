package com.wetic.jersey.service.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wetic.jersey.domain.Facture;
import com.wetic.jersey.mapper.FactureMapper;
import com.wetic.jersey.repository.FactureRepository;
import com.wetic.jersey.service.FactureService;
import com.wetic.jersey.service.dto.FactureDTO;

@Service
public class FactureServiceImpl implements FactureService{
	
	private final FactureRepository factureRepository;
	private final FactureMapper factureMapper;
	public FactureServiceImpl(FactureRepository factureRepository, FactureMapper factureMapper) {
		super();
		this.factureRepository = factureRepository;
		this.factureMapper = factureMapper;
	}
	@Override
	public FactureDTO save(FactureDTO factureDTO) {
		Facture facture = factureMapper.toEntity(factureDTO);
		facture = factureRepository.save(facture);
		return factureMapper.toEntityDTO(facture);
	}
	@Override
	public Page<FactureDTO> findAll(Pageable pageable) {
		return factureRepository.findAll(pageable).map(factureMapper::toEntityDTO);
	}
	@Override
	public Optional<FactureDTO> findById(long id) {
		return factureRepository.findById(id).map(factureMapper::toEntityDTO);
	}
	@Override
	public void delete(long id) {
		factureRepository.deleteById(id);
		
	}
	@Override
	public Page<FactureDTO> findByClientId(Pageable pageable, long id) {
		return factureRepository.findByClientId(pageable, id).map(factureMapper::toEntityDTO);
	}
	@Override
	public long countAll() {
		return factureRepository.CountAll();
	}
	
	

}
