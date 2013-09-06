package com.cristhian.unadnotas.utils;

/***
 * 
 * @author CSALAZAR
 * Clase que representa un item el el grid view principal el cual funciona como un menu
 */
public class ItemOpcionMenu {
	
	private long id;
	private String nombre;
	private int recurso;
	
	public ItemOpcionMenu(int id,String nombre, int recurso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.recurso = recurso;
	}

	public ItemOpcionMenu() {
		super();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRecurso() {
		return recurso;
	}

	public void setRecurso(int recurso) {
		this.recurso = recurso;
	}
	
	
	
}
