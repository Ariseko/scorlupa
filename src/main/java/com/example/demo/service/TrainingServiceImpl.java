package com.example.demo.service;


import com.example.demo.entity.TrainingEntity;
import com.example.demo.repository.TrainigRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrainingServiceImpl implements TrainingService {

    private final TrainigRepository trainigRepository;

    @Override
    public TrainingEntity createTraining(TrainingEntity trainingEntity) {
        return trainigRepository.createTraining(trainingEntity);
    }

    @Override
    public void deleteTraining(Long id) {
        trainigRepository.deleteTraining(id);
    }
}
