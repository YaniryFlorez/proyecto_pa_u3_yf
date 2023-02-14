package com.example.demo1.repository;

import java.util.List;

import com.example.demo1.modelo.Estudiante;
import com.example.demo1.modelo.Hotel;

public interface IEstudianteRepo {
	
	public void insertar (Estudiante estudiante);
	
    public Estudiante actualizar(String ciudad, String genero);
	
	public Estudiante Eliminar(String ciudad);
	


	
	
}
