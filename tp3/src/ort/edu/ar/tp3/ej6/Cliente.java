package ort.edu.ar.tp3.ej6;

import java.util.ArrayList;

public class Cliente {
	private String dni;
	private String nombre;
	private double saldoPagar;
	private ArrayList<Pelicula> historialPeliculas;
	private Servicio suscripcion;
	
	public Cliente(String dni, String nombre, Servicio suscripcion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.saldoPagar = 0;
		this.suscripcion = suscripcion;
	}
	
	public boolean esDeudor() {
		return saldoPagar > 0;
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		historialPeliculas.add(pelicula);
	}
	
}
