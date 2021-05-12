package com.vincenzoracca.intro.javaconf.config;

import com.vincenzoracca.intro.UserDao;
import com.vincenzoracca.intro.UserJpaDaoImpl;
import com.vincenzoracca.intro.UserService;
import com.vincenzoracca.intro.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    UserDao userDao() {
        UserDao userDao = new UserJpaDaoImpl();
        userDao.setUrl("http://localhost:3306");
        return userDao;
    }

    @Bean
    UserService userService() {
        return new UserServiceImpl(userDao());
    }
}
