package com.vincenzoracca.intro;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void existsById(Long id) {
        userDao.existsById(id);
    }

}
