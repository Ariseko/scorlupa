package com.example.demo.dto;

import com.example.demo.entity.TrainingEntity;
import com.example.demo.entity.UserEntity;

import java.util.Date;

public class UserTrainingDto {
    Long id;
    Date start;
    Date end;
    Integer duration;
    TrainingEntity training_type;
    UserEntity user;
}
