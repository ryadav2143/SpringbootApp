package com.ds.sbapp.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.sbapp.dto.User;
import com.ds.sbapp.repo.UserRepo;

@Repository
public class UserDao {
   @Autowired
   private UserRepo repo;

   public User saveRegister(User user) {
      return repo.save(user);

   }

   public Optional<User> fetchByEmail(String email) {
      Optional<User> user = repo.findById(email);
      return user;
   }

}
