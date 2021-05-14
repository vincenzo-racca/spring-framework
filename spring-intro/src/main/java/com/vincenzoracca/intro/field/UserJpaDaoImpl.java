package com.vincenzoracca.intro.field;

import com.vincenzoracca.intro.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserJpaDaoImpl implements UserDao {

    @Autowired
    @Value("http://localhost:3306")
    private String url;

    public void existsById(Long id) {
        System.out.println("existsById from JPA");
    }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }
}
