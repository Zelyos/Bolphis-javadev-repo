package com.wetic.jersey.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;



import com.wetic.jersey.service.dto.UserDTO;

public interface UserService {
	
	UserDTO save(UserDTO userDTO);
	
	Page<UserDTO> findAll(Pageable pageable);
	
	Optional<UserDTO> findById(long id);
	
	void delete(long id);
	
	Optional<UserDTO> findOneByActivationKey(String activationKey);
	
	Optional<UserDTO> findOneByResetKey(String resetKey);
    
    Optional<UserDTO> findOneByEmailIgnoreCase(String email);

    Optional<UserDTO> findOneByLogin(String login);

    Page<UserDTO> findAllByLoginNot(Pageable pageable, String login);
	

}
