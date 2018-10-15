package org.team;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoEquipo {

	public Resolucion leerArchivo() throws IOException {
		char[] preguntas;
		Persona[] personas;
		int cantidadPreguntas;
		int cantidadColaboradores;
		File archivo = new File("equipo.in");
		Scanner sc = new Scanner(archivo);
		cantidadPreguntas = sc.nextInt();
		cantidadColaboradores = sc.nextInt();
		personas = new Persona[cantidadColaboradores];
		String siguienteLinea = sc.nextLine();
		for(int i = 0 ; i < cantidadColaboradores; i++) {
			preguntas = new char[cantidadPreguntas];
			siguienteLinea = sc.nextLine();
			for(int j = 0; j < siguienteLinea.length(); j++)
				preguntas[j] = siguienteLinea.charAt(j);
			personas[i] = new Persona(preguntas);
		}
		sc.close();
		return new Resolucion(personas);
	}

	public void escribirArchivo(Equipo equipo) throws IOException {
		FileWriter fw = new FileWriter("equipo.out");
		PrintWriter pw = new PrintWriter(fw);
		int x = equipo.getAfinidad();
		if (x != 0)
			pw.println(equipo.getAfinidad());
		else
			pw.println("No hay equipos con afinidad.");
		String s = equipo.getRespuestas();
		if (s.isEmpty())
			pw.print("No hay respuestas para mostrar.");
		else
			pw.print(s);
		pw.close();
		fw.close();
	}

}
