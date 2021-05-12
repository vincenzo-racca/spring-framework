package com.vincenzoracca.intro;

public interface UserDao {

    void existsById(Long id);

    String getUrl();

    void setUrl(String url);
}
