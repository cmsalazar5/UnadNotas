package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class CarreraUsuario {

	@DatabaseField(generatedId=true)
	private int id;
	@DatabaseField(foreign=true, columnName="idCarrera")
	private Carrera carrera;
	
	public CarreraUsuario(int id, Carrera carrera) {
		super();
		this.id = id;
		this.carrera = carrera;
	}

	public CarreraUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

}
