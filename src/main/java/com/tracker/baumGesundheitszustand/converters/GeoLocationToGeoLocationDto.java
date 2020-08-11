package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.GeoLocation;
import com.tracker.baumGesundheitszustand.dtos.GeoLocationDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GeoLocationToGeoLocationDto implements Converter<GeoLocation, GeoLocationDto> {
    @Override
    public GeoLocationDto convert(GeoLocation geoLocation) {
        if (geoLocation == null){
            return null;
        }
        final GeoLocationDto geoLocationDto= new GeoLocationDto();
        geoLocationDto.setId(String.valueOf(geoLocation.getId()));
        geoLocationDto.setLatitude(geoLocation.getLatitude());
        geoLocationDto.setLongitude(geoLocation.getLongitude());
        return geoLocationDto;
    }
}
