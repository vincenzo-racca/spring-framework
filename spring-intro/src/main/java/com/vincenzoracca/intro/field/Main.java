package com.vincenzoracca.intro.field;

import com.vincenzoracca.intro.UserService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("spring/app-context-field.xml");
        ctx.refresh();
        UserService userService = ctx.getBean(UserService.class);
        userService.existsById(1L); //"existsById from JPA"
        ctx.close();
    }
}
