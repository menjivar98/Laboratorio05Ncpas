package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="id_estudiante")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoEstudiante;
	
	@Size(message="El campo nombre no debe contener mas de 30 de caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name="nombre")
	private String Nombre;
	
	@Size(message="El campo nombre no debe contener mas de 30 de caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name="apellido")
	private String Apellido;
	
	@NotNull(message="El campo no puede estar vacio")
	@Min(value=18,message="No puede ser menos a 18")
	@Column(name="edad")
	private Integer Edad;
	
	@Column(name="estado")
	private Boolean Estado;
	
	

	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Integer getEdad() {
		return Edad;
	}

	public void setEdad(Integer edad) {
		Edad = edad;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}
	
	//Funciones delegate
	public String getEstadoDelegate() {
		if(this.Estado == null)return "";
		else {
			if(this.Estado) 
				return "Activo";
			else {
				return "Inactivo";
			}
		}
		
	}

	public Estudiante(Integer codigoEstudiante, String nombre, String apellido, Integer edad, Boolean estado) {
		super();
		this.codigoEstudiante = codigoEstudiante;
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Estado = estado;
	}
	
	public Estudiante() {}

	
	
	
	
	
	
	

}
