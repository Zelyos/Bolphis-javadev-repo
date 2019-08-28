package com.wetic.jersey.mapper;

import com.wetic.jersey.domain.Client;
import com.wetic.jersey.service.dto.ClientDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-23T14:55:31+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public ClientDTO toEntityDTO(Client v) {
        if ( v == null ) {
            return null;
        }

        ClientDTO clientDTO = new ClientDTO();

        if ( v.getId() != null ) {
            clientDTO.setId( v.getId() );
        }
        clientDTO.setAdresse( v.getAdresse() );
        clientDTO.setLocalite( v.getLocalite() );
        clientDTO.setCategorie( v.getCategorie() );
        clientDTO.setCompte( v.getCompte() );

        return clientDTO;
    }

    @Override
    public Client toEntity(ClientDTO t) {
        if ( t == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( t.getId() );
        client.setAdresse( t.getAdresse() );
        client.setLocalite( t.getLocalite() );
        client.setCategorie( t.getCategorie() );
        client.setCompte( t.getCompte() );

        return client;
    }
}
