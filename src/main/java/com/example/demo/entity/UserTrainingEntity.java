package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_trainings")
public class UserTrainingEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "start_time")
    private Date start;
    @Column(name = "end_time")
    private Date end;
    @ManyToOne
    @JoinColumn(name = "training_id")
    private TrainingEntity trainingType;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
