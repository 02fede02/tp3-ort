package ort.edu.ar.tp3.ej3;

import java.util.ArrayList;

public class Barrio {
	private String nombre;
	private ArrayList<Propiedad> listaPropiedades;
	
	public Barrio(String nombre) {
		this.nombre = nombre;
		this.listaPropiedades = new ArrayList<Propiedad>(); 
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mostarPropiedades(Tipo tipo) {
		for (Propiedad propiedad : listaPropiedades) {
			if(propiedad.getTipo().equals(tipo)) {
				System.out.println(propiedad);
			}
		}
	}
	
	public Propiedad buscarPropiedad(String domicilio) {
		int i = 0;
		Propiedad propiedadEncontrada = null;
		
		while(i < listaPropiedades.size() && propiedadEncontrada == null) {
			Propiedad propiedadActual = listaPropiedades.get(i);
			
			if (propiedadActual.getDomicilio().equals(domicilio)) {
				propiedadEncontrada = propiedadActual; 
			} else {
				i++;
			}
		}
		
		return propiedadEncontrada;
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		Propiedad propiedadEncontrada = buscarPropiedad(propiedad.getDomicilio());
		
		if(propiedadEncontrada == null) {
			listaPropiedades.add(propiedad);
		} else {
			System.out.println("La propiedad que deseas agregar ya se encuentra");
		}
	}
	
	public ArrayList<Propiedad> getListaPropiedades() {
		return this.listaPropiedades;
	}
	
	public void eliminarPropiedad(Propiedad propiedad) {
		Propiedad propiedadEncontrada = buscarPropiedad(propiedad.getDomicilio());
		
		if(propiedadEncontrada != null) {
			listaPropiedades.remove(propiedadEncontrada);
		} else {
			System.out.println("La propiedad que deseas remover no se encuentra en este barrio");
		}
	}
	
}
