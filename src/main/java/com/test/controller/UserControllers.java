package com.test.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;
import com.test.service.UserServiceImpl;

@Controller
public class UserControllers {

	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new User());
		return mav;		
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user) {
		User authUser = userService.login(user.getUsername(), user.getPassword());
		System.out.print(authUser);
		
		if (Objects.nonNull(authUser)) {
			return "redirect:/";
		} else {
			return "redirect:/login";
		}
		
	}
	
}
	
