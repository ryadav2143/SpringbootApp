package com.ds.sbapp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Register {
    @NotBlank(message = "please enter the name")
    private String name;

    @NotBlank(message = "Please enter the email")
    @Column(unique = true)
    @Id
    private String email;

    @NotBlank
    @Size(min = 8,max =15)
    private String password;

    @NotBlank
    private String confirmpass;
}
