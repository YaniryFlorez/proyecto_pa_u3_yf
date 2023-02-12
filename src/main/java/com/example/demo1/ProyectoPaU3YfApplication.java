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
		
              Automovil auto=new Automovil();
              /*  auto.setPlaca("ABC345");
              auto.setAño(LocalDateTime.now());
              auto.setColor("Blanco");
              auto.setMarca("Toyota");
              auto.setModelo("Camioneta");
              auto.setPrecio(new BigDecimal(19000));
              auto.setTipo("Familiar");
              
              Automovil auto1=new Automovil();
              auto1.setPlaca("ABC123");
              auto1.setAño(LocalDateTime.now());
              auto1.setColor("Rojo");
              auto1.setMarca("Mercedez");
              auto1.setModelo("Convertible");
              auto1.setPrecio(new BigDecimal(25000));
              auto1.setTipo("Individual");
              
              Automovil auto2=new Automovil();
              auto2.setPlaca("ABF876");
              auto2.setAño(LocalDateTime.now());
              auto2.setColor("Azul");
              auto2.setMarca("Mazda");
              auto2.setModelo("Campero");
              auto2.setPrecio(new BigDecimal(15000));
              auto2.setTipo("Familiar");
              
              this.autoServi.insertar(auto);
              this.autoServi.insertar(auto1);
              this.autoServi.insertar(auto2);
              	*/
              
		
		System.out.println(this.autoServi.buscarPorPlacaTypedQuery("ABC345"));
		System.out.println(this.autoServi.buscarPorColorTypedQuery("Blanco"));
		System.out.println(this.autoServi.buscarporMarcaTypedQuery("Toyota"));
		System.out.println("_____________________________________________________________________");
		System.out.println(this.autoServi.buscarPorPlacaNamedQuery("ABC123"));
		System.out.println(this.autoServi.buscarPorColorNamedQuery("Rojo"));
		System.out.println(this.autoServi.buscarporMarcaNamedQuery("Mercedez"));
		System.out.println("_____________________________________________________________________");
		System.out.println(this.autoServi.buscarPorPlacaNativeQuery("ABC123"));
		System.out.println(this.autoServi.buscarPorColorNativeQuery("Azul"));
		System.out.println(this.autoServi.buscarporMarcaNativeQuery("Mazda"));
		System.out.println("_____________________________________________________________________");
		System.out.println(this.autoServi.buscarPorPlacaNamedNativeQuery("ABF876"));
		System.out.println(this.autoServi.buscarPorColorNamedNativeQuery("Rojo"));
		System.out.println(this.autoServi.buscarporMarcaNamedNativeQuery("Mazda")); 
		
	
		
		
		

		
		
	}

}
