package com.tracker.baumGesundheitszustand.converters;

import com.tracker.baumGesundheitszustand.domains.Spezies;
import com.tracker.baumGesundheitszustand.dtos.SpeziesDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SpeziesToSpeziesDto implements Converter<Spezies, SpeziesDto> {

    @Override
    public SpeziesDto convert(Spezies spezies) {
        if (spezies == null){
            return null;
        }
        final SpeziesDto dto = new SpeziesDto();
        dto.setId(String.valueOf(spezies.getId()));
        dto.setBotanischerName(spezies.getBotanischerName());
        dto.setTrivialName(spezies.getTrivialName());
        return dto;
    }
}
