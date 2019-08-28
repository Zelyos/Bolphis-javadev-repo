package com.wetic.jersey.mapper;

import org.mapstruct.Mapper;

import com.wetic.jersey.domain.Produit;
import com.wetic.jersey.service.dto.ProduitDTO;

@Mapper(componentModel = "spring")
public interface ProduitMapper extends GenericMapper<ProduitDTO, Produit> {

}
