package com.example.demo.mapper;

import com.example.demo.dto.TrainingDto;
import com.example.demo.entity.TrainingEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface TrainingDtoMapper {
    TrainingDto toDto(TrainingEntity trainingEntity);
    TrainingEntity toEntity(TrainingDto dto);
}
