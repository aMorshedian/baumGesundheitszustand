package com.tracker.baumGesundheitszustand.services;

import com.tracker.baumGesundheitszustand.domains.Baum;
import com.tracker.baumGesundheitszustand.domains.Stadt;
import com.tracker.baumGesundheitszustand.domains.Strasse;
import com.tracker.baumGesundheitszustand.exceptions.StadtNotFoundException;
import com.tracker.baumGesundheitszustand.repositories.BaumRepository;
import com.tracker.baumGesundheitszustand.repositories.StadtRepository;
import com.tracker.baumGesundheitszustand.repositories.StrasseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaumServiceImp implements BaumService{
    private static Logger logger = LoggerFactory.getLogger(BaumService.class);


    private final StadtRepository stadtRepository;
    private final StrasseRepository strasseRepository;
    private final BaumRepository baumRepository;
    public BaumServiceImp(StadtRepository stadtRepository, StrasseRepository strasseRepository, BaumRepository baumRepository) {
        this.stadtRepository = stadtRepository;
        this.strasseRepository = strasseRepository;
        this.baumRepository = baumRepository;
    }

    @Override
    public List<Baum> findBaumByStrasseNameAndStrasseStadtName(String strasseName, String stadtName) {
        Stadt stadt = stadtRepository.findByName(stadtName);
        if (stadt == null){

            throw new StadtNotFoundException(stadtName);
        }
        Strasse strasse = strasseRepository.findByStadtNameAndName(stadtName,strasseName);
        if (strasse == null){

            throw new StadtNotFoundException(String.format("Strasee %s in %s is not found.",strasseName,stadtName));
        }
        logger.info(String.format("Retrieve trees of city = %s and street %s",stadtName,strasseName));
        return baumRepository.findByStrasseNameAndStrasseStadtName(strasseName,stadtName);
    }
}
