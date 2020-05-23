package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private Integer codigoestudiante;
	
	@Size(message="El campo nombre no debe contener mas de 30 de caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name="nombre")
	private String nombre;
	
	@Size(message="El campo nombre no debe contener mas de 30 de caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	@Column(name="apellido")
	private String apellido;
	
	@NotNull(message="El campo no puede estar vacio")
	@Min(value=18,message="No puede ser menos a 18")
	@Column(name="edad")
	private Integer edad;
	
	@Column(name="estado")
	private Boolean estado;
	
	@OneToMany(mappedBy="estudiante" , fetch=FetchType.EAGER)
	private List <Computadora> computadoras;
	
	

	public List<Computadora> getComputadora() {
		return computadoras;
	}

	public void setComputadora(List<Computadora> computadora) {
		this.computadoras = computadora;
	}

	public Integer getCodigoEstudiante() {
		return codigoestudiante;
	}

	public void setCodigoEstudiante(Integer codigoestudiante) {
		this.codigoestudiante = codigoestudiante;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		edad = edad;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		estado = estado;
	}
	
	//Funciones delegate
	public String getEstadoDelegate() {
		if(this.estado == null)return "";
		else {
			if(this.estado) 
				return "Activo";
			else {
				return "Inactivo";
			}
		}
		
	}

	public Estudiante(Integer codigoEstudiante, String nombre, String apellido, Integer edad, Boolean estado) {
		super();
		this.codigoestudiante = codigoEstudiante;
		nombre = nombre;
		apellido = apellido;
		edad = edad;
		estado = estado;
	}
	
	public Estudiante() {}

	
	
	
	
	
	
	

}
