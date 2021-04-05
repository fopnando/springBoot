package br.com.safeprovedor.springBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path = {"/ola", "/saudacao"})
	public String ola() {
		return "Olá Spring Boot!";
		
	}
	
	@PostMapping(path = {"/ola", "/saudacao"})
	public String saudacao() {
		return "Olá Spring Boot (POST)!";
		
	}
	

}
