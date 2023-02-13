package com.example.demo1;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo1.modelo.Automovil;
import com.example.demo1.modelo.Cliente;
import com.example.demo1.modelo.Estudiante;
import com.example.demo1.modelo.Renta;
import com.example.demo1.modelo.Vehiculo;
import com.example.demo1.service.IAutomovilService;
import com.example.demo1.service.IClienteServi;
import com.example.demo1.service.IEstudianteServi;
import com.example.demo1.service.IHotelService;
import com.example.demo1.service.IRentaServi;
import com.example.demo1.service.IVehiculoServi;

@SpringBootApplication
public class ProyectoPaU3YfApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteServi estudianteServi;
	
	@Autowired
	private IVehiculoServi vehiculoServi;
	
	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IRentaServi rentaServi;
	
	@Autowired
	private IAutomovilService autoServi;
	

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3YfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu=new Estudiante();
		
		//this.estudianteServi.actualizar("Quito", "Femenino");
		
		this.estudianteServi.Eliminar("Tulcan");
		
		
		
		
		
		
		
             
	
		
		
		

		
		
	}

}
