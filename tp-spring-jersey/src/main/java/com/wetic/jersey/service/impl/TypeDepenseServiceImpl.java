package com.wetic.jersey.service.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wetic.jersey.domain.TypeDepense;
import com.wetic.jersey.mapper.TypeDepenseMapper;
import com.wetic.jersey.repository.TypeDepenseRepository;
import com.wetic.jersey.service.TypeDepenseService;
import com.wetic.jersey.service.dto.TypeDepenseDTO;

@Service
public class TypeDepenseServiceImpl implements TypeDepenseService{

	private final TypeDepenseRepository typeDepenseRepository;
	private final TypeDepenseMapper typeDepenseMapper;
	public TypeDepenseServiceImpl(TypeDepenseRepository typeDepenseRepository, TypeDepenseMapper typeDepenseMapper) {
		super();
		this.typeDepenseRepository = typeDepenseRepository;
		this.typeDepenseMapper = typeDepenseMapper;
	}
	@Override
	public TypeDepenseDTO save(TypeDepenseDTO typeDepenseDTO) {
		TypeDepense typeDepense = typeDepenseMapper.toEntity(typeDepenseDTO);
		typeDepense = typeDepenseRepository.save(typeDepense);
		return typeDepenseMapper.toEntityDTO(typeDepense);
	}
	@Override
	public Page<TypeDepenseDTO> findAll(Pageable pageable) {
		return typeDepenseRepository.findAll(pageable).map(typeDepenseMapper::toEntityDTO);
	}
	@Override
	public Optional<TypeDepenseDTO> findById(long id) {
		return typeDepenseRepository.findById(id).map(typeDepenseMapper::toEntityDTO);
	}
	@Override
	public void delete(long id) {
		typeDepenseRepository.deleteById(id);
	}
	
}
