package ort.edu.ar.tp3.ej7;

import java.util.ArrayList;

public class Usuario {
	private String email;
	private int edad;
	private ArrayList<Cancion> canciones;
	private Categoria categoria;
	
	public Usuario(String email, int edad, Categoria categoria) {
		this.email = email;
		this.edad = edad;
		this.canciones = new ArrayList<Cancion>();
		this.categoria = categoria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void agregarCancion(Cancion cancion) {
		this.canciones.add(cancion);
	}
}
