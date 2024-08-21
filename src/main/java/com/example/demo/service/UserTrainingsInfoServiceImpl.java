package com.example.demo.service;

import com.example.demo.entity.UserTrainingsInfoEntity;
import com.example.demo.repository.UserTrainingsInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserTrainingsInfoServiceImpl implements UserTrainingsInfoService {

    private final UserTrainingsInfoRepository repository;

    @Override
    public UserTrainingsInfoEntity create(UserTrainingsInfoEntity userTrainingsInfo) {
        return repository.create(userTrainingsInfo);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
