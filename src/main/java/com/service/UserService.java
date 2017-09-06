package com.service;

import com.model.User;

import java.util.List;

public interface UserService {

    public User get(String id);

    public List<User> getAll();

    public String save(User user) throws Exception;

    public String remove(String id) throws Exception;

    public String update(User user) throws Exception;

}
