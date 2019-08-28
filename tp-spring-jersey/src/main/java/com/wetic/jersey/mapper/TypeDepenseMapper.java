package com.wetic.jersey.mapper;

import org.mapstruct.Mapper;

import com.wetic.jersey.domain.TypeDepense;
import com.wetic.jersey.service.dto.TypeDepenseDTO;

@Mapper(componentModel = "spring")
public interface TypeDepenseMapper extends GenericMapper<TypeDepenseDTO, TypeDepense> {

}
