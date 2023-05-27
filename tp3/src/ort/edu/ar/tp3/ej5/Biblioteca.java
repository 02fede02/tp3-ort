package ort.edu.ar.tp3.ej5;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		this.libros = new ArrayList<Libro>();
	}
	
	public Libro buscarLibro(Libro libro) {
		int i = 0;
		Libro libroEncontrado = null;
		
		while(i < libros.size() && libroEncontrado == null) {
			Libro libroActual = libros.get(i);
			
			if(libroActual.getLibro() == libro.getLibro()) {
				libroEncontrado = libroActual;
			} else {
				i++;
			}
		}
		return libroEncontrado;
	}
	
	public Valor prestar(Libro libro, Lector lector) {
		Libro libroPrestar = buscarLibro(libro);
		
		if(lector.getCantLibrosVigentes() < 3 && libroPrestar.) {
			
		}
		
	}
}
