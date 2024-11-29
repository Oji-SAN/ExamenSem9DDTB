package com.ExamenSemana9DDTB.Alumno;

import lombok.Data;

@Data 
public class Alumno {
	private Long id;
	private String nombre;
	private String apellido;
	public Alumno() {
		super();
	}
	public Alumno(Long id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
