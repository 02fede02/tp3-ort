package ort.edu.ar.tp3.ej1;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private Domicilio domicilio;
	
	public Persona(String nombre, String apellido, String dni, Domicilio domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}
	
	public String obtenerDni() {
		return this.dni;
	}
	
	public void ponerDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public void mostrarDomicilio() {
		System.out.println(domicilio.getDomicilio());
	}
	
	public String toString() {
		return this.nombre + " " + this.apellido + " " + this.dni;
	}
}
