package ort.edu.ar.tp3.ej2;

public class test {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("Empresa papel blando");
		Area areaIT = new Area("Area IT");
		Oficina oficinaIt = new Oficina("IT");
		Oficina oficinaIt2 = new Oficina("ITII");
		
		Area areaRh = new Area("Area Rh");
		Oficina oficinaRh = new Oficina("Oficina recursos humanos mujeres");
		Oficina oficinaRh2 = new Oficina("Oficina recursos humanos varones");
		
		empresa.agregarArea(areaRh);
		empresa.agregarArea(areaIT);
		
		areaRh.agregarOficina(oficinaRh2);
		areaRh.agregarOficina(oficinaRh);
		
		areaIT.agregarOficina(oficinaIt);
		areaIT.agregarOficina(oficinaIt2);
		
		
		Empleado empleado1 = new Empleado("Federico Birman", "37276666");
		Empleado empleado2 = new Empleado("Elito Birman", "4000000");
		Empleado empleado3 = new Empleado("Draco Birman", "48003255");
		Empleado empleado4 = new Empleado("Rafael Birman", "48777");
		Empleado empleado5 = new Empleado("Uma Birman", "487999");
		Empleado empleado6 = new Empleado("Rosa Birman", "47892231");
		Empleado empleado7 = new Empleado("El cuco", "432211");
		Empleado empleado8 = new Empleado("Daniel Hendler", "4879");
		Empleado empleado9 = new Empleado("David Lynch", "78945");
		Empleado empleado10 = new Empleado("Gustav Prolif", "789787");
		Empleado empleado11 = new Empleado("Jim Morrinson", "78515");
		Empleado empleado12 = new Empleado("Jorge Lopez", "78978");
		
		oficinaIt.agregarEmpleado(empleado1, areaIT);
		oficinaIt.agregarEmpleado(empleado2, areaIT);
		oficinaIt.agregarEmpleado(empleado3, areaIT);
		
		oficinaIt2.agregarEmpleado(empleado4, areaIT);
		oficinaIt2.agregarEmpleado(empleado5, areaIT);
		oficinaIt2.agregarEmpleado(empleado6, areaIT);
		

		
		oficinaRh.agregarEmpleado(empleado7, areaRh);
		oficinaRh.agregarEmpleado(empleado8, areaRh);
		oficinaRh.agregarEmpleado(empleado9, areaRh);
		
		oficinaRh2.agregarEmpleado(empleado10, areaRh);
		oficinaRh2.agregarEmpleado(empleado11, areaRh);
		oficinaRh2.agregarEmpleado(empleado12, areaRh);
		oficinaRh.agregarEmpleado(empleado10, areaRh);
		oficinaRh2.agregarEmpleado(empleado10, areaRh);
		
	
		
		empresa.listarAreas();

	}

}
