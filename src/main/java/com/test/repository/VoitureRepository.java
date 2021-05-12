package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
