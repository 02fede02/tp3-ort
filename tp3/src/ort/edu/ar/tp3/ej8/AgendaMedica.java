package ort.edu.ar.tp3.ej8;

import java.util.ArrayList;

public class AgendaMedica {
	private int cantTurnos;
	private int turnosDisponibles;
	private ArrayList<Turno> turnos;
	
	
	
	public AgendaMedica(int cantTurnos) {
		this.cantTurnos = cantTurnos;
		this.turnos = new ArrayList<Turno>();
	}
	
	public int getTurnosDisponibles() {
		return this.turnosDisponibles;
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
	
	public EstadoTurno registrarTurno(String dni, String nombre, String apellido, String telefono) {
		Turno turno = buscarTurno(dni);
		EstadoTurno registroTurno = EstadoTurno.TURNO_CONFIMADO;
		
		if(turno != null) {
			registroTurno = EstadoTurno.TURNO_PREVIO;
		} else if(this.getTurnosDisponibles() == 0 ) {
			registroTurno = EstadoTurno.SIN_TURNOS;
		}
		
		return registroTurno;
	}
}
