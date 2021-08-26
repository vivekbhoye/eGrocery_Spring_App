package com.app.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.registration.model.User;
import com.app.registration.repository.RegistratonRepository;



@Service
public class RegistrationService {

	
	
	@Autowired
	private RegistratonRepository repo;
	public User saveUser(User user) {
	
		return repo.save(user);
	
        }
	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}
	
	
	public User fetchUserByEmailIdAndPassword(String email,String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}
   }
	

	

