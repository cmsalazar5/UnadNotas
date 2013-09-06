package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class PlanEstudioUsuario {

	@DatabaseField(generatedId=true)
	private int id;
	@DatabaseField(foreign=true, columnName = "idPlanEstudio")
	private PlanEstudio planEstudio;
	@DatabaseField
	private boolean homologado;
	
	public PlanEstudioUsuario(int id, PlanEstudio planEstudio,
			boolean homologado) {
		super();
		this.id = id;
		this.planEstudio = planEstudio;
		this.homologado = homologado;
	}

	public PlanEstudioUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PlanEstudio getPlanEstudio() {
		return planEstudio;
	}

	public void setPlanEstudio(PlanEstudio planEstudio) {
		this.planEstudio = planEstudio;
	}

	public boolean isHomologado() {
		return homologado;
	}

	public void setHomologado(boolean homologado) {
		this.homologado = homologado;
	}
	
	
	
}
