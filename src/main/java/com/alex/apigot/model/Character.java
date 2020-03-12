package com.alex.apigot.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Character implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String born;

    private String photo;

    private String genre;

    private String player;

    @ElementCollection
    @CollectionTable
    private List<String> titles;

    @ManyToOne
    private Character father;

    @ManyToOne
    private Character mother;

    @OneToMany
    private List<Character> heirs;

    @ManyToOne
    private House house;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String gener) {
        this.genre = gener;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public Character getFather() {
        return father;
    }

    public void setFather(Character father) {
        this.father = father;
    }

    public Character getMother() {
        return mother;
    }

    public void setMother(Character mother) {
        this.mother = mother;
    }

    public List<Character> getHeirs() {
        return heirs;
    }

    public void setHeirs(List<Character> children) {
        this.heirs = children;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

}
