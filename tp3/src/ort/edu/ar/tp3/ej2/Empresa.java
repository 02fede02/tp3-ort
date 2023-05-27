package ort.edu.ar.tp3.ej2;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Area> listaAreas;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.listaAreas = new ArrayList<Area>();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	private Area buscarArea(Area area) {
		int i = 0;
		Area areaEncontrada = null;
		
		while(i < listaAreas.size() && areaEncontrada == null) {
			Area areaActual = listaAreas.get(i);
			
			if(areaActual.getNombreArea().equals(area.getNombreArea())) {
				areaEncontrada = areaActual;
			} else {
				i++;
			}
		}
		
		return areaEncontrada;
	}
	
	
	public void agregarArea(Area area) {
		Area areaEncontrada = buscarArea(area);
		
		if(areaEncontrada == null) {
			listaAreas.add(area);
			System.out.println("Se agrego el area " + area.getNombreArea());
		} else {
			System.out.println("Ya existe el area de " + areaEncontrada.getNombreArea());
		}
	}
	
	public void eliminarArea(Area area) {
		Area areaEncontrada = buscarArea(area);
		
		if(areaEncontrada != null) {
			listaAreas.remove(area);
			System.out.println("Se elimino el area " + area.getNombreArea());
		} else {
			System.out.println("No existe el area de " + area.getNombreArea());
		}
	}
	
	public void listarAreas() {
		System.out.println("La empresa " + this.getNombre());
		for (Area area : listaAreas) {
			area.listaOficinas();
		}
	}
}
