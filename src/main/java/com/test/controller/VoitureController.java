package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;
import com.test.model.Voiture;
import com.test.service.UserServiceImpl;
import com.test.service.VoitureService;

@Controller
public class VoitureController {
	
	@Autowired
	private VoitureService voitureService;
	
	
	@GetMapping("/")
	public String home() {
		return "pages/home";		
	}
	
	@GetMapping("/listVoiture")
	public String listeVoiture(Model model) {
		List<Voiture> listVoiture = voitureService.getAllVoiture();
		model.addAttribute("listeVoiture", listVoiture);
		
		return "pages/listeVoiture";
	}
	
	@GetMapping("/newVoiture")
	public String newVoitureForm(Model model) {
		Voiture voiture = new Voiture();
		model.addAttribute("newVoitureForm", voiture);
		
		return "pages/voitureForm";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveVoiture(@ModelAttribute("voiture") Voiture voiture) {
		voitureService.saveVoiture(voiture);
		return "redirect:/listVoiture";
	}
	
	@GetMapping("/connexion")
	public String connexion() {
		return "pages/connect";
	}
}
