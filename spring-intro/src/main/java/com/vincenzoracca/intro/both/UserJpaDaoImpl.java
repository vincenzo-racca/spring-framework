package com.vincenzoracca.intro.both;

import com.vincenzoracca.intro.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserJpaDaoImpl implements UserDao {

    private String url;

    public void existsById(Long id) {
        System.out.println("existsById from JPA");
    }

    public String getUrl() { return url; }

    @Autowired
    public void setUrl(@Value("http://localhost:3306") String url) { this.url = url; }
}
