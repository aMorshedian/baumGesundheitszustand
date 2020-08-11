package com.tracker.baumGesundheitszustand.repositories;

import com.tracker.baumGesundheitszustand.domains.Baum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaumRepository extends JpaRepository<Baum,Long> {

    public List<Baum> findByStrasseNameAndStrasseStadtName (String strasseName, String stadtName);
}
