package ort.edu.ar.tp3.ej8;

import java.util.ArrayList;

public class AgendaMedica {
	private int cantTurnos;
	private ArrayList<Turno> turnos;
	
	public AgendaMedica(int cantTurnos) {
		this.cantTurnos = cantTurnos;
		this.turnos = new ArrayList<Turno>();
	}
	
	private Turno buscarTurno(String dni) {
		Turno turno = null;
		int i = 0;
		
		while(i < turnos.size() && turno == null) {
			
			Turno turnoActual = turnos.get(i);
			Paciente paciente = turnoActual.getPaciente();
			if(paciente.equals(dni)) {
				turno = turnoActual;
			} else {
				i++;
			}
		}
		return turno;
	}
}
