package br.com.optimusprime.sprint2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.optimusprime.sprint2.mocks.Mocks;

/**
 * Obs: não vemos necessidade de um CRUD completo para países, já que esses
 * registros raramente serão alterados.
 */
@Controller
public class PaisController {
	@GetMapping("/paises")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("pais/index");
		model.addObject("paises", Mocks.getPaises());
		return model;
	}
}
