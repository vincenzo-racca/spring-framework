package com.vincenzoracca.intro;

public class UserJpaDaoImpl implements UserDao {

    private String url;

    public void existsById(Long id) {
        System.out.println("existsById from JPA");
    }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }
}
