package com.sedatdogan.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sedatdogan.model.*;

@Configuration
public class AppConfigs {
	
	@Bean
	public List<User> userList(){
		List<User> users = new ArrayList<>();
		users.add(new User("1","Sedat","Dogan"));
		users.add(new User("2","Sedat","Demir"));
		users.add(new User("3","Ahmet","Demir"));
		users.add(new User("4","Kenan","Sipahi"));
		users.add(new User("5","Erdem","Kaya"));
		return users;
	}
}
