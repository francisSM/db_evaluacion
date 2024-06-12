package com.example.db_evaluacion.controller;

import com.example.db_evaluacion.entity.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.db_evaluacion.entity.*;
import com.example.db_evaluacion.repository.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private CharacterEpisodeRepository characterEpisodeRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("/characters")
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    @GetMapping("/episodes")
    public List<Episode> getAllEpisodes() {
        return episodeRepository.findAll();
    }
}
