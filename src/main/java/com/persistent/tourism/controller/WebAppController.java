package com.persistent.tourism.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.persistent.tourism.entities.User;

@Controller
public class WebAppController {

	@GetMapping(path = "/")
	public String home() {
		return "home";
	}
	
	@GetMapping(path = "/login")
	public String login() {
		return "login";
	}
	
	@GetMapping(path = "/user/home")
	public String userhome(Principal principal, Model model) {
		model.addAttribute("name", "Hi " + "Mayur");
		return "userhome";
	}
	
	@GetMapping(path = "/signup")
	public String signUp() {
		return "signup";
	}
	
	@PostMapping(path = "/signup")
	public String registerUser(HttpServletRequest request) {
		System.out.println(request.getParameter("firstName"));
		System.out.println(request.getParameter("lastName"));
		System.out.println(request.getParameter("mobNo"));
		System.out.println(request.getParameter("password"));
		return "redirect:login";
	}
	
	@GetMapping(path = "/about")
	public String about() {
		return "about";
	}
	
	@GetMapping(path = "/user/about")
	public String userabout() {
		return "userabout";
	}
	
	@GetMapping(path = "/package")
	public String packages() {
		return "package";
	}
	
	@GetMapping(path = "/user/package")
	public String userpackages() {
		return "package";
	}
	
	
}
