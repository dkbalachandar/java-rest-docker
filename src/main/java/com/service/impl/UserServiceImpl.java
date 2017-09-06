package com.service.impl;

import com.model.User;
import com.service.UserDao;
import com.service.UserService;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;

    public User get(String id) {
        return userDao.get(id);
    }

    public List<User> getAll() {
        return userDao.getAll();
    }

    public String save(User user) throws Exception {
        user.setId(UUID.randomUUID().toString());
        return userDao.save(user);
    }

    public String remove(String id) throws Exception {
        return userDao.remove(id);
    }

    public String update(User user) throws Exception {
        return userDao.update(user);
    }
}



