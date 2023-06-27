package com.bolsadedeideas.springboot.web.app.controllers;

import java.util.Map;
import java.util.function.ObjDoubleConsumer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	/*
	 * 
	 *  PRIMERA FORMA MAS SENCILLA
	 */
	@GetMapping("/")
	public String index(Model model) {
	
		model.addAttribute("titulo", "Curso de Spring" );
		model.addAttribute("encabezado", "Bienvenidos al curso de Spring!!!");
		model.addAttribute("descripcion", "Curso de Backend con Spring");
		return "index";
	}

	/*
	 * SEGUNDA FORMA CON MAP
	 */
	@GetMapping("/index")
	public String index1(Map<String, Object> map) {
		map.put("titulo", "Curso de Spring");
		map.put("encabezado", "Bienvenidos al curso de Spring!!!");
		map.put("descripcion", "Hola Spring con Map");
		return "index";
	}
	
	/*
	 * TERCERA FORMA CON ModelAndView
	 */
	@GetMapping("/home")
	public ModelAndView index2(ModelAndView mv) {
		mv.addObject("titulo", "Curso de Spring");
		mv.addObject("encabezado", "Bienvenidos al curso de Spring!!!");
		mv.addObject("descripcion", "Hola Spring con MapView");
		mv.setViewName("index");
		return mv;
	}
	
	
	
}
