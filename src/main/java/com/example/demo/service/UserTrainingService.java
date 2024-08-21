package com.example.demo.service;

import com.example.demo.entity.UserTrainingEntity;

public interface UserTrainingService {
    UserTrainingEntity create (UserTrainingEntity userTrainingEntity);
    void delete (Long id);
}
