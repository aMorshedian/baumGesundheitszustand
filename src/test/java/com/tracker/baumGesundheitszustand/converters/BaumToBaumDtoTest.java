package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.Baum;
import com.tracker.baumGesundheitszustand.domains.Befund;
import com.tracker.baumGesundheitszustand.domains.GeoLocation;
import com.tracker.baumGesundheitszustand.domains.Spezies;
import com.tracker.baumGesundheitszustand.dtos.BaumDto;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BaumToBaumDtoTest {
    private GeoLocationToGeoLocationDto geoLocationToGeoLocationDto = new GeoLocationToGeoLocationDto();
    private BefundToBefundDto befundToBefundDto = new BefundToBefundDto();
    private SpeziesToSpeziesDto speziesToSpeziesDto = new SpeziesToSpeziesDto();
    private BaumToBaumDto baumToBaumDto = new BaumToBaumDto(befundToBefundDto,geoLocationToGeoLocationDto,speziesToSpeziesDto);

    @Test
    public void toDto(){

        Baum baum = createBaum();
        BaumDto dto = baumToBaumDto.convert(baum);
        assertTrue(baum.getId().toString().equals(dto.getId()));
        assertTrue(baum.getNummer() == dto.getNummer());
        assertTrue(baum.getPflanzDatum() == dto.getPflanzDatum());
        assertTrue(baum.getSpezies().getId().toString().equals(dto.getSpeziesDto().getId()));
        assertTrue(baum.getGeoLocation().getId().toString().equals(dto.getGeoLocationDto().getId()));
        assertTrue(baum.getBefunds().size() == dto.getBefundDtos().size());
    }

    @Test
    public void toDtoNullEntity(){

        Baum baum = null;
        BaumDto dto = baumToBaumDto.convert(baum);
        assertTrue(dto == null);
    }
    public Baum createBaum(){
        Baum baum = new Baum();
        baum.setId(1L);
        baum.setNummer(22L);
        baum.setPflanzDatum(LocalDate.now());
        Spezies spezies = new Spezies();
        spezies.setId(1L);
        spezies.setTrivialName("Trivial Name");
        spezies.setBotanischerName("Botanischer Name");
        baum.setSpezies(spezies);
        Befund befund = new Befund();
        befund.setId(1L);
        befund.setBeschreibung("this is a test.");
        befund.setErhobenAm(LocalDate.now());
        baum.setBefunds(Collections.singletonList(befund));
        GeoLocation location = new GeoLocation();
        location.setId(1L);
        location.setLongitude(new BigDecimal("111.1111"));
        location.setLatitude(new BigDecimal("99999.9999"));
        baum.setGeoLocation(location);
        return baum;
    }

}