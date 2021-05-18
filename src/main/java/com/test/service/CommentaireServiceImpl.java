package com.test.service;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.CommentVoiture;
import com.test.repository.CommentaireRepository;

@Service
public class CommentaireServiceImpl implements CommentaireService{
	
	@Autowired
	private CommentaireRepository repos;

	@Override
	public List<CommentVoiture> getCommentaireVoiture() {
		
		return repos.findAll();
	}
}
