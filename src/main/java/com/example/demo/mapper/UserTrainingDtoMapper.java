package com.example.demo.mapper;

import com.example.demo.dto.UserTrainingDto;
import com.example.demo.entity.UserTrainingEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface UserTrainingDtoMapper {
    UserTrainingDto toDto (UserTrainingEntity userTrainingEntity);
    UserTrainingEntity toEntity (UserTrainingDto userTrainingDto);
}
