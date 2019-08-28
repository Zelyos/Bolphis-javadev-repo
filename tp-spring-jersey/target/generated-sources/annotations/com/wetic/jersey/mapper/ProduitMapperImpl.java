package com.wetic.jersey.mapper;

import com.wetic.jersey.domain.Produit;
import com.wetic.jersey.service.dto.ProduitDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-08-23T14:55:31+0200",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class ProduitMapperImpl implements ProduitMapper {

    @Override
    public ProduitDTO toEntityDTO(Produit v) {
        if ( v == null ) {
            return null;
        }

        ProduitDTO produitDTO = new ProduitDTO();

        if ( v.getId() != null ) {
            produitDTO.setId( v.getId() );
        }
        produitDTO.setLibelle( v.getLibelle() );
        produitDTO.setPrix( v.getPrix() );
        produitDTO.setQteStock( v.getQteStock() );
        produitDTO.setDescription( v.getDescription() );

        return produitDTO;
    }

    @Override
    public Produit toEntity(ProduitDTO t) {
        if ( t == null ) {
            return null;
        }

        Produit produit = new Produit();

        produit.setId( t.getId() );
        produit.setLibelle( t.getLibelle() );
        produit.setPrix( t.getPrix() );
        produit.setQteStock( t.getQteStock() );
        produit.setDescription( t.getDescription() );

        return produit;
    }
}
