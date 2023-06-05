package ort.edu.ar.tp3.ej11;

import java.util.ArrayList;

public class Carrera {
	private int fecha;
	private int hora;
	private Dificultad dificultad;
	private int cantVueltas;
	private ArrayList<Piloto> pilotos;
	
	public Carrera(int fecha, int hora, Dificultad dificultad, int cantVueltas) {	
		this.fecha = fecha;
		this.hora = hora;
		this.dificultad = dificultad;
		this.cantVueltas = cantVueltas;
		this.pilotos = new ArrayList<Piloto>();
	}
	
	
}
