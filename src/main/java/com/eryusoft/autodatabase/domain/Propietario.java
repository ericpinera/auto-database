package com.eryusoft.autodatabase.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Propietario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long propietarioid;
	private String nombres, apellidos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="propietario")
	@JsonIgnore
	private List<Auto> autos;
	

	public Propietario() {}

	public Propietario(String nombres, String apellidos) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public long getPropietarioid() {
		return propietarioid;
	}

	public void setPropietarioid(long propietarioid) {
		this.propietarioid = propietarioid;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	
	

}
