package com.example.demo1.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ren_seq")
	@SequenceGenerator(name = "ren_seq", sequenceName = "ren_seq", allocationSize = 1)
	
	@Column(name="rent_id")
	private Integer id;
	
	@Column(name="rent_fecha")
	private LocalDateTime fecha;
	
	@Column(name="rent_numero_dias")
	private Integer dias;
	
	@ManyToOne
	@JoinColumn(name = "rent_placa_vehiculo") 
	private Vehiculo vehiculo;
	
	@ManyToOne
	@JoinColumn(name = "rent_cedula_cliente") 
	private Cliente cliente;
	
	//SET Y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", dias=" + dias + "]";
	}
	

	
}
