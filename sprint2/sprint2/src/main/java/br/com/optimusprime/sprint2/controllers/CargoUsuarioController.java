package br.com.optimusprime.sprint2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.optimusprime.sprint2.dto.CargoUsuarioDTO;
import br.com.optimusprime.sprint2.mocks.Mocks;

@Controller
public class CargoUsuarioController {
	@GetMapping("/cargos")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("cargo_usuario/index");
		model.addObject("cargos", Mocks.getCargos());
		return model;
	}
	
	@GetMapping("/cargos/criar")
	public ModelAndView criarGet() {
		ModelAndView model = new ModelAndView("cargo_usuario/criar");
		model.addObject("cargo", new CargoUsuarioDTO(null, null, null, 0));
		return model;
	}
	
	@PostMapping("/cargos/criar")
	public ModelAndView criarPost(@ModelAttribute("cargo") CargoUsuarioDTO cargo) {
		System.out.println("ID: " + cargo.getId());
		System.out.println("Nome: " + cargo.getNome());
		System.out.println("Descrição: " + cargo.getDescricao());
		System.out.println("Nível: " + cargo.getNivel());
		
		return new ModelAndView("redirect:/cargos");
	}
}
