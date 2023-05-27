package ort.edu.ar.tp3.ej5;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private String fechaNacimiento;

	public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
