package ort.edu.ar.tp3.ej7;

public class Cancion {
	private String nombre;
	private String autor;
	private String genero;
	private Contador diasPublicada;
	private Contador vecesReproducida;
	private Categoria categoria;
	
	public Cancion(String nombre, String autor, String genero) {
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
		this.diasPublicada = new Contador();
		this.vecesReproducida = new Contador();
		this.categoria = Categoria.PREMIUM;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Contador getDiasPublicada() {
		return diasPublicada;
	}
	public void setDiasPublicada(Contador diasPublicada) {
		this.diasPublicada = diasPublicada;
	}
	public Contador getVecesReproducida() {
		return vecesReproducida;
	}
	public void setVecesReproducida(Contador vecesReproducida) {
		this.vecesReproducida = vecesReproducida;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
