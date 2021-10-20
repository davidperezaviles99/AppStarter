package com.ntt.bootcamp.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saludo.prueba.properties.SaludoProperties;
import com.saludo.prueba.repository.Saludo;

@SpringBootApplication
public class ManagementApplication {
	
	@Autowired
	static SaludoProperties s;
	

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
		//Saludo saludo = new Saludo("Ingles");
		//System.out.println(s.mensajeSaludo());
		
	}

}
