package com.tracker.baumGesundheitszustand.services;

import com.tracker.baumGesundheitszustand.domains.Baum;

import java.util.List;

public interface BaumService {

    public List<Baum> findBaumByStrasseNameAndStrasseStadtName(String strassName, String strasseStadtName);
}
