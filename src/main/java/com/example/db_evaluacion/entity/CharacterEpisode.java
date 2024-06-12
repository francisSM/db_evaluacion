package com.example.db_evaluacion.entity;

import jakarta.persistence.*;

@Entity
public class CharacterEpisode {
    @Id
    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;

    @Id
    @ManyToOne
    @JoinColumn(name = "episode_id")
    private Episode episode;


}
