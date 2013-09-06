package com.cristhian.unadnotas.model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Escuela {

	@DatabaseField(generatedId = true)
	private int id;
	@DatabaseField
	private String codigo;
	@DatabaseField
	private String nombre;
	@ForeignCollectionField(eager = true)
	private ForeignCollection<Carrera> carreras;
	
	public Escuela() {
		super();
	}
	
	public Escuela(int id, String codigo, String nombre) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
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

	public ForeignCollection<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(ForeignCollection<Carrera> carreras) {
		this.carreras = carreras;
	}
	
	@Override
	public String toString(){
		return getCodigo() + " - " + getNombre();
	}
	
}
