package com.vincenzoracca.intro.field;

import com.vincenzoracca.intro.UserDao;
import com.vincenzoracca.intro.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public void existsById(Long id) {
        userDao.existsById(id);
    }

}
