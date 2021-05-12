package com.vincenzoracca.intro.factory;

import com.vincenzoracca.intro.UserDao;
import com.vincenzoracca.intro.UserService;

import java.util.Properties;

public class UserFactory {

    private static UserFactory instance;
    private UserDao userDao;
    private UserService userService;

    private Properties properties;

    private UserFactory() {
        try {
            properties = new Properties();
            properties.load(this.getClass().getResourceAsStream("/user.properties"));

            userDao = (UserDao) Class.forName(properties.getProperty("userDao")).getDeclaredConstructor().newInstance();
            userDao.setUrl("http://localhost:3306");
            userService = (UserService) Class.forName(properties.getProperty("userService")).getDeclaredConstructor(UserDao.class).newInstance(userDao);
        }
        catch (Exception e) {
            System.err.println("Unable to create the context");
        }

    }

    static {
        instance = new UserFactory();
    }

    public static UserFactory getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public UserService getUserService() {
        return userService;
    }
}
