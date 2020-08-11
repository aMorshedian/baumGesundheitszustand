package com.tracker.baumGesundheitszustand.dtos;

import java.io.Serializable;
import java.util.List;


public class StrasseDto implements Serializable {
    private String id;
    private String name;
    private String verwaltungsKuerzel;


    private List<BaumDto> baumDtos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerwaltungsKuerzel() {
        return verwaltungsKuerzel;
    }

    public void setVerwaltungsKuerzel(String verwaltungsKuerzel) {
        this.verwaltungsKuerzel = verwaltungsKuerzel;
    }

    public List<BaumDto> getBaumDtos() {
        return baumDtos;
    }

    public void setBaumDtos(List<BaumDto> baumDtos) {
        this.baumDtos = baumDtos;
    }

    
}
