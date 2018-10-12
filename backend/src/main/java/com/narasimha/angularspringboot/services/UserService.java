package com.narasimha.angularspringboot.services;

import com.narasimha.angularspringboot.model.User;

import java.util.List;

public interface UserService {

    public User create(User user);

    public User delete(int id) ;

    public List findAll() ;

    public User findById(long id);

    public User update(User user);
}
