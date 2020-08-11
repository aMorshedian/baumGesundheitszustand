package com.tracker.baumGesundheitszustand.domains;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public class GeoLocation extends BaseEntity{

    private BigDecimal latitude;
    private BigDecimal longitude;

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
