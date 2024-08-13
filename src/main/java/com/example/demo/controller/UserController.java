package com.example.demo.controller;

import com.example.demo.autarization.UserProvider;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserDtoMapper;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping(
        value = "user",
        produces = MediaType.APPLICATION_JSON_VALUE
)

public class UserController {

    private final UserService service;
    private final UserDtoMapper mapper;

    @PostMapping
    public UserDto create(@Valid @RequestBody UserDto dto) {
        UserEntity entity = mapper.toEntity(dto);
        entity = service.create(entity);
        return mapper.toDto(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
