package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class PlanEstudio {

	@DatabaseField(generatedId=true)
	private int id;
	@DatabaseField(foreign=true, columnName="idCarrera")
	private Carrera carrera;
	@DatabaseField(foreign=true, columnName="idCurso")
	private Curso curso;
	@DatabaseField
	private int periodo;
	@DatabaseField
	private boolean electiva;
	@DatabaseField
	private boolean alternativaGrado;
	
	public PlanEstudio(int id, Carrera carrera, Curso curso, int periodo,
			boolean electiva, boolean alternativaGrado) {
		super();
		this.id = id;
		this.carrera = carrera;
		this.curso = curso;
		this.periodo = periodo;
		this.electiva = electiva;
		this.alternativaGrado = alternativaGrado;
	}

	public PlanEstudio() {
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

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public boolean isElectiva() {
		return electiva;
	}

	public void setElectiva(boolean electiva) {
		this.electiva = electiva;
	}

	public boolean isAlternativaGrado() {
		return alternativaGrado;
	}

	public void setAlternativaGrado(boolean alternativaGrado) {
		this.alternativaGrado = alternativaGrado;
	}
	
}
