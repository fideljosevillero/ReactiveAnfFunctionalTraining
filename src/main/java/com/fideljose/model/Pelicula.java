package com.fideljose.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pelicula {
	
	private String nombre;
	private String genero;
	private Double calificacion;
	private String duracion;
	
}
