package com.wetic.jersey.mapper;

import com.wetic.jersey.domain.TypeDepense;
import com.wetic.jersey.service.dto.TypeDepenseDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-23T14:55:31+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class TypeDepenseMapperImpl implements TypeDepenseMapper {

    @Override
    public TypeDepenseDTO toEntityDTO(TypeDepense v) {
        if ( v == null ) {
            return null;
        }

        TypeDepenseDTO typeDepenseDTO = new TypeDepenseDTO();

        if ( v.getId() != null ) {
            typeDepenseDTO.setId( v.getId() );
        }
        typeDepenseDTO.setLibelle( v.getLibelle() );
        typeDepenseDTO.setDescription( v.getDescription() );

        return typeDepenseDTO;
    }

    @Override
    public TypeDepense toEntity(TypeDepenseDTO t) {
        if ( t == null ) {
            return null;
        }

        TypeDepense typeDepense = new TypeDepense();

        typeDepense.setId( t.getId() );
        typeDepense.setLibelle( t.getLibelle() );
        typeDepense.setDescription( t.getDescription() );

        return typeDepense;
    }
}
