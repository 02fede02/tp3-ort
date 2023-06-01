package ort.edu.ar.tp3.ej8;

public class Turno {
	private Paciente paciente;
	private boolean presencia;
	
	public Turno(Paciente paciente) {
		this.paciente = paciente;
		this.presencia = false;
	}

	public boolean isPresencia() {
		return presencia;
	}

	public void setPresencia(boolean presencia) {
		this.presencia = presencia;
	}
	
	public Paciente getPaciente() {
		return this.paciente;
	}
}
