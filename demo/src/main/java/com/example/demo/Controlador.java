package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		
		String sms = "Hola desde el controlador";
		modelo.addAttribute("saludo", sms);
		
		return "Index";
	}
}
