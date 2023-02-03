package com.example.demo1.repository;

import com.example.demo1.modelo.Cliente;

public interface IClienteRepo {
	
	public void ingresar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(String cedula);
	public void eliminar(String cedula);
}
