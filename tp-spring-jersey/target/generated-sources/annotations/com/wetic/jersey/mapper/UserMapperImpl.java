package com.wetic.jersey.mapper;

import com.wetic.jersey.domain.User;
import com.wetic.jersey.service.dto.UserDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-23T14:55:31+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toEntityDTO(User v) {
        if ( v == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        if ( v.getId() != null ) {
            userDTO.setId( v.getId() );
        }
        userDTO.setLogin( v.getLogin() );
        userDTO.setPassword( v.getPassword() );
        userDTO.setFirstName( v.getFirstName() );
        userDTO.setLastName( v.getLastName() );
        userDTO.setEmail( v.getEmail() );
        userDTO.setActivated( v.getActivated() );
        userDTO.setLangKey( v.getLangKey() );
        userDTO.setActivationKey( v.getActivationKey() );
        userDTO.setResetKey( v.getResetKey() );
        userDTO.setResetDate( v.getResetDate() );

        return userDTO;
    }

    @Override
    public User toEntity(UserDTO t) {
        if ( t == null ) {
            return null;
        }

        User user = new User();

        user.setId( t.getId() );
        user.setLogin( t.getLogin() );
        user.setPassword( t.getPassword() );
        user.setFirstName( t.getFirstName() );
        user.setLastName( t.getLastName() );
        user.setEmail( t.getEmail() );
        user.setActivated( t.isActivated() );
        user.setActivationKey( t.getActivationKey() );
        user.setResetKey( t.getResetKey() );
        user.setResetDate( t.getResetDate() );
        user.setLangKey( t.getLangKey() );

        return user;
    }
}
