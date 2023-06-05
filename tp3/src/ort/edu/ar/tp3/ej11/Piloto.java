package ort.edu.ar.tp3.ej11;

public class Piloto {
	private String nombre;
	private String dni;
	private int cantVueltas;
	private double tiempoVuelta;
	private double sumaTiempo;
	private double promedioVueltas;
	
	public Piloto(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.cantVueltas = 0;
		this.tiempoVuelta = 0;
		this.sumaTiempo = 0;
		this.promedioVueltas = 0;
	}
	
	
	
	public int getCantVueltas() {
		return cantVueltas;
	}



	public void setCantVueltas(int cantVueltas) {
		this.cantVueltas = cantVueltas;
	}



	public double getTiempoVuelta() {
		return tiempoVuelta;
	}



	public void setTiempoVuelta(double tiempoVuelta) {
		this.tiempoVuelta = tiempoVuelta;
	}



	public double getSumaTiempo() {
		return sumaTiempo;
	}



	public void setSumaTiempo(double sumaTiempo) {
		this.sumaTiempo = sumaTiempo;
	}



	public String getNombre() {
		return nombre;
	}



	public String getDni() {
		return dni;
	}



	public double getPromedioVueltas() {
		return promedioVueltas;
	}

	private void calcularVueltaPromedio() {
		if(this.cantVueltas > 0 ) {
			this.promedioVueltas = this.sumaTiempo / this.cantVueltas;
		} else {
			System.out.println("El piloto no realizo ninguna vuelta");
		}
	}
	
	public boolean estaPorDebajoDe(int tiempo) {
		this.calcularVueltaPromedio();
		return this.getCantVueltas() >= 10 && this.promedioVueltas < tiempo;
	}
	
	public String toString() {
		return this.getNombre() + " " + this.getDni();
	}
}
