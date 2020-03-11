package com.alex.apigot.dao;

import com.alex.apigot.model.House;
import com.alex.apigot.model.Kingdom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KingdomDao extends JpaRepository<Kingdom, Long> {
    List<House> getHouses();
}
