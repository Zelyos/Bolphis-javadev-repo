package com.wetic.jersey.mapper;

import com.wetic.jersey.domain.DetailsFacture;
import com.wetic.jersey.service.dto.DetailsFactureDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-23T14:55:31+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class DetailsFactureMapperImpl implements DetailsFactureMapper {

    @Override
    public DetailsFactureDTO toEntityDTO(DetailsFacture v) {
        if ( v == null ) {
            return null;
        }

        DetailsFactureDTO detailsFactureDTO = new DetailsFactureDTO();

        if ( v.getId() != null ) {
            detailsFactureDTO.setId( v.getId() );
        }
        detailsFactureDTO.setQteProduit( v.getQteProduit() );
        detailsFactureDTO.setDescription( v.getDescription() );

        return detailsFactureDTO;
    }

    @Override
    public DetailsFacture toEntity(DetailsFactureDTO t) {
        if ( t == null ) {
            return null;
        }

        DetailsFacture detailsFacture = new DetailsFacture();

        detailsFacture.setId( t.getId() );
        detailsFacture.setQteProduit( t.getQteProduit() );
        detailsFacture.setDescription( t.getDescription() );

        return detailsFacture;
    }
}
