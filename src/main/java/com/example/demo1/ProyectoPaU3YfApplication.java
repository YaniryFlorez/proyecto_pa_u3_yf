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
import com.example.demo1.modelo.Habitacion;
import com.example.demo1.modelo.Hotel;
import com.example.demo1.modelo.Renta;
import com.example.demo1.modelo.Vehiculo;
import com.example.demo1.repository.IHotelRepo;
import com.example.demo1.service.IAutomovilService;
import com.example.demo1.service.IClienteServi;
import com.example.demo1.service.IEstudianteServi;
import com.example.demo1.service.IHotelService;
import com.example.demo1.service.IRentaServi;
import com.example.demo1.service.IVehiculoServi;

@SpringBootApplication
public class ProyectoPaU3YfApplication implements CommandLineRunner{
	
	
	@Autowired
	private IHotelRepo hotelRepo;


	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3YfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Hotel> lista1= this.hotelRepo.buscarHotelInnerJoin(null);
		for(Hotel h: lista1) {
			System.out.println("Las habitaciones de "+h.getNombre());
			for(Habitacion ha1 : h.getHabitaciones()) {
				System.out.println(h.getNombre());
				System.out.println(h.getHabitaciones());
			}
			System.out.println();
		}
		
		//this.hotelRepo.buscarHotelInnerJoin("VIP");
		
		List<Hotel> lista= this.hotelRepo.buscarHotelFetchJoin("VIP");
		for(Hotel h: lista) {
			System.out.println("Las habitaciones de "+h.getNombre());
			/*for(Habitacion ha : h.getHabitaciones()) {
				System.out.println(h.getNombre());
				System.out.println(h.getHabitaciones());*/
			}
			System.out.println();
		
		
		List<Hotel> lista2= this.hotelRepo.buscarHotelOuterFulltJoin("VIP");
		for(Hotel h: lista2) {
			System.out.println("Las habitaciones de "+h.getNombre());
			/*for(Habitacion ha : h.getHabitaciones()) {
				System.out.println(h.getNombre());
				System.out.println(h.getHabitaciones());*/
			}
			System.out.println();
		
		
		List<Hotel> lista3= this.hotelRepo.buscarHotelOuterLefttJoin("VIP");
		for(Hotel h: lista3) {
			System.out.println("Las habitaciones de "+h.getNombre());
			/*for(Habitacion ha : h.getHabitaciones()) {
				System.out.println(h.getNombre());
				System.out.println(h.getHabitaciones());*/
			}
			System.out.println();
	
	
	   List<Hotel> lista4= this.hotelRepo.buscarHotelOuterRightJoin("VIP");
	    for(Hotel h: lista4) {
		     System.out.println("Las habitaciones de "+h.getNombre());
		  /*for(Habitacion ha : h.getHabitaciones()) {
			System.out.println(h.getNombre());
			System.out.println(h.getHabitaciones());*/
		}
		System.out.println();
	
		
      }
}

