package com.example.VaccinationCenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.VaccinationCenter.service.CitizenService;
import com.example.VaccinationCenter.bean.CitizenBean;

@RestController
@RequestMapping("/citizens")
public class CititzenController {
	
	@Autowired
	private CitizenService citizenservice;
	@GetMapping("/welcome")
	public String meth1() {
		return "<h1> Vaccination Center</h1>";
	}
	
	@RequestMapping("/addCitizen")
	public String meth2(@ModelAttribute CitizenBean cb) {
		return "<h1>"+citizenservice.addCitizen(cb)+"record inserted successfully</h1>";
	}
	
	

}
