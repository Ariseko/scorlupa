package com.example.demo.repository;

import com.example.demo.dao.UserTrainingsInfoDao;
import com.example.demo.entity.UserTrainingsInfoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserTrainingsRepositoryImpl implements UserTrainingsInfoRepository{

    private final UserTrainingsInfoDao dao;

    @Override
    public UserTrainingsInfoEntity get(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public List<UserTrainingsInfoEntity> getAll() {
        return dao.findAll();
    }

    @Override
    public UserTrainingsInfoEntity create(UserTrainingsInfoEntity userTrainingsInfo) {
        return dao.save(userTrainingsInfo);
    }

    @Override
    public UserTrainingsInfoEntity update(UserTrainingsInfoEntity userTrainingsInfo) {
        return dao.save(userTrainingsInfo);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
