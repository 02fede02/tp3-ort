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
		Valor valorFinal;
		
//		TODO mejorar el metodo
		if(lector.getCantLibrosVigentes() < 3 && libroPrestar.cantEjemplares() > 0) {
			
			valorFinal = Valor.PRESTAMO_EXITOSO;
		} else if(lector.getCantLibrosVigentes() < 3 && libroPrestar.cantEjemplares() == 0) {
			valorFinal = Valor.NO_HAY_EJEMPLARES;
		} else if (lector.getCantLibrosVigentes() < 3 && libroPrestar.cantEjemplares() > 0 && lector.getCantLibrosVigentes() == 3) {
			valorFinal = Valor.TOPE_PRESTAMOS_ALCANZADO;
		} else {
			valorFinal = Valor.MULTA_VIGENTE;
		}
		
		return valorFinal;
		
	}
}
