package ort.edu.ar.tp3.ej7;

public class Test {
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		app.altaCancion("Roundabout", "Yes", "Rock");
		System.out.println(app.altaUsuario("fede.@gmail.com", 30, Categoria.PREMIUM));
		System.out.println(app.altaUsuario("fedeee.@gmail.com", 30, Categoria.PREMIUM));
		
		System.out.println(app.escucharCancion("fede.@gmail.com", "Roundabout", "Yes"));
		System.out.println(app.escucharCancion("fedea.@gmail.com", "Roundabout", "Yes"));
		System.out.println(app.escucharCancion("fede.@gmail.com", "Roundabouta", "Yes"));
		
		app.listarUsuarios();
		app.listarCancionesPorUsuario("fede.@gmail.com");
		app.listarCancionesPorUsuario("fede.@gmail.coma");
	}
}
