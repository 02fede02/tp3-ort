package ort.edu.ar.tp3.ej3;

import java.util.ArrayList;

public class Inmobiliaria {
	private String nombre;
	private ArrayList<Barrio> listaBarrios;
	
	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
		this.listaBarrios = new ArrayList<Barrio>();
	}
	
	public void mostrarPropiedades(ArrayList<Barrio> listaBarrios) {
		System.out.println("Propiedades en venta");
		for (Barrio barrio: listaBarrios) {
			for(Propiedad propiedad: barrio.getListaPropiedades()) {
				System.out.println(propiedad);
			}
		}
	}
	
	private ArrayList<Barrio> obtenerBarrioMaxProp(){
		ArrayList<Barrio> listaBarriosMax = new ArrayList<Barrio>();
		Barrio barrioMax;
		
		if(!listaBarrios.isEmpty()) {
			barrioMax = listaBarrios.get(0);
			
			for (Barrio barrio : listaBarrios) {
				
				if(barrio.getListaPropiedades().size() > barrioMax.getListaPropiedades().size()) {
					barrioMax = barrio;
					listaBarriosMax.clear();
					listaBarriosMax.add(barrioMax);
				} else if (barrio.getListaPropiedades().size() == barrioMax.getListaPropiedades().size()) {
					listaBarriosMax.add(barrio);
				} 
			}
			
		}
		return listaBarriosMax;
	}
	
	public void mostrarBarrioMaxProp() {
		ArrayList<Barrio> listaBarriosMax = obtenerBarrioMaxProp();
		mostrarPropiedades(listaBarriosMax);
	}
	
	public void cambiarPropiedadDeBarrio(String domicilio, Barrio barrio) {
		int i = 0;
		Propiedad propiedadEncontrada = null;
		Barrio barrioActual = null;
		
		while(i < listaBarrios.size() && propiedadEncontrada == null) {
			barrioActual = listaBarrios.get(i);
			propiedadEncontrada = barrioActual.buscarPropiedad(domicilio);
			i++;
		}
		
		if(propiedadEncontrada != null && barrioActual != null) {
			barrio.agregarPropiedad(propiedadEncontrada);
			barrioActual.eliminarPropiedad(propiedadEncontrada);
		} else {
			System.out.println("La propiedad que deseas mover no se encuentra en el barrio especificado");
		}
	}
	
	public void borrarPropiedad(String domicilio) {
		int i = 0;
		Propiedad propiedadEncontrada = null;
		Barrio barrioActual = null;
		
		while(i < listaBarrios.size() && propiedadEncontrada == null) {
			barrioActual = listaBarrios.get(i);
			propiedadEncontrada = barrioActual.buscarPropiedad(domicilio);
			i++;
		}
		
		if(propiedadEncontrada != null) {
			barrioActual.eliminarPropiedad(propiedadEncontrada);
		} else {
			System.out.println("La propiedad que intentas borrar no existe");
		}
	}
	
	public Barrio buscarBarrio(Barrio barrio) {
		int i = 0;
		Barrio barrioEncontrado = null;
		
		while(i < listaBarrios.size() && barrioEncontrado == null) {
			Barrio barrioActual = listaBarrios.get(i);
			
			if(barrioActual == barrio) {
				barrioEncontrado = barrioActual;
			} else {
				i++;
			}
		}
		return barrioEncontrado;
	}
	
	public void agregarBarrio(Barrio barrio) {
		Barrio barrioAgregar = buscarBarrio(barrio);
		
		if(barrioAgregar == null) {
			listaBarrios.add(barrio);
		} else {
			System.out.println("El barrio que intentas agregar ya existe");
		}
	}
	
}
