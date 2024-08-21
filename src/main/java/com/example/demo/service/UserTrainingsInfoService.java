package com.example.demo.service;

import com.example.demo.entity.UserTrainingsInfoEntity;

public interface UserTrainingsInfoService {
    UserTrainingsInfoEntity create(UserTrainingsInfoEntity userTrainingsInfo);
    void delete(Long id);
}
