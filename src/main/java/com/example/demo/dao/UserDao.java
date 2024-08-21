package com.example.demo.dao;

import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserDao extends JpaRepository<UserEntity, Long> {
    //@Query("FROM UserEntity as user where user.login = :username")
    //@Query(value = "Select * from customer where login = :username", nativeQuery = true)
    UserEntity findByLogin(String username);
}
