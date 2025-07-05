package com.ds.sbapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ds.sbapp.dto.Register;
import com.ds.sbapp.service.RegisterService;

import jakarta.validation.Valid;


@Controller
public class RegisterController {

    @Autowired
    private RegisterService service;
    @PostMapping("/save")
    public ResponseEntity<String> saveRegister(@Valid @RequestBody Register register){

       if(!register.getPassword().equals(register.getConfirmpass())){
        return ResponseEntity.badRequest().body("Password not matched");
       }
       service.saveRegister(register);
       return ResponseEntity.ok("user register successfully");
         
    }


}
