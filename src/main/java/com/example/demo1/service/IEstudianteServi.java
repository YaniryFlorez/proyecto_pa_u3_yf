package com.example.demo1.service;

import com.example.demo1.modelo.Estudiante;

public interface IEstudianteServi {
public void insertar (Estudiante estudiante);
	
	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorGenero(String genero);
	
	public Estudiante buscarPorCiudad(String ciudad);
	
	public Estudiante buscarPorCedula(String cedula);
	
	public Estudiante buscarPorNombreQuryTyped(String nombre);
	
	public Estudiante buscarPorNamedQuery(String nombre);
	
	public Estudiante buscarPorNombreNamedQuerytype(String nombre);
	
	public Estudiante buscarPorNombreNativedQuery(String nombre);
	
	public Estudiante buscarPorNombreNativeQueryTypedNaimed(String nombre);
	
}
