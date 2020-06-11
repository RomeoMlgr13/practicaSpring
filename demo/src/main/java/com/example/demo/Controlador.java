package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.romeo.modelo.Persona;


@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		Persona person = new Persona();
		person.setNombre("Romeo");
		person.setApellido("Melgar");
		person.setTelefono("(+503)7747-0000");
		person.setEmail("lm0071032018@unab.edu.sv");
		
		
		Persona person2 = new Persona();
		person2.setNombre("Matt");
		person2.setApellido("LG");
		person2.setTelefono("(+503)7701-0000");
		person2.setEmail("lg0071032018@unab.edu.sv");
		
		List personas = (List) Arrays.asList(person,person2);
		
		
		String sms = "Hola desde el controlador";
		modelo.addAttribute("saludo", sms);
		//modelo.addAttribute("persona",person);
		modelo.addAttribute("personas",personas);
		
		return "Index";
	}
}
