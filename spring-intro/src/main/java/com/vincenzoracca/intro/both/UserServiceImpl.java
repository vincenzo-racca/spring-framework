package com.vincenzoracca.intro.both;

import com.vincenzoracca.intro.UserDao;
import com.vincenzoracca.intro.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void existsById(Long id) {
        userDao.existsById(id);
    }

}
