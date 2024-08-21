package com.example.demo.service;

import com.example.demo.entity.InfoTypeEntity;
import com.example.demo.repository.InfoTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoTypeServiceImpl implements InfoTypeService {

    private final InfoTypeRepository repository;

    @Override
    public InfoTypeEntity createInfoType(InfoTypeEntity infoTypeEntity) {
        return repository.create(infoTypeEntity);
    }

    @Override
    public void deleteInfoType(Long id) {
        repository.delete(id);
    }
}
