package com.example.demo.mapper;

import com.example.demo.dto.UserTrainingsInfoDto;
import com.example.demo.entity.UserTrainingsInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface UserTrainingsInfoMapper {
    UserTrainingsInfoDto toDto(UserTrainingsInfoEntity trainingEntity);
    UserTrainingsInfoEntity toEntity(UserTrainingsInfoDto dto);
}
