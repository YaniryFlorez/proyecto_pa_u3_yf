package com.example.demo1.service;

import com.example.demo1.modelo.Vehiculo;

public interface IVehiculoServi {
	public void crear(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void borrar(String placa);
}
