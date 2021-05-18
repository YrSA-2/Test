package com.test.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.CommentVoiture;

public interface CommentaireService {
	List<CommentVoiture> getCommentaireVoiture();
}
