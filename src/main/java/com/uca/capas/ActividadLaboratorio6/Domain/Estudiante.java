package com.uca.capas.ActividadLaboratorio6.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="ESTUDIANTE")
public class Estudiante {
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer codigo;
	
	@Column(name="nombre")
	public String nombre;
	
	@Column(name="apellido")
	public String apellido;
	
	@Column(name="carne")
	public Integer carne;
	
	@Column(name="carrera")
	public String carrera;

	public Estudiante() {
		super();
	}

	public Estudiante(Integer codigo, String nombre, String apellido, Integer carne, String carrera) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carne = carne;
		this.carrera = carrera;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public Integer getCarne() {
		return carne;
	}

	public void setCarne(Integer carne) {
		this.carne = carne;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
