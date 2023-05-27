package ort.edu.ar.tp3.ej1;

public class Domicilio {
	private String calle;
	private int numero;
	private String ciudad;
	
	public Domicilio() {
		calle = "";
		numero = 0;
		ciudad = "";
	}
	
	public Domicilio(String calle, int numero, String ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public String getDomicilio() {
		return calle + " " + numero + ", " + ciudad;
	}
}
