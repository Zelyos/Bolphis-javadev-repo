package com.wetic.jersey.mapper;

import org.mapstruct.Mapper;

import com.wetic.jersey.domain.User;
import com.wetic.jersey.service.dto.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper extends GenericMapper<UserDTO, User> {

}
