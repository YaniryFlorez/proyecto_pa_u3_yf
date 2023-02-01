package com.example.demo1.repository;

import com.example.demo1.modelo.Estudiante;

public interface IEstudianteRepo {
	
		public void actualizar(Estudiante estudiante);
		public Estudiante buscarNombreQuery(Estudiante estudiante);
		public Estudiante buscarApellidoQuery(Estudiante estudiante);
		public void eliminar(Integer id);
}
