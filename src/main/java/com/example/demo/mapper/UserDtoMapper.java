package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public interface UserDtoMapper {

    UserDto toDto(UserEntity entity);
    UserEntity toEntity(UserDto dto);

}
