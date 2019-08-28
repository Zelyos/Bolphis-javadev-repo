package com.wetic.jersey.service.impl;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wetic.jersey.domain.DetailsFacture;
import com.wetic.jersey.mapper.DetailsFactureMapper;
import com.wetic.jersey.repository.DetailsFactureRepository;
import com.wetic.jersey.service.DetailsFactureService;
import com.wetic.jersey.service.dto.DetailsFactureDTO;

@Service
public class DetailsFactureServiceImpl implements DetailsFactureService{
	
	private final DetailsFactureRepository detailsFactureRepository;
	private final DetailsFactureMapper detailsFactureMapper;
	public DetailsFactureServiceImpl(DetailsFactureRepository detailsFactureRepository,
			DetailsFactureMapper detailsFactureMapper) {
		super();
		this.detailsFactureRepository = detailsFactureRepository;
		this.detailsFactureMapper = detailsFactureMapper;
	}
	@Override
	public DetailsFactureDTO save(DetailsFactureDTO detailsFactureDTO) {
		DetailsFacture detailsFacture = detailsFactureMapper.toEntity(detailsFactureDTO);
		detailsFacture = detailsFactureRepository.save(detailsFacture);
		return detailsFactureMapper.toEntityDTO(detailsFacture);
	}
	@Override
	public Page<DetailsFactureDTO> findAll(Pageable pageable) {
		return detailsFactureRepository.findAll(pageable).map(detailsFactureMapper::toEntityDTO);
	}
	@Override
	public Page<DetailsFactureDTO> findByFactureId(Pageable pageable, long id) {
		return detailsFactureRepository.findByFactureId(pageable, id).map(detailsFactureMapper::toEntityDTO);	
		}
	@Override
	public void deleteByFactureId(long id) {
		detailsFactureRepository.deleteByFactureId(id);
		
	}
}
