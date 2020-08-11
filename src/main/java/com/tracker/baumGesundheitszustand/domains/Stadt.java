package com.tracker.baumGesundheitszustand.domains;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Stadt extends BaseEntity {

    private String name;
    private String plz;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "stadt")
    private List<Strasse> strasses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Strasse> getStrasses() {
        return strasses;
    }

    public void setStrasses(List<Strasse> strasses) {
        this.strasses = strasses;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }
}
