package com.test.service;

import java.util.List;

import com.test.model.Voiture;


public interface VoitureService {
	
	List<Voiture> getAllVoiture();
	
	public void saveVoiture(Voiture voiture);
}
