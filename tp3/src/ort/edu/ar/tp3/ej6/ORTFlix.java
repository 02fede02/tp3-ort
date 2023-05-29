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
	
	private Cliente buscarCliente(String dni, ArrayList<Cliente> lista) {
		Cliente clienteEncontrado = null;
		int i = 0;
		
		while(i < lista.size() && clienteEncontrado == null) {
			Cliente clienteActual = clientes.get(i);
			
			if(clienteActual.getDni().equals(dni)) {
				clienteEncontrado = clienteActual;
			} else {
				i++;
			}
		}
		return clienteEncontrado;
	}
	
	private Pelicula buscarPelicula(String nombre) {
		Pelicula peliculaEncontrada = null;
		int i = 0;
		
		while(i < catalogo.size() && peliculaEncontrada== null) {
			Pelicula peliculaActual = catalogo.get(i);
			
			if(peliculaActual.getNombre().equals(nombre)) {
				peliculaEncontrada = peliculaActual;
			} else {
				i++;
			}
		}
		return peliculaEncontrada;
	}
	
	public OperacionVerPelicula verPelicula(String dni, String pelicula) {
		OperacionVerPelicula estado = null;
		Cliente cliente = buscarCliente(dni, clientes);
		Pelicula peliculaVer = buscarPelicula(pelicula);
		
		if(cliente == null) {
			estado = OperacionVerPelicula.CLIENTE_INEXISTENTE;
		} else if(peliculaVer == null) {
			estado = OperacionVerPelicula.CONTENIDO_INEXISTENTE;
		} else if(cliente.esDeudor()) {
			estado = OperacionVerPelicula.CLIENTE_DEUDOR;
		} else if(!peliculaVer.getCategoria().equals(cliente.getSuscripcion())) {
			estado = OperacionVerPelicula.CONTENIDO_NO_DISPONIBLE;
		} else {
			estado = OperacionVerPelicula.OK;
			cliente.agregarPelicula(peliculaVer);
		}
		
		return estado;
	}
	
	public void darDeBaja(String dni) {
		Cliente cliente = buscarCliente(dni, clientes);
		
		if(cliente != null) {
			if(cliente.esDeudor()) {
				listaNegra.add(cliente);
			}
			clientes.remove(cliente);
		} else {
			System.out.println("La persona que deseas eliminar no es cliente");
		}
	}
	
	public AltaCliente darDeAlta(String dni, Categoria categoria) {
		AltaCliente estado = null;
		Cliente cliente = buscarCliente(dni,clientes);
		Cliente clienteVetado = buscarCliente(dni, listaNegra);
		
		if(cliente != null) {
			estado = AltaCliente.CLIENTE_EXISTENTE;
		} else if(clienteVetado != null) {
			estado = AltaCliente.CLIENTE_DEUDOR;
		} else {
			estado = AltaCliente.ALTA_OK;
		}
		
		return estado;
	}
	
	public void depurarListaNegra(double importe) {
		for (Cliente cliente : listaNegra) {
			if(cliente.getSaldoPagar() <= importe) {
				listaNegra.remove(cliente);
			}
		}
	}
}
