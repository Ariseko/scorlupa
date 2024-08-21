package com.example.demo.repository;

import com.example.demo.dao.TrainingDao;
import com.example.demo.entity.TrainingEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TrainingRepositoryImpl  implements TrainigRepository{

    private final TrainingDao trainingDao;

    @Override
    public TrainingEntity getTraining(Long id) {
        return trainingDao.findById(id).orElse(null);
    }

    @Override
    public List<TrainingEntity> getTrainings() {
        return trainingDao.findAll();
    }

    @Override
    public TrainingEntity createTraining(TrainingEntity training) {
        return trainingDao.save(training);
    }

    @Override
    public TrainingEntity updateTraining(TrainingEntity training) {
        return trainingDao.save(training);
    }

    @Override
    public void deleteTraining(Long id) {
        trainingDao.deleteById(id);
    }
}
