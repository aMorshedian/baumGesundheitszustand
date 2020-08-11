package com.tracker.baumGesundheitszustand.repositories;

import com.tracker.baumGesundheitszustand.domains.Stadt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadtRepository extends JpaRepository<Stadt,Long> {
    public Stadt findByName(String name);
}
