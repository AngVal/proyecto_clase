package com.project.consorcio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.consorcio.service.MedicamentoService;
import com.project.consorcio.service.TipoMedicamentoService;


@Controller
//Permite crear direcciones URL para que el cliente pueda acceder.
@RequestMapping ("/medicamento")

public class MedicamentoController {
@Autowired
private MedicamentoService servicioMedicamento;

@Autowired
private TipoMedicamentoService servicioTipoMedicamento;	 


//Crear direccion url para mostrar pagina"medicamento.html"
//Cuando se genera url dentro del controlador tiens que colocar metodos
@RequestMapping ("/lista")
//addAtributte es un metodo de la intrfaz Model que permite crear atributos 
public String Index(Model model) {
	//Crear atributo
	//devuelve un list(arreglo de objetos) que es enviado a la pagina medicamento
	model.addAttribute("medicamentos",servicioMedicamento.listarTodo());
	
	//llenar combo
	model.addAttribute("tipos",servicioMedicamento.listarTodo());
	
	//Nombre de la página
	return "medicamento";
}







}
