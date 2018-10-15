package org.team;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class ResolucionTest {

	@Test
	public void test() throws IOException {
		ArchivoEquipo ae = new ArchivoEquipo();
		Resolucion r;
		r = new Resolucion(ae.leerArchivo());
		//r.crearEquipos();
		Assert.assertSame(r.persona[0].getPreguntas(), r.persona[1].getPreguntas());
		System.out.println("MADAFAKE: " + r.compararPersonas(r.persona[0], r.persona[3]));
		//ae.escribirArchivo(r.equipoMaximaAfinidad());
	}

}
