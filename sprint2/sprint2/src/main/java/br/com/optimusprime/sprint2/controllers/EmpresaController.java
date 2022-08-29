package br.com.optimusprime.sprint2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.optimusprime.sprint2.dto.EmpresaDTO;
import br.com.optimusprime.sprint2.mocks.Mocks;

@Controller
public class EmpresaController {
	@GetMapping("/empresas")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("empresa/index");
		model.addObject("empresas", Mocks.getEmpresas());
		return model;
	}
	
	@GetMapping("/empresas/criar")
	public ModelAndView criarGet() {
		ModelAndView model = new ModelAndView("empresa/criar");
		model.addObject("empresa", new EmpresaDTO(null, null, 0.0, 0));
		model.addObject("estados", Mocks.getEstadosAsSelect());
		return model;
	}
	
	@PostMapping("/empresas/criar")
	public ModelAndView criarPost(@ModelAttribute("empresa") EmpresaDTO empresa) {
		System.out.println("ID: " + empresa.getId());
		System.out.println("Nome: " + empresa.getNome());
		System.out.println("Descrição: " + empresa.getDesconto());
		System.out.println("ID Estado: " + empresa.getEstadoId());
		
		return new ModelAndView("redirect:/empresas");
	}
}
