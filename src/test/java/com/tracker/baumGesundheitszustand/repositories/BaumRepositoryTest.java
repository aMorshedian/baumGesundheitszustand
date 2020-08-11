package com.tracker.baumGesundheitszustand.repositories;

import com.tracker.baumGesundheitszustand.domains.Baum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class BaumRepositoryTest {

    @Autowired
    private BaumRepository baumRepository;

    @Test
    public void list(){
        List<Baum> baums = baumRepository.findByStrasseNameAndStrasseStadtName("Strassenummer1","Muenchen");
        assertTrue(baums.size() > 0);
    }


    @Test
    public void listInvalidStadtName(){
        List<Baum> baums = baumRepository.findByStrasseNameAndStrasseStadtName("Strassenummer1","Invalid Stadt");
        assertTrue(baums.size() == 0);
    }


    @Test
    public void listInvalidStrasseName(){
        List<Baum> baums = baumRepository.findByStrasseNameAndStrasseStadtName("Invalid Strasse","Muenchen");
        assertTrue(baums.size() == 0);
    }
}
