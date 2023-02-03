package com.example.demo1.repository;

import com.example.demo1.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public void insertar (Estudiante estudiante);
	
	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorGenero(String genero);
	
	public Estudiante buscarPorCiudad(String ciudad);
	
	public Estudiante buscarPorCedula(String cedula);
}
