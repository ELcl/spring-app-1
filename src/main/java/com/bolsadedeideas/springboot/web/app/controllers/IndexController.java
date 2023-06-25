package com.bolsadedeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	// Si se omite el tipo de método es un GET
	// Tambien se puede usar directamente
	/*
	    @GetMapping(value = "/index")
		@PostMapping(value = "/index")
		@PutMapping(value = "index")
		@PatchMapping(value = "/index")
		@DeleteMapping(value = "/index")
	 */
	
	//@RequestMapping(value = "/index", method = RequestMethod.GET)
	/*
	 * Esta forma tambien es válida
	 * @GetMapping(value = "/index")
	 * @GetMapping("/index")
	 * 
	 * Si se daría el caso de que fueran más rutas afectadas sería
	 * @GetMapping({"/index", "/home", "/"})
	 */
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	
}
