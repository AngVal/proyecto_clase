package com.project.consorcio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Medicamento;
import com.project.consorcio.repository.MedicamentoRepository;
@Service
public class MedicamentoService {

	@Autowired
	private MedicamentoRepository repo;
	
	//Registrar
	public void Registrar(Medicamento m) {
		repo.save(m);
	}
	
		//Actializar
	public void Actualizar(Medicamento m) {
		repo.save(m);
	}
		//Eliminar
	public void EliminarPorId(int cod) {
		repo.deleteById(cod);
	}
		//Buscar
	public Medicamento BuscarPorId(int cod) {
		return repo.findById(cod).orElse(null);
	}
		//Listar
	public List<Medicamento> listarTodo(){
		return repo.findAll();
	}
	
}
