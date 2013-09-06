package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Curso {

	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField
	private String codigo;
	@DatabaseField
	private String nombre;
	@DatabaseField
	private int creditos;
	@DatabaseField
	private String modalidad;
	@DatabaseField
	private String tipoCurso;
	
	public Curso(int id, String codigo, String nombre, int creditos,
			String modalidad, String tipoCurso) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
		this.modalidad = modalidad;
		this.tipoCurso = tipoCurso;
	}

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	
	
	
	
}
