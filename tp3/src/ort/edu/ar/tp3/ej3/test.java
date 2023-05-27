package ort.edu.ar.tp3.ej3;

public class test {
	public static void main(String[] args) {
		Inmobiliaria inmobiliaria = new Inmobiliaria("Los ladrones");
		Barrio villaReal = new Barrio("Villa Real");
		Barrio villaDevoto = new Barrio("Villa Devoto");
		Barrio monteCastro = new Barrio("Monte Castro");
		
		villaReal.agregarPropiedad(new Propiedad("Virgilio 2448", 120, Tipo.PH));
		villaReal.agregarPropiedad(new Propiedad("Virgilio 2348", 100, Tipo.CASA));
		
		villaDevoto.agregarPropiedad(new Propiedad("Av.Beiro 2448", 120, Tipo.PH));
		villaDevoto.agregarPropiedad(new Propiedad("Av.Beiro 2348", 100, Tipo.CASA));
		
		monteCastro.agregarPropiedad(new Propiedad("Av.Jonte 2448", 120, Tipo.PH));
		monteCastro.agregarPropiedad(new Propiedad("Av.Jonte 2348", 100, Tipo.CASA));
		monteCastro.agregarPropiedad(new Propiedad("Av.Jonte 148", 100, Tipo.CASA));
		
		inmobiliaria.agregarBarrio(monteCastro);
		inmobiliaria.agregarBarrio(villaReal);
		inmobiliaria.agregarBarrio(villaDevoto);
		
		inmobiliaria.cambiarPropiedadDeBarrio("Av.Jonte 148", villaDevoto);
		inmobiliaria.borrarPropiedad("Av.Jonte 148");
		inmobiliaria.mostrarBarrioMaxProp();
	}
}
