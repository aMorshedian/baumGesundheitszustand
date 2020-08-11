package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.GeoLocation;
import com.tracker.baumGesundheitszustand.dtos.GeoLocationDto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GeoLocationToGeoLocationDtoTest {
    GeoLocationToGeoLocationDto geoLocationToGeoLocationDto = new GeoLocationToGeoLocationDto();

    @Test
    public void toDto(){
        GeoLocation location = new GeoLocation();
        location.setId(1L);
        location.setLongitude(new BigDecimal("111.1111"));
        location.setLatitude(new BigDecimal("99999.9999"));

        GeoLocationDto dto = geoLocationToGeoLocationDto.convert(location);

        assertTrue(location.getId().toString().equals(dto.getId()));
        assertTrue(location.getLongitude() == dto.getLongitude());
        assertTrue(location.getLatitude() == dto.getLatitude());
    }

    @Test
    public void toDtoNullEntity() {
        GeoLocation location = null;
        GeoLocationDto dto = geoLocationToGeoLocationDto.convert(location);
        assertTrue(dto==null);
    }
}