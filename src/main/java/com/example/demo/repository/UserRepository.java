package com.example.demo.repository;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;

import java.util.List;

public interface UserRepository {
    UserEntity get(Long id);
    List<UserEntity> getAll();
    UserEntity create(UserEntity user);
    void delete(Long id);
}
