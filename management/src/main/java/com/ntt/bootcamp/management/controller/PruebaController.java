package com.ntt.bootcamp.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saludo.prueba.properties.SaludoProperties;
import com.saludo.prueba.repository.Saludo;

@RestController
public class PruebaController {

	@Autowired
	private SaludoProperties saludo;
	
	@GetMapping("/prueba")
	public String pruebaSaludo() {
		return saludo.getIdioma();
	}
	
}
