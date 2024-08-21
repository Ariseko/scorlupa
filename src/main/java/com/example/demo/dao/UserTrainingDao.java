package com.example.demo.dao;

import com.example.demo.entity.UserTrainingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTrainingDao extends JpaRepository<UserTrainingEntity, Long> {
}
