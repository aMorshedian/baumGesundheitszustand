package com.tracker.baumGesundheitszustand.services;

import com.tracker.baumGesundheitszustand.domains.Baum;
import com.tracker.baumGesundheitszustand.exceptions.StadtNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class BaumServiceImpTest {

    @Autowired
    private BaumService baumService;

    @Test
    public void list(){

        List<Baum> baums = baumService.findBaumByStrasseNameAndStrasseStadtName("Strassenummer1","Muenchen");
        assertTrue(baums.size()>0);
    }

    @Test
    public void listInvalidStrasseName (){

        assertThrows(StadtNotFoundException.class,() -> baumService.findBaumByStrasseNameAndStrasseStadtName("Invalid Street","Muenchen"));
    }

    @Test
    public void listInvalidStadtName (){

        assertThrows(StadtNotFoundException.class, () -> baumService.findBaumByStrasseNameAndStrasseStadtName("Strassenummer1","Invalid City"));
    }
}