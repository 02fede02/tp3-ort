package ort.edu.ar.tp3.ej6;

import java.util.ArrayList;

public class ORTFlix {
	private ArrayList<Pelicula> catalogo;
	private ArrayList<Cliente> clientes;
	private ArrayList<Cliente> listaNegra;
	
	public ORTFlix() {
		this.catalogo = new ArrayList<Pelicula>();
		this.clientes = new ArrayList<Cliente>();
		this.listaNegra = new ArrayList<Cliente>();
	}
	
	public OperacionVerPelicula verPelicula(String dni, String pelicula) {
		OperacionVerPelicula estado = null;
		
		return estado;
	}
	
	public void darDeBaja(String dni) {
		
	}
	
	public AltaCliente darDeAlta(String dni, Categoria categoria) {
		AltaCliente estado = null;
		
		return estado;
	}
	
	public void depurarListaNegra(double importe) {
		
	}
}
