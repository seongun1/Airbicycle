package com.example.Airbicycle.dto;

import com.example.Airbicycle.domain.Role;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SignupRequest {
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String nickname;
    private Role role;
}