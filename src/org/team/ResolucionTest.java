package org.team;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class ResolucionTest {

	@Test
	public void test() throws IOException {
		ArchivoEquipo ae = new ArchivoEquipo();
		Resolucion r = ae.leerArchivo();
		Assert.assertEquals(4, r.obtenerMaximaCoincidencia(1));
		r.crearEquipos();
		ae.escribirArchivo(r.equipoMaximaAfinidad());
	}

}
