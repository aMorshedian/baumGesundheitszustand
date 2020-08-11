package com.tracker.baumGesundheitszustand.controllers;

import com.tracker.baumGesundheitszustand.converters.BaumToBaumDto;
import com.tracker.baumGesundheitszustand.dtos.BaumDto;
import com.tracker.baumGesundheitszustand.services.BaumService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/baumGesundheit")
public class BaumsController {
    private final BaumService baumService;
    private final BaumToBaumDto baumToBaumDto;

    public BaumsController(BaumService baumService, BaumToBaumDto baumToBaumDto) {
        this.baumService = baumService;
        this.baumToBaumDto = baumToBaumDto;
    }
    @Cacheable(value = "baumList")
    @GetMapping(path ="/{stadtName}/{strasseName}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BaumDto> list (@PathVariable String strasseName , @PathVariable String stadtName){
        List<BaumDto> baumDtos = new ArrayList<>();
        baumService.findBaumByStrasseNameAndStrasseStadtName(strasseName,stadtName)
                .forEach( (b) -> baumDtos.add(baumToBaumDto.convert(b)));
        return  baumDtos;
    }
}
