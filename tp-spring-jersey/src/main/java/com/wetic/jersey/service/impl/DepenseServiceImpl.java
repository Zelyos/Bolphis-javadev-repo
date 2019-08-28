package com.wetic.jersey.service.impl;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wetic.jersey.domain.Depense;
import com.wetic.jersey.mapper.DepenseMapper;
import com.wetic.jersey.repository.DepenseRepository;
import com.wetic.jersey.service.DepenseService;
import com.wetic.jersey.service.dto.DepenseDTO;

@Service
public class DepenseServiceImpl implements DepenseService{
	
	private final DepenseRepository depenseRepository;
	private final DepenseMapper depenseMapper;
	public DepenseServiceImpl(DepenseRepository depenseRepository, DepenseMapper depenseMapper) {
		super();
		this.depenseRepository = depenseRepository;
		this.depenseMapper = depenseMapper;
	}
	@Override
	public DepenseDTO save(DepenseDTO depenseDTO) {
		Depense depense = depenseMapper.toEntity(depenseDTO);
		depense = depenseRepository.save(depense);
		return depenseMapper.toEntityDTO(depense);
	}
	@Override
	public Page<DepenseDTO> findAll(Pageable pageable) {
		return depenseRepository.findAll(pageable).map(depenseMapper::toEntityDTO);
	}
	@Override
	public Optional<DepenseDTO> findOne(long id) {
		return depenseRepository.findById(id).map(depenseMapper::toEntityDTO);
	}
	@Override
	public void delete(long id) {
		depenseRepository.deleteById(id);
	}
	@Override
	public long sumAll() {
		return depenseRepository.SumAll();
	}
}
