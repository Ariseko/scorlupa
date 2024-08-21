package com.example.demo.controller;

import com.example.demo.dto.UserTrainingsInfoDto;
import com.example.demo.entity.InfoTypeEntity;
import com.example.demo.entity.UserTrainingsInfoEntity;
import com.example.demo.mapper.UserTrainingsInfoMapper;
import com.example.demo.service.UserTrainingsInfoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping(
        value = "userTrainingsInfo",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class UserTrainingsInfoController {
    private final UserTrainingsInfoService service;
    private final UserTrainingsInfoMapper mapper;

    @PostMapping
    public UserTrainingsInfoDto create(@RequestBody @Valid UserTrainingsInfoDto dto) {
        UserTrainingsInfoEntity entity = mapper.toEntity(dto);
        entity = service.create(entity);
        return mapper.toDto(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }


}
