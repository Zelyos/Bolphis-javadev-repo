package com.wetic.jersey.mapper;

import org.mapstruct.Mapper;

import com.wetic.jersey.domain.Facture;
import com.wetic.jersey.service.dto.FactureDTO;

@Mapper(componentModel = "spring")
public interface FactureMapper extends GenericMapper<FactureDTO, Facture> {
}
