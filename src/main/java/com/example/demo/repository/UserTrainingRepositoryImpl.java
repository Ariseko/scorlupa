package com.example.demo.repository;


import com.example.demo.dao.UserTrainingDao;
import com.example.demo.entity.UserTrainingEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserTrainingRepositoryImpl implements UserTrainingRepository {
    private final UserTrainingDao userTrainingDao;

    @Override
    public UserTrainingEntity get(Long id) {
        return userTrainingDao.findById(id).orElse(null);
    }

    @Override
    public List<UserTrainingEntity> getAll() {return userTrainingDao.findAll();}

    @Override
    public UserTrainingEntity create(UserTrainingEntity userTrainingEntity) {return userTrainingDao.save(userTrainingEntity);}

    @Override
    public void delete(Long id) {userTrainingDao.deleteById(id);}
}
