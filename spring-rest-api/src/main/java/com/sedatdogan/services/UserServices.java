package com.sedatdogan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sedatdogan.model.*;
import com.sedatdogan.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUser(){
		return userRepository.getAllUser();
	}
	
	public User getUserById(String id) {
		return userRepository.getUserById(id);
	}
	
	public List<User> getUserWithParams(String firstName, String lastName){
		return userRepository.getUserWithParams(firstName, lastName);
	}
	
	public User saveUser(User newUser) {
		return userRepository.saveUser(newUser);
	}
	
	public User deleteUser(String id) {
		return userRepository.deleteUser(id);
	}
	
	public User updateUser(String id, UpdateUserRequest updateUserRequest) {
		return userRepository.updateUser(id, updateUserRequest);
	}
}
