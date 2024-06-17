package com.example.psychology_back.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ps_test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "instructions")
    private String instructions;

}
