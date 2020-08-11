package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.Baum;
import com.tracker.baumGesundheitszustand.dtos.BaumDto;
import com.tracker.baumGesundheitszustand.dtos.BefundDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BaumToBaumDto implements Converter<Baum, BaumDto> {
    private final BefundToBefundDto befundToBefundDto;
    private final GeoLocationToGeoLocationDto geoLocationToGeoLocationDto;
    private final SpeziesToSpeziesDto speziesToSpeziesDto;

    public BaumToBaumDto(BefundToBefundDto befundToBefundDto, GeoLocationToGeoLocationDto geoLocationToGeoLocationDto, SpeziesToSpeziesDto speziesToSpeziesDto) {
        this.befundToBefundDto = befundToBefundDto;
        this.geoLocationToGeoLocationDto = geoLocationToGeoLocationDto;
        this.speziesToSpeziesDto = speziesToSpeziesDto;
    }

    @Override
    public BaumDto convert(Baum baum) {
        if (baum == null ){
            return null;
        }
        final BaumDto dto = new BaumDto();
        dto.setId(String.valueOf(baum.getId()));
        dto.setNummer(baum.getNummer());
        dto.setPflanzDatum(baum.getPflanzDatum());
        dto.setGeoLocationDto(geoLocationToGeoLocationDto.convert(baum.getGeoLocation()));
        dto.setSpeziesDto(speziesToSpeziesDto.convert(baum.getSpezies()));
        if (baum.getBefunds() != null &&
            baum.getBefunds().size() > 0){
            List<BefundDto> befundDtos = new ArrayList<>();

            baum.getBefunds()
                    .forEach((b) -> befundDtos.add(befundToBefundDto.convert(b)));
            dto.setBefundDtos(befundDtos);
        }
        return dto;
    }
}
