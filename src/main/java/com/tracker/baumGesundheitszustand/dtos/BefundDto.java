package com.tracker.baumGesundheitszustand.dtos;

import java.io.Serializable;
import java.time.LocalDate;

public class BefundDto implements Serializable {
    private String id;
    private LocalDate erhobenAm;
    private String beschreibung;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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


}
