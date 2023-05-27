package ort.edu.ar.tp3.ej2;

import java.util.ArrayList;

public class Oficina {
	private String nombreOficina;
	private ArrayList<Empleado> listaEmpleados;
	
	public Oficina(String nombre) {
		this.nombreOficina = nombre;
		this.listaEmpleados = new ArrayList<Empleado>();
	}

	public String getNombreOficina() {
		return nombreOficina;
	}

	public void setNombreOficina(String nombre) {
		this.nombreOficina = nombre;
	}

	public void getListaEmpleados() {
		System.out.println("Oficina de " + getNombreOficina());
		for (Empleado empleado : listaEmpleados) {
			System.out.println(empleado.getNombre() + " " + empleado.getDni());
		}
	}
	
	public Empleado buscarEmpleado(Empleado empleado) {
		int i = 0;
		Empleado empleadoEncontrado = null;
		
		while(i < listaEmpleados.size() && empleadoEncontrado == null) {
			Empleado empleadoActual = listaEmpleados.get(i);
			
			if (empleadoActual.getDni().equals(empleado.getDni())) {
				empleadoEncontrado = empleadoActual; 
			} else {
				i++;
			}
		}
		
		return empleadoEncontrado;
	}

	public void agregarEmpleado(Empleado empleado, Area area) {
		Empleado empleadoEncontrado = area.buscarEmpleadoEnOficinas(empleado);
		
		if (empleadoEncontrado == null) {
			listaEmpleados.add(empleado);
		} else {
			System.out.println("El empleado que intentas agregar ya se encuentra");
		}
	}

	public void removerEmpleado(Empleado empleado) {
		Empleado empleadoRemover = buscarEmpleado(empleado);
		
		if (empleadoRemover != null) {
			listaEmpleados.remove(empleadoRemover);
		}
	}
	
}
