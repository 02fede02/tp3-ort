package ort.edu.ar.tp3.ej6;

public class Pelicula {
	private String nombre;
	private Categoria categoria;
	
	public Pelicula(String nombre, Categoria categoria) {
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
}
