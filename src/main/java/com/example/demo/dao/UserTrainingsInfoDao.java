package com.example.demo.dao;

import com.example.demo.entity.UserTrainingsInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTrainingsInfoDao extends JpaRepository<UserTrainingsInfoEntity, Long> {
}
