package com.example.demo.repository;

import com.example.demo.entity.InfoTypeEntity;
import com.example.demo.entity.UserTrainingsInfoEntity;

import java.util.List;

public interface UserTrainingsInfoRepository {
    UserTrainingsInfoEntity get(Long id);
    List<UserTrainingsInfoEntity> getAll();
    UserTrainingsInfoEntity create(UserTrainingsInfoEntity userTrainingsInfo);
    UserTrainingsInfoEntity update(UserTrainingsInfoEntity userTrainingsInfo);
    void delete(Long id);
}
