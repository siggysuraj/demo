package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
public class RegisterService {

	@Autowired

private UserRepository userRepository;
	
	public void registerUser(User user) {
		User ue = userRepository.findByEmail(user.getEmail());
		//if(ue!=null) throw Exception 
		
		User userEntity = new User();
		userEntity.setId(user.getId());
		userEntity.setName(user.getName());
		userEntity.setEmail(user.getEmail());
		userEntity.setUserId(user.getUserId());
		userEntity.setPassword(user.getPassword());
		userRepository.saveAndFlush(userEntity);		
		
	}
	
}
