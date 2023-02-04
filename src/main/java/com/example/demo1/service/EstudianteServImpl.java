package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Estudiante;
import com.example.demo1.repository.IEstudianteRepo;

@Service
public class EstudianteServImpl implements IEstudianteServi {
	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombre(nombre);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellido(apellido);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
		
	}
	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorGenero(genero);
	}
	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCiudad(ciudad);
	}
	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCedula(cedula);
	}

	@Override
	public Estudiante buscarPorNombreQuryTyped(String nombre) {
		// TODO Auto-generated method stub
		return this.buscarPorNombreQuryTyped(nombre);
	}

	@Override
	public Estudiante buscarPorNamedQuery(String nombre) {
		// TOD
		return this.buscarPorNamedQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNamedQuerytype(String nombre) {
		// TODO Auto-generated method stu
		return this.buscarPorNombreNamedQuerytype(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativedQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.buscarPorNombreNamedQuerytype(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNaimed(String nombre) {
		// TODO Auto-generated method stub
		return this.buscarPorNombreNativeQueryTypedNaimed(nombre);
	}
	

}
