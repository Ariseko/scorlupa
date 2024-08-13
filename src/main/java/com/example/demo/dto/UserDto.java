package com.example.demo.dto;

import com.example.demo.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String login;
    private String password;
    private UserRole role;
}
