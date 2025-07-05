package com.ds.sbapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ds.sbapp.dto.Register;
import com.ds.sbapp.repo.RegisterRepo;

@Repository
public class Registerdao {
     @Autowired
    private RegisterRepo repo;

    public Register saveRegister(Register register){
       return repo.save(register);

    }






}
