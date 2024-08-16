package com.example.demo.service;

import com.example.demo.entity.TrainingEntity;

public interface TrainingService {
    TrainingEntity createTraining(TrainingEntity trainingEntity);
    void deleteTraining(Long id);
}
