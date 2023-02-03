package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Vehiculo;
import com.example.demo1.repository.IVehiculoRepo;

@Service
public class VehiculoServImpl implements IVehiculoServi{
	
	@Autowired
	private IVehiculoRepo vehiculoRepo;

	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.ingresar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(placa);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminar(placa);
	}

}
