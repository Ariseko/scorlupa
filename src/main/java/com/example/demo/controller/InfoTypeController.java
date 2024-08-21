package com.example.demo.controller;

import com.example.demo.dto.InfoTypeDto;
import com.example.demo.entity.InfoTypeEntity;
import com.example.demo.mapper.InfoTypeDtoMapper;
import com.example.demo.service.InfoTypeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping(
        value = "infoTypes",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class InfoTypeController {

    private final InfoTypeService service;
    private final InfoTypeDtoMapper mapper;

    @PostMapping
    public InfoTypeDto create(@RequestBody @Valid InfoTypeDto dto) {
        InfoTypeEntity infoType = mapper.toEntity(dto);
        infoType = service.createInfoType(infoType);
        return mapper.toDto(infoType);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        service.deleteInfoType(id);
    }
}
