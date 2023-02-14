package com.example.demo1.service;

import java.util.List;

import com.example.demo1.modelo.Estudiante;

public interface IEstudianteServi {
public void insertar (Estudiante estudiante);
	
	
	
	 public Estudiante actualizar(String ciudad, String genero);
		
    public Estudiante Eliminar(String ciudad);
    
    public List<Estudiante> buscarHotelInnerJoin(String tipoHabitacion);
	public List<Estudiante> buscarHotelLeftJoin(String tipoHabitacion);
	public List<Estudiante> buscarHotelRightJoin(String tipoHabitacion);
	public List<Estudiante> buscarHotelfullJoin(String tipoHabitacion);
	public List<Estudiante> buscarHotelOutJoin(String tipoHabitacion);
	
}
