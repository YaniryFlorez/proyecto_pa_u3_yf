package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Estudiante;
import com.example.demo1.repository.IEstudianteRepo;

@Service
public class EstudianteServImpl implements IEstudianteServi {
	
	@Autowired
	private IEstudianteRepo estudianteRepo;


	@Override
	public Estudiante actualizar(String ciudad, String genero) {
		// TODO Auto-generated method stub
		this.estudianteRepo.actualizar(ciudad, genero);
		return null;
	}

	@Override
	public Estudiante Eliminar(String ciudad) {
		// TODO Auto-generated method stub
		this.estudianteRepo.Eliminar(ciudad);
		
		return null;
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estudiante> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarHotelLeftJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarHotelRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarHotelfullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarHotelOutJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
