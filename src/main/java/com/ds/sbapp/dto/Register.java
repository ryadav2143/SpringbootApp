package com.ds.sbapp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Register {
    @NotBlank(message = "please enter the name")
    private String name;

    @NotBlank(message = "Please enter the email")
    @Column(unique = true)
    private String email;

    @NotBlank
    @Min(value = 8)
    @Max(value=15)
    private String password;

    @NotBlank
    private String comfirmpass;
}
