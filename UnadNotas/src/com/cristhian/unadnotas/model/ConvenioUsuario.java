package com.cristhian.unadnotas.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class ConvenioUsuario {

	@DatabaseField(generatedId=true)
	private int id;
	@DatabaseField(foreign=true, columnName="idConvenio")
	private Convenio convenio;
	
	public ConvenioUsuario(int id, Convenio convenio) {
		super();
		this.id = id;
		this.convenio = convenio;
	}

	public ConvenioUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}
	
}
