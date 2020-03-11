package com.alex.apigot.dao;

import com.alex.apigot.model.Character;
import com.alex.apigot.model.House;
import com.alex.apigot.model.Kingdom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterDao extends JpaRepository<Character, Long> {
    House getHouse();
    Kingdom getKingdom();
    List<Character> getHeirs();
}
