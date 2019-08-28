package com.wetic.jersey.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wetic.jersey.domain.Client;


/**
 * Spring Data  repository for the Client entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Override
	@Query(value="select c.*, u.first_name from client c join jhi_user u on c.user_id = u.id",nativeQuery=true)
	public Page<Client>findAll(Pageable pageable);
	
	@Query(value="select count(*) as countClient from client",nativeQuery=true)
	public Long CountAll();

}
