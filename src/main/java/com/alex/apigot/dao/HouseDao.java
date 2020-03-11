package com.alex.apigot.dao;

import com.alex.apigot.model.Character;
import com.alex.apigot.model.Kingdom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HouseDao extends JpaRepository<HouseDao, Long> {
    List<Character> getMembers();
    Kingdom getKingdom();
}
