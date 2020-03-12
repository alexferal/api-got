package com.alex.apigot.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class House implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String coatOfArms;

    private String photo;

    private String houseMotto;

    @OneToMany
    private List<Character> members;

    @ManyToOne
    private Kingdom kingdom;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoatOfArms() {
        return coatOfArms;
    }

    public void setCoatOfArms(String coatOfArms) {
        this.coatOfArms = coatOfArms;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHouseMotto() {
        return houseMotto;
    }

    public void setHouseMotto(String houseMotto) {
        this.houseMotto = houseMotto;
    }

    public List<Character> getMembers() {
        return members;
    }

    public void setMembers(List<Character> members) {
        this.members = members;
    }

    public Kingdom getKingdom() {
        return kingdom;
    }

    public void setKingdom(Kingdom kingdom) {
        this.kingdom = kingdom;
    }
}
