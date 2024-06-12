package com.example.db_evaluacion.entity;

import jakarta.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int dimension;
    private String created;
    private String type;
    private String name;
    private String residents_length;
    private String url;

}
