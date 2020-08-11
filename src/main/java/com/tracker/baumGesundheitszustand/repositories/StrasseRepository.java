package com.tracker.baumGesundheitszustand.repositories;

import com.tracker.baumGesundheitszustand.domains.Strasse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StrasseRepository extends JpaRepository<Strasse,Long> {
    public Strasse findByStadtNameAndName(String stadtStrasse, String name);
}
