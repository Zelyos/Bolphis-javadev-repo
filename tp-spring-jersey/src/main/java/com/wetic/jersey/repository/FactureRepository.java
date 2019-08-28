package com.wetic.jersey.repository;


import com.wetic.jersey.domain.DetailsFacture;
import com.wetic.jersey.domain.Facture;

import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;



/**
 * Spring Data  repository for the Facture entity.
 *
 */
@SuppressWarnings("unused")
@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {
	@Override
	@Query(value="select facture.id as id, date_facturation, facture.client_id, first_name  from facture join client on facture.client_id = client.id join jhi_user on client.user_id = jhi_user.id",nativeQuery = true)
	public Page<Facture>findAll(Pageable pageable);

	public Page<Facture> findByClientId(Pageable pageable, Long id);

	@Query(value="select count(*) as countFacture from facture",nativeQuery=true)
	public Long CountAll();


}
