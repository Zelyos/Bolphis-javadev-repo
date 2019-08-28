package com.wetic.jersey.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.wetic.jersey.domain.Client;
import com.wetic.jersey.service.dto.ClientDTO;

@Mapper(componentModel = "spring", uses= {UserMapper.class})
public interface ClientMapper extends GenericMapper<ClientDTO, Client> {

	@Mapping(source="user.id", target="userId")
	@Mapping(source="user.firstname", target="clientName")
	ClientDTO toClientDTO(Client client);
	
	
}
