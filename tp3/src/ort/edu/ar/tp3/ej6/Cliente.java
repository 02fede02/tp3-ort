package ort.edu.ar.tp3.ej6;

import java.util.ArrayList;

public class Cliente {
	private String dni;
//	private String nombre;
	private double saldoPagar;
	private ArrayList<Pelicula> historialPeliculas;
	private Categoria suscripcion;

	public String getDni() {
		return this.dni;
	}
	public Categoria getSuscripcion() {
		return this.suscripcion;
	}
	public double getSaldoPagar() {
		return this.saldoPagar;
	}
	
	public Cliente(String dni, Categoria suscripcion) {
		super();
		this.dni = dni;
		this.saldoPagar = 0;
		this.suscripcion = suscripcion;
		this.historialPeliculas = new ArrayList<Pelicula>();
	}
	
	public boolean esDeudor() {
		return saldoPagar > 0;
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		historialPeliculas.add(pelicula);
	}
	
	
}
