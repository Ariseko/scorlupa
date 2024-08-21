package com.example.demo.repository;

import com.example.demo.entity.InfoTypeEntity;
import com.example.demo.entity.TrainingEntity;

import java.util.List;

public interface InfoTypeRepository {
    InfoTypeEntity get(Long id);
    List<InfoTypeEntity> getAll();
    InfoTypeEntity create(InfoTypeEntity infoType);
    InfoTypeEntity update(InfoTypeEntity infoType);
    void delete(Long id);
}
