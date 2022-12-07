package com.online.shopping.FinalProject;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}