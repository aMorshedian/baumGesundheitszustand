package com.tracker.baumGesundheitszustand.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Strasse extends BaseEntity{

    private String name;
    private String verwaltungsKuerzel;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "strasse")
    private List<Baum> baums;

    @JsonIgnore
    @ManyToOne
    private Stadt stadt;

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

    public List<Baum> getBaums() {
        return baums;
    }

    public void setBaums(List<Baum> baums) {
        this.baums = baums;
    }

    public Stadt getStadt() {
        return stadt;
    }

    public void setStadt(Stadt stadt) {
        this.stadt = stadt;
    }
}
