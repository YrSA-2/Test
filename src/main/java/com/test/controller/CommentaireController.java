package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.service.CommentaireService;

@Controller
public class CommentaireController {

	@Autowired
	private CommentaireService service;
	
	@GetMapping("/commentaire")
	public String commentaire(Model model) {
		model.addAttribute("commentaire",service.getCommentaireVoiture());
		return "pages/commentaire";
	}
}
