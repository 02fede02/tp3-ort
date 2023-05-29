package ort.edu.ar.tp3.ej6;

public class Test {
	public static void main(String[] args) {
		ORTFlix ort = new ORTFlix();
		
		ort.agregarPelicula(new Pelicula("Requiem for a dream", Categoria.PREMIUM));
		ort.agregarPelicula(new Pelicula("Pleasure", Categoria.PREMIUM));
		ort.agregarPelicula(new Pelicula("Inland empire", Categoria.PREMIUM));
		
		System.out.println(ort.darDeAlta("37276666", Categoria.STANDARD));
		System.out.println(ort.darDeAlta("40276666", Categoria.PREMIUM));
		
		ort.darDeBaja("37276666");
		System.out.println(ort.darDeAlta("37276666", Categoria.STANDARD));
		
	}
}
