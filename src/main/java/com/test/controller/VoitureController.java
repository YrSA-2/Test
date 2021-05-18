package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.service.VoitureService;
import com.test.model.Voiture;

@Controller
public class VoitureController {

	@Autowired
	private VoitureService service;
	
	
	@GetMapping("/newVoiture")
	public String newVoitureForm(Model model) {
		Voiture voiture = new Voiture();
		model.addAttribute("newVoitureForm", voiture);
		
		return "pages/voitureForm";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String saveVoiture(@ModelAttribute("voiture") Voiture voiture) {
		service.saveVoiture(voiture);
		return "redirect:/listeVoiture";
	}
	
	@GetMapping("/pageAdmin")
	public String pageAdmin(Model model) {
		model.addAttribute("listVoiture",service.getVoiture());
		return "pages/pageAdmin";
	}
	
	@GetMapping("/listeVoiture")
	public String listVoiture(Model model) {
		model.addAttribute("listVoiture",service.getVoiture());
		return "pages/listeVoiture";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("listVoiture",service.getVoiture());
		return "pages/listeVoiture";
	}
	
	
}
