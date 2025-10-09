package com.sedatdogan.config;

import com.sedatdogan.model.User;
import com.sedatdogan.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService(){
        UserService userService = new UserService();

        List<User> userList = new ArrayList<>();
        userList.add(new User("Sedat"));
        userList.add(new User("Dogan"));
        userService.setUserList(userList);

        return userService;
    }
}
