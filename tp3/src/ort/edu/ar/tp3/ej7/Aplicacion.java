package ort.edu.ar.tp3.ej7;

import java.util.ArrayList;

public class Aplicacion {
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> usuarios;
	
	public Aplicacion() {
		this.canciones = new ArrayList<Cancion>();
		this.usuarios= new ArrayList<Usuario>();
	}
	
	private Cancion buscarCancion(String nombre, String autor) {
		Cancion cancionEncontrada = null;
		int i = 0;
		
		while(i < canciones.size() && cancionEncontrada == null) {
			Cancion cancionActual = canciones.get(i);
			
			if(cancionActual.getAutor().equals(autor) && cancionActual.getNombre().equals(nombre)) {
				cancionEncontrada = cancionActual;
			} else {
				i++;
			}			
		}
		return cancionEncontrada;
	}

	private Usuario buscarUsuario(String email) {
		Usuario usuarioEncontrado = null;
		int i = 0;
		
		while(i < usuarios.size() && usuarioEncontrado == null) {
			Usuario usuarioActual = usuarios.get(i);
			
			if(usuarioActual.getEmail().equals(email)) {
				usuarioEncontrado = usuarioActual;
			} else {
				i++;
			}
		}
		return usuarioEncontrado;
	}
	
	public boolean altaCancion(String nombre, String autor, String genero) {
		boolean seCargo = false;
		Cancion cancionEncontrado= buscarCancion(nombre, autor);
		
		if(cancionEncontrado == null) {
			canciones.add(new Cancion(nombre, autor, genero));
			seCargo = !seCargo;
		}
		
		return seCargo;
	}
	
	public boolean altaUsuario(String email, int edad, Categoria categoria) {
		boolean seCargo = false;
		Usuario usuarioEncontrado = buscarUsuario(email);
		
		if(usuarioEncontrado == null) {
			usuarios.add(new Usuario(email, edad, categoria));
			seCargo = !seCargo;
		}
		return seCargo;
	}

	public EscucharCancion escucharCancion(String email, String nombre, String autor) {
		Cancion cancionEncontrada = buscarCancion(nombre, autor);
		Usuario usuarioEncontrado = buscarUsuario(email);
		EscucharCancion operacion;
		
		if(usuarioEncontrado == null) {
			operacion = EscucharCancion.USUARIO_INEXISTENTE;
		} else if(cancionEncontrada == null) {
			operacion = EscucharCancion.CANCION_INEXISTENTE;
		} else if(usuarioEncontrado.getCategoria() == Categoria.GRATUITO && usuarioEncontrado.cantCancionesEscuchadas() <= 50) {
			operacion = EscucharCancion.LIMITE_ALCANZADO;
		}  else if(usuarioEncontrado.getCategoria() != Categoria.PREMIUM && (cancionEncontrada.getDiasPublicada() < 7 || cancionEncontrada.getVecesReproducida() < 1000)) {
			operacion = EscucharCancion.CANCION_NO_DISPONIBLE;
		} else {
			usuarioEncontrado.agregarCancion(cancionEncontrada);
			operacion = EscucharCancion.CANCION_ESCUCHADA;
		}
		return operacion;
	}

	public void listarUsuarios() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getEmail() + " escucho un total de " + usuario.cantCancionesEscuchadas() + " canciones.");
		}
	}
	
	public void listarCancionesPorUsuario(String email) {
		Usuario usuarioEncontrado = buscarUsuario(email);
		
		if(usuarioEncontrado != null) {
			usuarioEncontrado.mostrarCancionesEscuchadas();
			System.out.println("Operacion exitosa");
		} else {
			System.out.println("El usuario que intentas buscar no existe");
		}
	}
}
