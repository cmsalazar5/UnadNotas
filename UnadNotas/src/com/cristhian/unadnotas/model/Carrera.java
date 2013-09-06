package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Carrera {
	
	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField(foreign = true, columnName="idEscuela")
	private Escuela escuela;
	@DatabaseField
	private String nombre;
	@DatabaseField
	private int creditosObligatorios;
	@DatabaseField
	private int creditosElectivos;
	@DatabaseField
	private int totalCreditos;
	
	public boolean seleccion = false;
	
	public Carrera() {
		super();
	}

	public Carrera(int id, Escuela escuela, String nombre,
			int creditosObligatorios, int creditosElectivos, int totalCreditos) {
		super();
		this.id = id;
		this.escuela = escuela;
		this.nombre = nombre;
		this.creditosObligatorios = creditosObligatorios;
		this.creditosElectivos = creditosElectivos;
		this.totalCreditos = totalCreditos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Escuela getEscuela() {
		return escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditosObligatorios() {
		return creditosObligatorios;
	}

	public void setCreditosObligatorios(int creditosObligatorios) {
		this.creditosObligatorios = creditosObligatorios;
	}

	public int getCreditosElectivos() {
		return creditosElectivos;
	}

	public void setCreditosElectivos(int creditosElectivos) {
		this.creditosElectivos = creditosElectivos;
	}

	public int getTotalCreditos() {
		return totalCreditos;
	}

	public void setTotalCreditos(int totalCreditos) {
		this.totalCreditos = totalCreditos;
	}
	
	@Override
	public String toString(){
		return getNombre();
	}
	
}
