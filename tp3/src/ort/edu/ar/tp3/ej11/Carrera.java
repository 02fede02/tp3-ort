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
	
		
	public int getFecha() {
		return fecha;
	}


	public int getHora() {
		return hora;
	}


	public Dificultad getDificultad() {
		return dificultad;
	}


	public int getCantVueltas() {
		return cantVueltas;
	}


	public ArrayList<Piloto> buscarPilotosPorDebajoDe(int tiempo) {
		ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
		
		if(!this.pilotos.isEmpty()) {
			for (Piloto piloto : this.pilotos) {
				if(piloto.estaPorDebajoDe(tiempo)) {
					pilotos.add(piloto);
				}
			}			
		}
		
		return pilotos;
	}
	
	public void agregarPiloto(ArrayList<Piloto> pilotos) {
		
		if(!this.pilotos.isEmpty()) {
			for (Piloto piloto : this.pilotos) {
				pilotos.add(piloto);
			}
		}
	}
	
	public void mostrarMenorPromedio() {
		Piloto pilotoMenorPromedio;
		
		if(!this.pilotos.isEmpty()) {
			pilotoMenorPromedio = this.pilotos.get(0);
			
			for (Piloto piloto : this.pilotos) {
				if(piloto.getPromedioVueltas() < pilotoMenorPromedio.getPromedioVueltas()) {
					pilotoMenorPromedio = piloto;
				}
			}
			
			System.out.println(pilotoMenorPromedio);
		} else {
			System.out.println("No hay ningun piloto registrado en la carrera");
		}
	}
	
	public boolean esLaFecha(int fecha) {
		return this.getFecha() == fecha;
	}
}
