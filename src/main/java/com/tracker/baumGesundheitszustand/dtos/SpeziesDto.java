package com.tracker.baumGesundheitszustand.dtos;

import java.io.Serializable;


public class SpeziesDto implements Serializable {
    private String id;
    private String botanischerName;
    private String trivialName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBotanischerName() {
        return botanischerName;
    }

    public void setBotanischerName(String botanischerName) {
        this.botanischerName = botanischerName;
    }

    public String getTrivialName() {
        return trivialName;
    }

    public void setTrivialName(String trivialName) {
        this.trivialName = trivialName;
    }
}
