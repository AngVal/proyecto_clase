package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.service.DistritoService;
import com.project.consorcio.service.EspecialidadService;
import com.project.consorcio.service.MedicoService;
import com.project.consorcio.service.SedeService;


@Controller
@RequestMapping ("/medico")
public class MedicoController {
	@Autowired
	private MedicoService servicioMedico;

	@Autowired
	private DistritoService servicioDistrito;	 
	@Autowired
	private EspecialidadService servicioEspecialidad;	 
	@Autowired
	private SedeService servicioSede;	 

	
	//Listamos
	@RequestMapping("/lista")
	public String Index(Model model) {
		
		model.addAttribute("medicos",servicioMedico.ListarTodo());
		model.addAttribute("distrito",servicioDistrito.listarTodos());
		model.addAttribute("especialidad",servicioEspecialidad.listarTodos());
		model.addAttribute("sede",servicioSede.listarTodos());
		return "medico";
	}
	
	
}
