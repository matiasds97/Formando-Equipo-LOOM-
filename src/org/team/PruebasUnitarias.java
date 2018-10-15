package org.team;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class PruebasUnitarias {

	@Test
	public void lecturaArchivo() throws IOException {
		ArchivoEquipo a = new ArchivoEquipo();
		Resolucion maradona = a.leerArchivo();
		for (Persona p : maradona.persona) {
			for (char c : p.getPreguntas()) {
				System.out.println(c);
			}
			System.out.println("\n");
		}
	}

}
