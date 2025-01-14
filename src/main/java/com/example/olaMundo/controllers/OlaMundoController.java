package com.example.olaMundo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

	@GetMapping
	public String helloWorld() {
		return "Olá Mundo!";
	}

	@GetMapping("/about")
	public String about() {
		return "teste";
	}
}