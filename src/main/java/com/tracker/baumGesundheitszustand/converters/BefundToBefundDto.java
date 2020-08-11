package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.Befund;
import com.tracker.baumGesundheitszustand.dtos.BefundDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BefundToBefundDto implements Converter<Befund, BefundDto> {
    @Override
    public BefundDto convert(Befund befund) {
        if (befund == null){
            return null;
        }
        final BefundDto dto = new BefundDto();
        dto.setId(String.valueOf(befund.getId()));
        dto.setBeschreibung(befund.getBeschreibung());
        dto.setErhobenAm(befund.getErhobenAm());
        return dto;
    }
}
