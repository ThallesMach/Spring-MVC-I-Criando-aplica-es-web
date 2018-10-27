package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { //	http://localhost:8080/casadocodigo/produtos/form

	@RequestMapping("/")
	public String index() {
		System.out.println("Entrando na home no casa de código");
		return "home";
	}
}
