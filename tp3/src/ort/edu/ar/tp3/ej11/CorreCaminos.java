package ort.edu.ar.tp3.ej11;

import java.util.ArrayList;

public class CorreCaminos {
	private ArrayList<Carrera> carreras;
	
	public CorreCaminos() {
		this.carreras = new ArrayList<Carrera>();
	}
	
	public Carrera buscarCarrera(int fecha) {
		int i = 0;
		Carrera carreraEncontrada = null;
		
		while(i < this.carreras.size() && carreraEncontrada == null) {
			Carrera carreraActual = this.carreras.get(i);
			
			if(carreraActual.getFecha() == fecha) {
				//TODO hacer metodo para que lo compruebe la clase carrera
				carreraEncontrada = carreraActual;
			} else {
				i++;
			}
		}
		return carreraEncontrada;
	}
	
	public ArrayList<Piloto> pilotosPorCarrera(){
		ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
		
		if(!this.carreras.isEmpty()) {
			for (Carrera carrera : this.carreras) {
				carrera.agregarPiloto(pilotos);
			}
		}
		
		return pilotos;
	}
}
