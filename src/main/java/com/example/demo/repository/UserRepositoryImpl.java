package com.example.demo.repository;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository{

    private final UserDao dao;

    @Override
    public UserEntity get(Long id) {

        return dao.findById(id).orElse(null);
    }

    @Override
    public List<UserEntity> getAll() {
        return dao.findAll();
    }

    @Override
    public UserEntity create(UserEntity user) {
        return dao.save(user);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
