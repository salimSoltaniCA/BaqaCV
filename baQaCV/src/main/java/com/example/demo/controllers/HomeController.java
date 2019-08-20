package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojos.Profile;
import com.example.demo.services.IProfileRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class HomeController {

	@Autowired
	IProfileRepository profile;
	
	public HomeController() {
		
	}

	@GetMapping("/getProfiles")
	public List<Profile> getProfiles() {
		return (List<Profile>) profile.findAll();
	}
	
	//TODO : Rajouter d'autres methodes : findByIdIAM ..
}
