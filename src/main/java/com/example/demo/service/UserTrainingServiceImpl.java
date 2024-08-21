package com.example.demo.service;

import com.example.demo.entity.UserTrainingEntity;
import com.example.demo.repository.UserTrainingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserTrainingServiceImpl implements  UserTrainingService{
    private final UserTrainingRepository userTrainingRepository;

    @Override
    public UserTrainingEntity create(UserTrainingEntity userTrainingEntity) {
        return userTrainingRepository.create(userTrainingEntity);
    }

    @Override
    public void delete(Long id) {
        userTrainingRepository.delete(id);
    }
}
