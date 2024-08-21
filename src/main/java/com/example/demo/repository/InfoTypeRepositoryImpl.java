package com.example.demo.repository;

import com.example.demo.dao.InfoTypeDao;
import com.example.demo.entity.InfoTypeEntity;
import com.example.demo.entity.TrainingEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class InfoTypeRepositoryImpl implements InfoTypeRepository {

    private final InfoTypeDao dao;

    @Override
    public InfoTypeEntity get(Long id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public List<InfoTypeEntity> getAll() {
        return dao.findAll();
    }

    @Override
    public InfoTypeEntity create(InfoTypeEntity infoType) {
        return dao.save(infoType);
    }

    @Override
    public InfoTypeEntity update(InfoTypeEntity infoType) {
        return dao.save(infoType);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
