package com.ds.sbapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.sbapp.dao.UserDao;
import com.ds.sbapp.dto.User;

@Service
public class UserService {

     @Autowired
    private  UserDao dao;
    public User saveRegister(User register){
        return dao.saveRegister(register);
    }

    public boolean login(String email,String password){
        Optional<User> userOpt=dao.fetchByEmail(email);
        return userOpt.isPresent() && userOpt.get().getPassword().equals(password);
    }

    public  String username(String email){
        Optional<User> username=dao.fetchByEmail(email);
        return username.get().getName();
    } 


}
