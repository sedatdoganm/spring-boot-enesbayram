package com.sedatdogan.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sedatdogan.model.UpdateUserRequest;
import com.sedatdogan.model.User;

@Repository
public class UserRepository {
	
	@Autowired
	public List<User> userList;

	public List<User> getAllUser(){
		return userList;
	}
	
	public User getUserById(String id) {
		User findUser = null;
		for(User user: userList) {
			if(user.getId().equals(id)) {
				findUser = user;
				break;
			}
		}
		return findUser;
	}
	
	public List<User> getUserWithParams(String firstName, String lastName){
		List<User> allUsers = getAllUser();
		
		if(firstName == null & lastName == null) {
			return allUsers;
		}
		
		List<User> filteredUsers = new ArrayList<>();
		
		for(User user : allUsers) {
			if(firstName != null && lastName != null) {
				if(user.getFirstName().equalsIgnoreCase(firstName) && user.getLastName().equalsIgnoreCase(lastName)) {
					filteredUsers.add(user);
				}
			}
			if(firstName != null && lastName == null) {
				if(user.getFirstName().equalsIgnoreCase(firstName)) {
					filteredUsers.add(user);
				}
			}
			if(firstName == null && lastName != null) {
				if(user.getLastName().equalsIgnoreCase(lastName)) {
					filteredUsers.add(user);
				}
			}
		}
		return filteredUsers;
	}
	
	public User saveUser(User newUser) {
		userList.add(newUser);
		return newUser;
	}
	
	public User deleteUser(String id) {
		User delUser = null;
		for(User user : userList) {
			if(id.equals(user.getId())) {
				delUser = user;
				break;
			}
		}
		if(delUser != null) {
	        userList.remove(delUser);
	        
		}
		return delUser;
	}
	
	private User findUserById(String id) {
		User findUser = null;
		for (User user : userList) {
			if(user.getId().equals(id)) {
				findUser = user;
				break;
			}}
			return findUser;
	}
	
	public User updateUser(String id, UpdateUserRequest updateUserRequest) {
		User findUser = findUserById(id);
		if(findUser != null) {
			deleteUser(id);
			
			User updatedUser = new User();
			updatedUser.setId(id);
			updatedUser.setFirstName(updateUserRequest.getFirstName());
			updatedUser.setLastName(updateUserRequest.getLastName());
			
			userList.add(updatedUser);
			return updatedUser;
		}
		return null;
	}
}
