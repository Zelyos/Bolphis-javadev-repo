package com.wetic.jersey.mapper;

import com.wetic.jersey.domain.Depense;
import com.wetic.jersey.service.dto.DepenseDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-23T14:55:31+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class DepenseMapperImpl implements DepenseMapper {

    @Override
    public DepenseDTO toEntityDTO(Depense v) {
        if ( v == null ) {
            return null;
        }

        DepenseDTO depenseDTO = new DepenseDTO();

        if ( v.getId() != null ) {
            depenseDTO.setId( v.getId() );
        }
        depenseDTO.setLibelle( v.getLibelle() );
        depenseDTO.setMontant( v.getMontant() );
        depenseDTO.setDescription( v.getDescription() );
        depenseDTO.setDateFacturation( v.getDateFacturation() );

        return depenseDTO;
    }

    @Override
    public Depense toEntity(DepenseDTO t) {
        if ( t == null ) {
            return null;
        }

        Depense depense = new Depense();

        depense.setId( t.getId() );
        depense.setLibelle( t.getLibelle() );
        depense.setMontant( t.getMontant() );
        depense.setDescription( t.getDescription() );
        depense.setDateFacturation( t.getDateFacturation() );

        return depense;
    }
}
