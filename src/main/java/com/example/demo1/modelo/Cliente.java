package com.example.demo1.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id

	@Column(name="cli_cedula")
	private String cedula;
	
	@Column(name="cli_nombre")
	private String nombre;
	
	@Column(name="cli_apellido")
	private String apellido;
	
	@OneToMany(mappedBy = "cliente", cascade =CascadeType.DETACH, fetch = FetchType.EAGER )
	private List<Renta> renta;
	
	//SET Y GET

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	

}
