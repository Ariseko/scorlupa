package com.example.demo.service;

import com.example.demo.entity.InfoTypeEntity;

public interface InfoTypeService {
    InfoTypeEntity createInfoType(InfoTypeEntity infoTypeEntity);
    void deleteInfoType(Long id);
}
