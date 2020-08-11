package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.Befund;
import com.tracker.baumGesundheitszustand.dtos.BefundDto;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BefundToBefundDtoTest {

    BefundToBefundDto befundToBefundDto = new BefundToBefundDto();

    @Test
    public void toDto() {
        Befund befund = new Befund();
        befund.setId(1L);
        befund.setBeschreibung("this is a test.");
        befund.setErhobenAm(LocalDate.now());

        BefundDto dto = befundToBefundDto.convert(befund);

        assertTrue(befund.getId().toString().equals(dto.getId()));
        assertTrue(befund.getBeschreibung().equals(dto.getBeschreibung()));
        assertTrue(befund.getErhobenAm().equals(dto.getErhobenAm()));
    }

    @Test
    public void toDtoNullEntity() {
        Befund befund = null;
        BefundDto dto = befundToBefundDto.convert(befund);
        assertTrue(dto == null);
    }
}