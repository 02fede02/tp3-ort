package ort.edu.ar.tp3.ej5;

public class Ejemplar {
	private String id;
	private String fechaPrestamo;
	private Estado estado;
	
	public Ejemplar(String id, String fechaPrestamo, Estado estado) {
		super();
		this.id = id;
		this.fechaPrestamo = fechaPrestamo;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
