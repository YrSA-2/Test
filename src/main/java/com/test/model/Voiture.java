package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Voiture {
	private long id;
	private String marqueVoiture;
	private float prixVoiture;
	private String commentaireVoiture;
	
	public Voiture() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarqueVoiture() {
		return marqueVoiture;
	}
	public void setMarqueVoiture(String marqueVoiture) {
		this.marqueVoiture = marqueVoiture;
	}
	
	public float getPrixVoiture() {
		return prixVoiture;
	}

	public void setPrixVoiture(float prixVoiture) {
		this.prixVoiture = prixVoiture;
	}

	public String getCommentaireVoiture() {
		return commentaireVoiture;
	}
	public void setCommentaireVoiture(String commentaireVoiture) {
		this.commentaireVoiture = commentaireVoiture;
	}
	
	
}
