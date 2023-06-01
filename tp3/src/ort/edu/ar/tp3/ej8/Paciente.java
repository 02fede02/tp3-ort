package ort.edu.ar.tp3.ej8;

public class Paciente {
	private String dni;
	private String nombre ;
	private String apellido;
	
	public Paciente(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Paciente " + this.nombre + ", " + apellido + " " + this.dni;
	}
	
	public boolean equals(String dni) {
		return this.dni.equals(dni);
	}
	
}
