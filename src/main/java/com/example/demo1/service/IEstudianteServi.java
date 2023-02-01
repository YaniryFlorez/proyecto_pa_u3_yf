package com.example.demo1.service;

import com.example.demo1.modelo.Estudiante;

public interface IEstudianteServi {
	public void crear(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void borrar(Integer id);
}
