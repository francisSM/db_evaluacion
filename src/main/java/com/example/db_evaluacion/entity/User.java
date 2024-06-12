package com.example.db_evaluacion.entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String universe;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

}
