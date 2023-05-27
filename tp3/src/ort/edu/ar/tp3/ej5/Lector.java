package ort.edu.ar.tp3.ej5;

import java.util.ArrayList;

public class Lector {
	private String dni;
	private String nombre;
	private String direccion;
	private String telefono;
	private ArrayList<Ejemplar> prestamosVigentes;
	
	public Lector(String dni, String nombre, String direccion, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.prestamosVigentes = new ArrayList<Ejemplar>();
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getCantLibrosVigentes() {
		return prestamosVigentes.size();
	}
	
}
