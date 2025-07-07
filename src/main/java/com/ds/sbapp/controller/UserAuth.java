package com.ds.sbapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ds.sbapp.dto.User;
import com.ds.sbapp.service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserAuth {

     @Autowired
    private UserService service;
    @PostMapping("/register")
    public ResponseEntity<String> saveRegister(@Valid @RequestBody User user){

       if(!user.getPassword().equals(user.getConfirmpass())){
        return ResponseEntity.badRequest().body("Password not matched");
       }
       service.saveRegister(user);
       return ResponseEntity.ok("user registered successfully");
         
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String,String> credentials){

      boolean isValid=service.login(credentials.get("email"), credentials.get("password"));
      if(isValid){
         return  ResponseEntity.ok("user login successfully");
      }
      else{
         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid crediantails");
      }
    }

    @GetMapping("/username/{email}")
    public ResponseEntity<String> username(@PathVariable String email){
      return ResponseEntity.ok().body(service.username(email));
    }

    



}
