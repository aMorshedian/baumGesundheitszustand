package com.tracker.baumGesundheitszustand.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class BaumDto implements Serializable {
    private String id;
    private Long nummer;
    private LocalDate pflanzDatum;


    private SpeziesDto speziesDto;

    private GeoLocationDto geoLocationDto;

    private List<BefundDto> befundDtos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getNummer() {
        return nummer;
    }

    public void setNummer(Long nummer) {
        this.nummer = nummer;
    }

    public LocalDate getPflanzDatum() {
        return pflanzDatum;
    }

    public void setPflanzDatum(LocalDate pflanzDatum) {
        this.pflanzDatum = pflanzDatum;
    }

    public SpeziesDto getSpeziesDto() {
        return speziesDto;
    }

    public void setSpeziesDto(SpeziesDto speziesDto) {
        this.speziesDto = speziesDto;
    }

    public GeoLocationDto getGeoLocationDto() {
        return geoLocationDto;
    }

    public void setGeoLocationDto(GeoLocationDto geoLocationDto) {
        this.geoLocationDto = geoLocationDto;
    }

    public List<BefundDto> getBefundDtos() {
        return befundDtos;
    }

    public void setBefundDtos(List<BefundDto> befundDtos) {
        this.befundDtos = befundDtos;
    }


}
