package com.ras.test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "test_entity_seq")
    @SequenceGenerator(name = "test_entity_seq", sequenceName = "next_val", allocationSize = 1)
    private int id;

    String name;

}
