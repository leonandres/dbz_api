package com.dragon.ball.z.api.lion;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Personaje {
    private int id;
    private String name;
    private String ki;
    private String maxKi;
    private String race;
    private String gender;
    private String description;
    private String image;
    private String affiliation;

    public Personaje() {
    }

    public Personaje(int id, String name, String ki, String maxKi, String race, String gender, String description, String image, String affiliation) {
        this.id = id;
        this.name = name;
        this.ki = ki;
        this.maxKi = maxKi;
        this.race = race;
        this.gender = gender;
        this.description = description;
        this.image = image;
        this.affiliation = affiliation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public String getMaxKi() {
        return maxKi;
    }

    public void setMaxKi(String maxKi) {
        this.maxKi = maxKi;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
}
