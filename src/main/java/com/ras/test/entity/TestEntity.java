package com.ras.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;
    String name;

}
