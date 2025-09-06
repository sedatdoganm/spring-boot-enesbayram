package com.sedatdogan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sedatdogan.model.UpdateUserRequest;
import com.sedatdogan.model.User;
import com.sedatdogan.services.UserServices;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/rest/api/user")
public class RestUserController {
	
	@Autowired
	UserServices userService;
	
	@GetMapping(path = "/list")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping(path = "/list/{id}")
	public User getUserById(@PathVariable (name = "id") String id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/with-params")
	public List<User> getUserWithParams(
	        @RequestParam(name = "firstName", required = false) String firstName,
	        @RequestParam(name = "lastName", required = false) String lastName) {
	    return userService.getUserWithParams(firstName, lastName);
	}
	
	
	@PostMapping("/save-user")
	public User saveUser(@RequestBody User newUser) {
		return userService.saveUser(newUser);
	}
	
	@DeleteMapping("/delete-user/{id}")
	public User deleteUser(@PathVariable (name = "id") String id) {
		return userService.deleteUser(id);
	}
	
	@PutMapping("/update-user/{id}")
	public User updateUser(
			@PathVariable (name = "id") String id,
			@RequestBody UpdateUserRequest updateUserRequest) 
	{
		return userService.updateUser(id, updateUserRequest);
	}

}
