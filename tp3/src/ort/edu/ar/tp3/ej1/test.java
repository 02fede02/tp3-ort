package ort.edu.ar.tp3.ej1;

public class test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.listarPersonas();
		agenda.agregarPersona("Draco", "Birman", "3727666", new Domicilio());
		agenda.agregarPersona("Rafa", "Birman", "3776666", new Domicilio());
		agenda.agregarPersona("Rosa", "Birman", "3276666", new Domicilio());
		System.out.println(agenda.agregarPersona("Rosa", "Birman", "3276666", new Domicilio()));
		System.out.println(agenda.removerPersona("3276666"));
//		agenda.eliminarTodosElementosAMano();
//		System.out.println("Personas luego del metodo eliminartodosamano");
//		agenda.agregarPersona("Draco", "Birman", "3727666", new Domicilio());
//		agenda.agregarPersona("Rafa", "Birman", "3776666", new Domicilio());
//		agenda.agregarPersona("Rosa", "Birman", "3276666", new Domicilio());
//		System.out.println("Personas luego de agregarlso nuevamente");
//		agenda.listarPersonas();
		
	}

}
