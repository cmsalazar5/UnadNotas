package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Convenio {

	@DatabaseField(generatedId=true)
	private int id;
	@DatabaseField(foreign=true, columnName="idEntidad")
	private EntidadConvenio entidad;
	@DatabaseField(foreign=true, columnName="idCarrera")
	private Carrera carrera;
	@DatabaseField
	private String nombrePrograma;
	@DatabaseField
	private String acuerdo; // La url del pdf
	
	public Convenio(int id, EntidadConvenio entidad, Carrera carrera,
			String nombrePrograma, String acuerdo) {
		super();
		this.id = id;
		this.entidad = entidad;
		this.carrera = carrera;
		this.nombrePrograma = nombrePrograma;
		this.acuerdo = acuerdo;
	}

	public Convenio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EntidadConvenio getEntidad() {
		return entidad;
	}

	public void setEntidad(EntidadConvenio entidad) {
		this.entidad = entidad;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public String getNombrePrograma() {
		return nombrePrograma;
	}

	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}

	public String getAcuerdo() {
		return acuerdo;
	}

	public void setAcuerdo(String acuerdo) {
		this.acuerdo = acuerdo;
	}
	
}
