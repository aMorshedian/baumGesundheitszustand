package com.tracker.baumGesundheitszustand.domains;

import javax.persistence.Entity;

@Entity
public class Spezies extends BaseEntity{

    private String botanischerName;
    private String trivialName;

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
