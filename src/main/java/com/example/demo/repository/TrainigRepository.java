package com.example.demo.repository;

import com.example.demo.entity.TrainingEntity;

import java.util.List;

public interface TrainigRepository {

    TrainingEntity getTraining(Long id);
    List<TrainingEntity> getTrainings();
    TrainingEntity createTraining(TrainingEntity training);
    TrainingEntity updateTraining(TrainingEntity training);
    void deleteTraining(Long id);

}
