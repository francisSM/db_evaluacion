package com.example.db_evaluacion.repository;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.db_evaluacion.entity.Character;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {}
