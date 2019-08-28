package com.wetic.jersey.mapper;

import org.mapstruct.Mapper;

import com.wetic.jersey.domain.DetailsFacture;
import com.wetic.jersey.service.dto.DetailsFactureDTO;

@Mapper(componentModel = "spring")
public interface DetailsFactureMapper extends GenericMapper<DetailsFactureDTO, DetailsFacture> {

}
