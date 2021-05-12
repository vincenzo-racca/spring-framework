package com.vincenzoracca.intro;

public class UserJdbcDaoImpl implements UserDao {

    private String url;

    public void existsById(Long id) {
        System.out.println("existsById from JDBC");
    }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }
}
