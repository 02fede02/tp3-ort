package ort.edu.ar.tp3.ej1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Persona> personas;
	
	public Agenda() {
		personas = new ArrayList<Persona>();
	}
	
	private Persona buscarPersona(String dni) {
		int i = 0;
		Persona personaEncontrada = null;
		
		while(i < personas.size() && personaEncontrada == null) {
			if (personas.get(i).obtenerDni() == dni) {
				personaEncontrada = personas.get(i);
			} else {
				i++;				
			}
		}
		return personaEncontrada;
	}
	
	public boolean agregarPersona(String nombre, String apellido, String dni, Domicilio domicilio) {
		boolean seAgrego = false;
		
		if(buscarPersona(dni) == null) {
			seAgrego = personas.add(new Persona(nombre, apellido, dni, domicilio));
		}
		
		return seAgrego;		
	}
	
	public Persona removerPersona(String dni) {
		Persona personaEncontrada = buscarPersona(dni);
		if(personaEncontrada != null) {
				this.personas.remove(personaEncontrada);
		}
		return personaEncontrada;
	}
	
	public boolean modificarDomicilio(String dni, Domicilio domicilio) {
		Persona persona = this.buscarPersona(dni);
		boolean seModifico = false;
		
		if (persona != null) {
			persona.ponerDomicilio(domicilio);
			seModifico = !seModifico;
		}
		
		return seModifico;
	}
	
	public void listarPersonas() {
		for (Persona persona : personas) {
			System.out.println(persona);
			persona.mostrarDomicilio();
		}
	}
	
	public Persona devolverUltimo() {
		Persona persona = null;
		if(!personas.isEmpty()) {
			persona = personas.get(personas.size() - 1);
		}
		return persona;
	}
	
	public void eliminarTodosElementosAMano() {
		int tamanio = personas.size() - 1; 

	    for (int i = tamanio; i >= 0; i--) {
	        personas.remove(i); 
	    }
	    
//	    while(!this.personas.isEmpty()) {
//	    	this.personas.remove(0);
//	    }
	}
}
