package com.ds.sbapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.ds.sbapp.dto.Register;
import com.ds.sbapp.service.RegisterService;

import jakarta.validation.Valid;


@Controller
public class RegisterController {

    @Autowired
    private RegisterService service;
    public void saveRegister(@Valid @RequestBody Register register){

        return service.saveRegister(register);
         
    }


}
