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

    @ElementCollection
    private List<String> titles;

    private String player;

    @ManyToOne
    private Character father;

    @ManyToOne
    private Character mother;

    @OneToMany
    private List<Character> children;

    @ManyToOne
    private House house;

    public Character() {
    }

    public Character(String name, String born, String photo, String genre, List<String> titles, String player, Character father, Character mother, List<Character> children) {
        this.name = name;
        this.born = born;
        this.photo = photo;
        this.genre = genre;
        this.titles = titles;
        this.player = player;
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

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

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
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

    public List<Character> getChildren() {
        return children;
    }

    public void setChildren(List<Character> children) {
        this.children = children;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
