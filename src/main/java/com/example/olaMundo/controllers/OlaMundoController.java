package com.example.olaMundo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

	@GetMapping("/")
	public String healthCheck() {
		return "Olá Mundo!";
	}

}