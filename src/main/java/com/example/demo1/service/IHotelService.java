package com.example.demo1.service;

import java.util.List;

import com.example.demo1.modelo.Hotel;

public interface IHotelService {
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
}
