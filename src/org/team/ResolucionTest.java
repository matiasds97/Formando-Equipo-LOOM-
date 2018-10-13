package org.team;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ResolucionTest {

	@Test
	public void test() throws IOException {
		ArchivoEquipo ae = new ArchivoEquipo();
		Resolucion r;
		r = new Resolucion(ae.leerArchivo());
		r.crearEquipos();
		ae.escribirArchivo(r.equipoMaximaAfinidad());
	}

}
