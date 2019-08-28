package com.wetic.jersey.mapper;

import com.wetic.jersey.domain.Facture;
import com.wetic.jersey.service.dto.FactureDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-23T14:55:31+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class FactureMapperImpl implements FactureMapper {

    @Override
    public FactureDTO toEntityDTO(Facture v) {
        if ( v == null ) {
            return null;
        }

        FactureDTO factureDTO = new FactureDTO();

        if ( v.getId() != null ) {
            factureDTO.setId( v.getId() );
        }
        factureDTO.setDateFacturation( v.getDateFacturation() );

        return factureDTO;
    }

    @Override
    public Facture toEntity(FactureDTO t) {
        if ( t == null ) {
            return null;
        }

        Facture facture = new Facture();

        facture.setId( t.getId() );
        facture.setDateFacturation( t.getDateFacturation() );

        return facture;
    }
}
