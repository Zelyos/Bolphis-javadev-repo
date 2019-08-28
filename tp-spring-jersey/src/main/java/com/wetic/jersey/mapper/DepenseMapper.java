package com.wetic.jersey.mapper;

import org.mapstruct.Mapper;

import com.wetic.jersey.domain.Depense;
import com.wetic.jersey.service.dto.DepenseDTO;

@Mapper(componentModel = "spring")
public interface DepenseMapper extends GenericMapper<DepenseDTO, Depense> {

}
