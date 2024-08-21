package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "info_types")
public class InfoTypeEntity {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
}
