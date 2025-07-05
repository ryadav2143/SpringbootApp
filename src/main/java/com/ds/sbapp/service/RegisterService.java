package com.ds.sbapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.sbapp.dao.Registerdao;
import com.ds.sbapp.dto.Register;

@Service
public class RegisterService {
    @Autowired
    private Registerdao dao;
    public void saveRegister(Register register){
        return dao.saveRegister(register);
    }

}
