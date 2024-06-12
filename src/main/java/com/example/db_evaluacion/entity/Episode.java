package com.example.db_evaluacion.entity;

import jakarta.persistence.*;

@Entity
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String air_date;
    private String episode;
    private String characters;
    private String created;
    private String name;
    private String url;


}
