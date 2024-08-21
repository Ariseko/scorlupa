package com.example.demo.repository;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository {
    UserEntity get(Long id);
    UserEntity getByLogin(String username);
    List<UserEntity> getAll();
    UserEntity create(UserEntity user);
    void delete(Long id);
}
