package com.tracker.baumGesundheitszustand.dtos;

import java.io.Serializable;
import java.math.BigDecimal;


public class GeoLocationDto implements Serializable {

    private String id;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latidude) {
        this.latitude = latidude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

}
