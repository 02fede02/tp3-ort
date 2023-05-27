package ort.edu.ar.tp3.ej2;

import java.util.ArrayList;

public class Area {
	private String nombreArea;
	private ArrayList<Oficina> listaOficinas;
	
	public Area(String nombre) {
		this.nombreArea = nombre;
		this.listaOficinas = new ArrayList<Oficina>();
	}
	
	public String getNombreArea() {
		return this.nombreArea;
	}
	
	public void setNombreArea(String nombre) {
		this.nombreArea = nombre;
	}
	
	private Oficina buscarOficina(Oficina oficina) {
		int i = 0;
		Oficina oficinaEncontrada = null;
		
		while(i < listaOficinas.size() && oficinaEncontrada == null) {
			Oficina oficinaActual = listaOficinas.get(i);
			
			if(oficinaActual.getNombreOficina().equals(oficina.getNombreOficina())) {
				oficinaEncontrada = oficinaActual;
			} else {
				i++;
			}
		}
		
		return oficinaEncontrada;
	}

	public Empleado buscarEmpleadoEnOficinas(Empleado empleado) {
		int i = 0;
		Empleado empleadoEncontrado = null;
		
		while(i < this.listaOficinas.size() && empleadoEncontrado == null) {
			Oficina oficinaActual = listaOficinas.get(i);
			Empleado empleadoActual = oficinaActual.buscarEmpleado(empleado);
			
			if(empleadoActual != null) {
				empleadoEncontrado = empleadoActual;
			} else {				
				i++;
			}
		}
		
		return empleadoEncontrado;
		
	}
	
	public void listaOficinas() {
		System.out.println();
		System.out.println("Oficinas del " + getNombreArea() + ":");
		for (Oficina oficina : listaOficinas) {
			oficina.getListaEmpleados();
		}
	}
	
	public void agregarOficina(Oficina oficina) {
		Oficina oficinaAgregar = buscarOficina(oficina);
		
		if(oficinaAgregar == null) {
			listaOficinas.add(oficina);
		} else {
			System.out.println("La oficina que intentas agregar ya se encuentra en el area");
		}
	}
	
	public void eliminarOficina(Oficina oficina) {
		Oficina oficinaEliminar = buscarOficina(oficina);
		
		if(oficinaEliminar != null) {
			listaOficinas.remove(oficinaEliminar);
		} else {
			System.out.println("La oficina que intentas eliminar no se encuentra en el area");
		}
	}

}
