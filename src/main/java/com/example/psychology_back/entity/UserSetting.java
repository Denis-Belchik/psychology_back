package com.example.psychology_back.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ps_user_setting")
public class UserSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "theme")
    private String theme;

}
