package com.project.consorcio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Medico;
import com.project.consorcio.repository.MedicoRepository;
@Service
public class MedicoService {

	@Autowired
	private MedicoRepository repo;
	
	
	//Registrar
	public void Registrar(Medico me) {
		repo.save(me);
	}
	//Actializar
	public void Actualizar(Medico me) {
		repo.save(me);
	}
	
	//Eliminar
	public void EliminarPorId(int cod) {
		repo.deleteById(cod);;
	}
	//Buscar
	public Medico BuscarPorId(int cod) {
		return repo.findById(cod).orElse(null);
	}
	//Listar
	public List<Medico> ListarTodo(){
		return repo.findAll();
	}
}
