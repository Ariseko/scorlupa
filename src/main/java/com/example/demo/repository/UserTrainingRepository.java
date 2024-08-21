package com.example.demo.repository;

import com.example.demo.entity.TrainingEntity;
import com.example.demo.entity.UserTrainingEntity;

import java.util.List;

public interface UserTrainingRepository {
    UserTrainingEntity get (Long id);
    List<UserTrainingEntity> getAll ();
    UserTrainingEntity create(UserTrainingEntity userTrainingEntity);
    void delete (Long id);
}
