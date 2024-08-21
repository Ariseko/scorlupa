package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user_trainings_info")
public class UserTrainingsInfoEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "info_id")
    private InfoTypeEntity infoType;
    @ManyToOne
    @JoinColumn(name = "user_trianing_id")
    private UserTrainingEntity userTrainingEntity;
    @Column(name = "information")
    private String information;
}
