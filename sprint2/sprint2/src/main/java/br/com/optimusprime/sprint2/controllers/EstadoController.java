package br.com.optimusprime.sprint2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.optimusprime.sprint2.mocks.Mocks;

/**
 * Obs: não vemos necessidade de um CRUD completo para estados, já que esses
 * registros raramente serão alterados.
 */
@Controller
public class EstadoController {
	@GetMapping("/estados")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("estado/index");
		model.addObject("estados", Mocks.getEstados());
		return model;
	}
}
