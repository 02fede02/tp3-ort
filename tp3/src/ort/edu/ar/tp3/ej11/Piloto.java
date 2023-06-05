package ort.edu.ar.tp3.ej11;

public class Piloto {
	private String nombre;
	private String dni;
	private int cantVueltas;
	private double tiempoVuelta;
	private double sumaTiempo;
	private double promedioVueltas;
	
	public Piloto(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.cantVueltas = 0;
		this.tiempoVuelta = 0;
		this.sumaTiempo = 0;
		this.promedioVueltas = 0;
	}
	
	public void calcularVueltaPromedio() {
		if(this.cantVueltas > 0 ) {
			this.promedioVueltas = this.sumaTiempo / this.cantVueltas;
		} else {
			System.out.println("El piloto no realizo ninguna vuelta");
		}
	}
	
	public String toString() {
		return this.nombre + " " + this.dni;
	}
}
