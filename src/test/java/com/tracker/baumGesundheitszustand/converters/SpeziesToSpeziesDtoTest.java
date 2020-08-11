package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.Spezies;
import com.tracker.baumGesundheitszustand.dtos.SpeziesDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpeziesToSpeziesDtoTest {

    SpeziesToSpeziesDto speziesToSpeziesDto = new SpeziesToSpeziesDto();

    @Test
    public void toDto(){
        Spezies spezies = new Spezies();
        spezies.setId(1L);
        spezies.setTrivialName("Trivial Name");
        spezies.setBotanischerName("Botanischer Name");

        SpeziesDto dto = speziesToSpeziesDto.convert(spezies);
        assertTrue(spezies.getId().toString().equals(dto.getId()));
        assertTrue(spezies.getBotanischerName().equals(dto.getBotanischerName()));
        assertTrue(spezies.getTrivialName().equals(dto.getTrivialName()));
    }

    @Test
    public void toDtoNullEntity(){
        Spezies spezies = null;

        SpeziesDto dto = speziesToSpeziesDto.convert(spezies);
        assertTrue(dto == null);
    }
}