package com.example.demo.mapper;

import com.example.demo.dto.InfoTypeDto;
import com.example.demo.dto.TrainingDto;
import com.example.demo.entity.InfoTypeEntity;
import com.example.demo.entity.TrainingEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")

public interface InfoTypeDtoMapper {
    InfoTypeDto toDto(InfoTypeEntity infoTypeEntity);
    InfoTypeEntity toEntity(InfoTypeDto dto);
}
