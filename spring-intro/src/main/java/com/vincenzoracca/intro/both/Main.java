package com.vincenzoracca.intro.both;

import com.vincenzoracca.intro.UserService;
import com.vincenzoracca.intro.both.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {

    public static void main(String... args) {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(
                        AppConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.existsById(1L); //"existsById from JPA"
    }
}
