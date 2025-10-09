package com.sedatdogan.main;

import com.sedatdogan.config.AppConfig;
import com.sedatdogan.model.User;
import com.sedatdogan.services.LoginService;
import com.sedatdogan.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for(User user : userService.getUserList()){
            System.out.println(user);
        }

        LoginService loginService = new LoginService();
        loginService.login();

    }
}
