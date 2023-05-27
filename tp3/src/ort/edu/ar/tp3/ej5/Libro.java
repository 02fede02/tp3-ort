package ort.edu.ar.tp3.ej5;

import java.util.ArrayList;

public class Libro {
	private String libro;
	private Genero genero;
	private Editorial editorial;
	private String anio;
	private String autor;
	private ArrayList<Ejemplar> ejemplares;
	
	public Libro(String libro, Genero genero, Editorial editorial, String anio, String autor) {
		this.libro = libro;
		this.genero = genero;
		this.editorial = editorial;
		this.anio = anio;
		this.autor = autor;
		this.ejemplares = new ArrayList<Ejemplar>();
	}
	
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
