package com.tracker.baumGesundheitszustand.dtos;

import java.io.Serializable;
import java.util.List;


public class StadtDto implements Serializable {
    private String id;
    private String name;
    private String plz;



    private List<StrasseDto> strasseDtos;

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

    public List<StrasseDto> getStrasseDtos() {
        return strasseDtos;
    }

    public void setStrasseDtos(List<StrasseDto> strasseDtos) {
        this.strasseDtos = strasseDtos;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }
}
