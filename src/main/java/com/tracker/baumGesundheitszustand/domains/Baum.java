package com.tracker.baumGesundheitszustand.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
public class Baum extends BaseEntity {

    private Long nummer;
    private LocalDate pflanzDatum;

    @OneToOne
    private Spezies spezies;

    @OneToOne(cascade = CascadeType.ALL)
    private GeoLocation geoLocation;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "baum")
    private List<Befund> befunds;

    @ManyToOne
    @JsonIgnore
    private Strasse strasse;

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

    public Spezies getSpezies() {
        return spezies;
    }

    public void setSpezies(Spezies spezies) {
        this.spezies = spezies;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public List<Befund> getBefunds() {
        return befunds;
    }

    public void setBefunds(List<Befund> befunds) {
        this.befunds = befunds;
    }

    public Strasse getStrasse() {
        return strasse;
    }

    public void setStrasse(Strasse strasse) {
        this.strasse = strasse;
    }
}
