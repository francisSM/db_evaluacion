package com.example.db_evaluacion.entity;

import jakarta.persistence.*;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String status;
    private String created;
    private String gender;
    private String species;
    private String img;
    private String name;
    private String url;

    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
