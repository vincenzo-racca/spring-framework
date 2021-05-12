package com.vincenzoracca.intro.factory;

import com.vincenzoracca.intro.UserService;

public class Main {

    public static void main(String... args) {
        UserService userService = UserFactory.getInstance().getUserService();
        userService.existsById(1L); //"existsById from JPA"
    }
}
