package com.wetic.jersey.repository;

import com.wetic.jersey.domain.User;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.time.Instant;

/**
 * Spring Data JPA repository for the {@link User} entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

        Optional<User> findOneByActivationKey(String activationKey);

        Optional<User> findOneByResetKey(String resetKey);
    
        Optional<User> findOneByEmailIgnoreCase(String email);
    
        Optional<User> findOneByLogin(String login);
    
    
        Page<User> findAllByLoginNot(Pageable pageable, String login);
        
        Optional<User> findOneById(Long id);

}