package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Voiture;
import com.test.repository.VoitureRepository;

@Service
public class VoitureServiceImpl implements VoitureService{

	@Autowired
	private VoitureRepository repos;
	
	@Override
	public List<Voiture> getVoiture() {
		
		return repos.findAll();
	}

	@Override
	public void saveVoiture(Voiture voiture) {
		repos.save(voiture);
		
	}

}
