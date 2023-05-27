package ort.edu.ar.tp3.ej2;

public class Empleado {
	private String nombre;
	private String dni;
	
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
