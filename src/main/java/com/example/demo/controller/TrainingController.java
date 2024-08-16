package com.example.demo.controller;


import com.example.demo.dto.TrainingDto;
import com.example.demo.entity.TrainingEntity;
import com.example.demo.mapper.TrainingDtoMapper;
import com.example.demo.service.TrainingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping(
        value = "trainig",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class TrainingController {

    private final TrainingService trainingService;
    private final TrainingDtoMapper trainingDtoMapper;

    @PostMapping
    public TrainingDto createTraining(@Valid @RequestBody TrainingDto trainingDto) {

        TrainingEntity trainingEntity = trainingDtoMapper.toEntity(trainingDto);
        trainingEntity = trainingService.createTraining(trainingEntity);
        return trainingDtoMapper.toDto(trainingEntity);

    }


    @DeleteMapping("{id}")
    public void deleteTraining(@PathVariable Long id) {trainingService.deleteTraining(id);}

}
