package com.project.consorcio.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_sede")
public class Sede {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_sede")
	private Integer codigo;
	
	@Column(name="nom_sede")
	private String nombre;
	//ASOC.
	@OneToMany(mappedBy = "sede")
	private List<Medico>ListaSedeMedico;
	
	//METODOS DE ACCESO

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Medico> getListaSedeMedico() {
		return ListaSedeMedico;
	}

	public void setListaSedeMedico(List<Medico> listaSedeMedico) {
		ListaSedeMedico = listaSedeMedico;
	}
}
