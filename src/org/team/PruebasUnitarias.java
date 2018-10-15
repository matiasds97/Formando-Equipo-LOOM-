package org.team;

import java.io.IOException;

import org.junit.Test;

public class PruebasUnitarias {

	@Test
	public void lecturaArchivo() throws IOException { //TO' OK.
		ArchivoEquipo a = new ArchivoEquipo();
		Resolucion maradona = a.leerArchivo();
		for (Persona p : maradona.persona) {
			for (char c : p.getPreguntas()) {
				System.out.println(c);
			}
			System.out.println("\n");
		}
	}
	
	@Test
	public void testComparacion() {
		Resolucion r = new Resolucion();
		Persona p1 = new Persona(new  char[] {'a', 'b', 'c', 'd', 'e'});
		Persona p2 = new Persona(new  char[] {'a', 'b', 'c', 'e', 'd'});
		System.out.println(r.compararPersonas(p1, p2));
	}

}
