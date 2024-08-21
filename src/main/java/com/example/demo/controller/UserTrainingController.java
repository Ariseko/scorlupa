package com.example.demo.controller;

import com.example.demo.dto.UserTrainingDto;
import com.example.demo.entity.UserTrainingEntity;
import com.example.demo.mapper.UserTrainingDtoMapper;
import com.example.demo.service.UserTrainingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping(
        value = "userTraining",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class UserTrainingController {

    private final UserTrainingService userTrainingService;
    private final UserTrainingDtoMapper userTrainingDtoMapper;

    @PostMapping
    public UserTrainingDto createUserTraining(@RequestBody @Valid UserTrainingDto userTrainingDto) {
        UserTrainingEntity userTrainingEntity = userTrainingDtoMapper.toEntity(userTrainingDto);
        userTrainingEntity = userTrainingService.create(userTrainingEntity);
        return userTrainingDtoMapper.toDto(userTrainingEntity);
    }

    @DeleteMapping("{id}")
    public void deleteUserTraining(@PathVariable Long id) {
        userTrainingService.delete(id);
    }

}
