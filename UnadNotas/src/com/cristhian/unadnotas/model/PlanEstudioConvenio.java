package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class PlanEstudioConvenio {

	@DatabaseField(generatedId=true)
	private int id;
	@DatabaseField(foreign = true, columnName = "idConvenio")
	private Convenio convenio;
	@DatabaseField(foreign = true, columnName = "idPlanEstudio")
	private PlanEstudio planEstudio;

	public PlanEstudioConvenio(int id, Convenio convenio,
			PlanEstudio planEstudio) {
		super();
		this.id = id;
		this.convenio = convenio;
		this.planEstudio = planEstudio;
	}

	public PlanEstudioConvenio() {
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

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	
}
