package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commentaire")
public class CommentVoiture {

	private Long id;
	private String commentaire;
	private int idVoiture;
	public CommentVoiture() {
		
	}
	public CommentVoiture(Long id, String commentaire, int idVoiture) {
		this.id = id;
		this.commentaire = commentaire;
		this.idVoiture = idVoiture;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idC")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "commentaire")
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	@Column(name = "id_voiture")
	public int getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}
	
	
	
}
