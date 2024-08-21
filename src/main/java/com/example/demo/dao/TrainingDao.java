package com.example.demo.dao;

import com.example.demo.entity.TrainingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingDao extends JpaRepository<TrainingEntity, Long> {
}
