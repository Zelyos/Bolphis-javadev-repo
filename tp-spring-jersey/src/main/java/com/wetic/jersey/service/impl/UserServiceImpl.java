package com.wetic.jersey.service.impl;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wetic.jersey.domain.User;
import com.wetic.jersey.mapper.UserMapper;
import com.wetic.jersey.repository.UserRepository;
import com.wetic.jersey.service.UserService;
import com.wetic.jersey.service.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	private final UserMapper userMapper;
	public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
		super();
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}
	@Override
	public UserDTO save(UserDTO userDTO) {
		User user = userMapper.toEntity(userDTO);
		user = userRepository.save(user);
		return userMapper.toEntityDTO(user);
	}
	@Override
	public Page<UserDTO> findAll(Pageable pageable) {
		return userRepository.findAll(pageable).map(userMapper::toEntityDTO);
	}
	@Override
	public Optional<UserDTO> findById(long id) {
		return userRepository.findById(id).map(userMapper::toEntityDTO);
	}
	@Override
	public void delete(long id) {
		userRepository.deleteById(id);
		
	}
	@Override
	public Optional<UserDTO> findOneByActivationKey(String activationKey) {
		return userRepository.findOneByActivationKey(activationKey).map(userMapper::toEntityDTO);
	}
	@Override
	public Optional<UserDTO> findOneByResetKey(String resetKey) {
		return userRepository.findOneByResetKey(resetKey).map(userMapper::toEntityDTO);
	}
	@Override
	public Optional<UserDTO> findOneByEmailIgnoreCase(String email) {
		return userRepository.findOneByEmailIgnoreCase(email).map(userMapper::toEntityDTO);
	}
	@Override
	public Optional<UserDTO> findOneByLogin(String login) {
		return userRepository.findOneByLogin(login).map(userMapper::toEntityDTO);
	}
	@Override
	public Page<UserDTO> findAllByLoginNot(Pageable pageable, String login) {
		return userRepository.findAllByLoginNot(pageable, login).map(userMapper::toEntityDTO);
	}
	
	

}
