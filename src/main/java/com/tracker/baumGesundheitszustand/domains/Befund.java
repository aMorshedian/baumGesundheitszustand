package com.tracker.baumGesundheitszustand.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Befund extends BaseEntity{

    private LocalDate erhobenAm;
    private String beschreibung;

    @JsonIgnore
    @ManyToOne
    private Baum baum;

    public LocalDate getErhobenAm() {
        return erhobenAm;
    }

    public void setErhobenAm(LocalDate erhobenAm) {
        this.erhobenAm = erhobenAm;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Baum getBaum() {
        return baum;
    }

    public void setBaum(Baum baum) {
        this.baum = baum;
    }
}
