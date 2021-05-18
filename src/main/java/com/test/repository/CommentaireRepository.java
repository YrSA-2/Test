package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.CommentVoiture;

@Repository
public interface CommentaireRepository extends JpaRepository<CommentVoiture, Long> {

}
