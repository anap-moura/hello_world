package com.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ola-mundo")
public class OlaMundoController {
	@GetMapping
	public String olaMundo() {
		return "Olá Mundo!";
			
	}
	
	@GetMapping("/lista-bsm")
	public String listaBsm() {
	    return "BSM Generation Brazil:<br/>Persistência;<br/>"
	            + "Mentalidade de Crescimento;<br/>"
	            + "Responsabilidade Pessoal;<br/>"
	            + "Orientação ao Futuro;<br/>"
	            + "Proatividade;<br/>"
	            + "Comunicação;<br/>"
	            + "Trabalho em Equipe;<br/>"
	            + "Orientação ao Detalhe.";
	}
	
	@GetMapping("/objetivos-aprendizagem")
	public String objetivosAprendizagem () {
	    return "Reforçar estudos com cookbook e vídeos extras pós aula;<br/>"
	            + "Focar em code review;<br/>"
	    		+ "chorar pq depois disso ainda não to entendendo;";
	}
    }

