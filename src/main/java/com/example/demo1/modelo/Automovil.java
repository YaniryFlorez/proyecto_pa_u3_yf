package com.example.demo1.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
@NamedQuery(name = "Automovil.buscarPorPlaca", query = "select e from Automovil e where e.placa = :datoPlaca")
@NamedQuery(name = "Automovil.buscarPorMarca", query = "select e from Automovil e where e.marca = :datoMarca")
@NamedQuery(name = "Automovil.buscarPorColor", query = "select e from Automovil e where e.color = :datoColor")

@NamedNativeQuery(name = "Automovil.buscarPorPlacaNative", query = "select * from automovil where auto_placa = :datoPlaca", resultClass = Automovil.class)
@NamedNativeQuery(name = "Automovil.buscarPorMarcaNative", query = "select * from automovil where auto_marca = :datoMarca", resultClass = Automovil.class)
@NamedNativeQuery(name = "Automovil.buscarPorColorNative", query = "select * from automovil where auto_color = :datoColor", resultClass = Automovil.class)
public class Automovil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")
	@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;

	@Column(name = "auto_placa")
	private String placa;
	
	@Column(name = "auto_modelo")
	private String modelo;
	
	@Column(name = "auto_anio")
	private LocalDateTime año;

	@Column(name = "auto_marca")
	private String marca;

	@Column(name = "auto_color")
	private String color;

	@Column(name = "auto_tipo")
	private String tipo;

	@Column(name = "auto_precio")
	private BigDecimal precio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDateTime getAño() {
		return año;
	}

	public void setAño(LocalDateTime año) {
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Automovil [id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", año=" + año + ", marca=" + marca
				+ ", color=" + color + ", tipo=" + tipo + ", precio=" + precio + "]";
	}

	

	// Set y Get
	

	


	
	
	
}
