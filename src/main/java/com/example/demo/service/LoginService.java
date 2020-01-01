package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

import com.example.demo.model.Login;
//import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@Service
@Component
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;	

	/*public User authenticateLogin(Login userLogin) throws Exception{

		User userentity = userRepository.findOne(userLogin.getUserId());
	
		User user=new User();
		
		user.setEmail(userentity.getEmail());
		user.setName(userentity.getName());
		user.setPassword(userentity.getPassword());
		user.setUserId(userentity.getUserId());
		
		if(!(user.getPassword().equals(userLogin.getPassword()))){
			throw new Exception(
					"LoginService.INVALID_CREDENTIALS");
		}
			return user;		
		} */

}