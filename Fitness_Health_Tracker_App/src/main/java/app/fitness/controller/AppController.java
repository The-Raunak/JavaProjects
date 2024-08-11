package app.fitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.fitness.entity.Client;
import app.fitness.service.AppService;

@Controller
public class AppController {
	
	@Autowired
	private AppService service;
	
	@GetMapping("/welcome")
	public String welcomePage() {
		return "welcome";
	}
	@GetMapping("/reg")
	public String registerClient() {
		return"registration";
	}
	@GetMapping("/log")
	public String verifyClient() {
		return"login";
	}
	@PostMapping("/success")
	public String successMessage(@ModelAttribute Client client) {
		Client client2 = service.addClient(client);
		return "redirect:/welcome";
	}
	@PostMapping("/verify")
	public String verifyLoginData(@ModelAttribute Client client) {
		
		
		
		return "redirect:/welcome";
	}
	@PostMapping("/update/{id}")
	public String showUpdateForm(@PathVariable(name = "id")Integer integer,) {
		
	}
}
