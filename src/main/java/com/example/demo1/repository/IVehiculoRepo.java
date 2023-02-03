package com.example.demo1.repository;

import com.example.demo1.modelo.Vehiculo;

public interface IVehiculoRepo {
	public void ingresar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void eliminar(String placa);
}
