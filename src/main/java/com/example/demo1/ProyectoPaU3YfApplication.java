package com.example.demo1;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo1.modelo.Cliente;
import com.example.demo1.modelo.Estudiante;
import com.example.demo1.modelo.Renta;
import com.example.demo1.modelo.Vehiculo;
import com.example.demo1.service.IClienteServi;
import com.example.demo1.service.IEstudianteServi;
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
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3YfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	/*	Estudiante estudiante = new Estudiante();
		estudiante.setCedula("172334444");
		estudiante.setNombre("Yaniry");
		estudiante.setApellido("Florez");
		estudiante.setCiudad("Quito");
		estudiante.setGenero("Femenino");
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setCedula("1725841538");
		estudiante1.setNombre("Jose Luis");
		estudiante1.setApellido("Muñoz");
	    estudiante1.setCiudad("Manta");
		estudiante1.setGenero("Masculino");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setCedula("1743256789");
		estudiante2.setNombre("Alexandra");
		estudiante2.setApellido("Gordillo");
	    estudiante2.setCiudad("Quito");
		estudiante2.setGenero("Femenino");
		
		this.estudianteServi.insertar(estudiante);
		this.estudianteServi.insertar(estudiante1);
		this.estudianteServi.insertar(estudiante2);   */
		

		//this.estudianteServi.buscarPorApellido("Yaniry");
		
		System.out.println(this.estudianteServi.buscarPorNombre("Yaniry"));

		System.out.println(this.estudianteServi.buscarPorApellido("Florez"));
		
		System.out.println(this.estudianteServi.buscarPorGenero("Femenino"));

		System.out.println(this.estudianteServi.buscarPorCedula("1172334444"));
	
		System.out.println(this.estudianteServi.buscarPorCiudad("Quito"));


		
		
		
		
		
		
		
		
		
	/*	
		Cliente cli=new Cliente();
		Cliente cli1=new Cliente();
		Cliente cli2=new Cliente();
		Cliente cli3=new Cliente();
		
		Vehiculo veh= new Vehiculo();
		Vehiculo veh1= new Vehiculo();
		Vehiculo veh2= new Vehiculo();
		
		
		
		 //ingresar
		cli.setCedula("1234567");
		cli.setNombre("Carlos");
		cli.setApellido("Garcia");
		
		cli1.setCedula("1234568");
		cli1.setNombre("Maria");
		cli1.setApellido("Ruiz");
		
		cli2.setCedula("1234569");
		cli2.setNombre("Jose");
		cli2.setApellido("Lopez");
		
		cli3.setCedula("1234570");
		cli3.setNombre("Victoria");
		cli3.setApellido("Yepez");
		
		veh.setPlaca("ABC123");
		veh.setValor(new BigDecimal(120));
		
		veh1.setPlaca("ABC234");
		veh1.setValor(new BigDecimal(200));
		
		veh2.setPlaca("ABC345");
		veh2.setValor(new BigDecimal(300));
		
		List<Renta> rentas =new ArrayList<>();
		Renta renta =new Renta();
		renta.setCliente(cli);
		renta.setVehiculo(veh);
		renta.setDias(4);
		renta.setFecha(LocalDateTime.now());
		rentas.add(renta);
		
		Renta renta1 =new Renta();
		renta1.setCliente(cli1);
		renta1.setVehiculo(veh1);
		renta1.setDias(3);
		renta1.setFecha(LocalDateTime.now());
		rentas.add(renta1);
		
		Renta renta2 =new Renta();
		renta2.setCliente(cli2);
		renta2.setVehiculo(veh2);
		renta2.setDias(2);
		renta2.setFecha(LocalDateTime.now());
		rentas.add(renta2);
		
		Renta renta3 =new Renta();
		renta3.setCliente(cli3);
		renta3.setVehiculo(veh);
		renta3.setDias(1);
		renta3.setFecha(LocalDateTime.now());
		rentas.add(renta3);
		
		cli.setRenta(rentas);
		veh.setRenta(rentas);
		
		this.clienteServi.craer(cli);
		this.clienteServi.craer(cli1);
		this.clienteServi.craer(cli2);
		this.clienteServi.craer(cli3);
		
		this.vehiculoServi.crear(veh);
		this.vehiculoServi.crear(veh1);
		this.vehiculoServi.crear(veh2);
		
	//Actualizar
		
	/*	Cliente acli=this.clienteServi.buscar("1234569");
		acli.setNombre("José Luis");
		this.clienteServi.actualizar(acli);
		
		Vehiculo aveh=this.vehiculoServi.buscar("ABC123");
		aveh.setValor(new BigDecimal(150));
		this.vehiculoServi.actualizar(aveh);
		
		Renta aren = this.rentaServi.buscar(1);
		aren.setDias(2);
		this.rentaServi.actualizar(aren);
		*/
		
		
	//Borrar
		
	/*	this.clienteServi.borrar("1234570");
		
		this.vehiculoServi.borrar("ABC345");
		
		this.rentaServi.borrar(1);
		
		*/
		
		
	}

}
