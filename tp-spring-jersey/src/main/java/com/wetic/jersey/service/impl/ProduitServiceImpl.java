package com.wetic.jersey.service.impl;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wetic.jersey.domain.Produit;
import com.wetic.jersey.mapper.ProduitMapper;
import com.wetic.jersey.repository.ProduitRepository;
import com.wetic.jersey.service.ProduitService;
import com.wetic.jersey.service.dto.ProduitDTO;

@Service
public class ProduitServiceImpl implements ProduitService{
	
	private final ProduitRepository produitRepository;
	private final ProduitMapper produitMapper;
	public ProduitServiceImpl(ProduitRepository produitRepository, ProduitMapper produitMapper) {
		super();
		this.produitRepository = produitRepository;
		this.produitMapper = produitMapper;
	}
	@Override
	public ProduitDTO save(ProduitDTO produitDTO) {
		Produit produit = produitMapper.toEntity(produitDTO);
		produit = produitRepository.save(produit);
		return produitMapper.toEntityDTO(produit);
	}
	@Override
	public Page<ProduitDTO> findAll(Pageable pageable) {
		return produitRepository.findAll(pageable).map(produitMapper::toEntityDTO);
	}
	@Override
	public Optional<ProduitDTO> findById(long id) {
		return produitRepository.findById(id).map(produitMapper::toEntityDTO);
	}
	@Override
	public void delete(long id) {
		produitRepository.deleteById(id);
		
	}
	@Override
	public long countAll() {
		return produitRepository.CountAll();
	}
	
	

}
