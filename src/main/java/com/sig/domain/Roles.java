package com.sig.domain;

import java.io.Serializable;
import java.util.Date;

public class Roles implements Serializable {
	
	private Integer id;
	private String nombre;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
