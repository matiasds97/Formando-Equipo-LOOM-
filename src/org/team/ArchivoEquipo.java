package org.team;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoEquipo {
	
	public Persona[] leerArchivo() throws IOException {
		char[] preguntas;
		Persona[] personas;
		int cantidadPreguntas;
		int cantidadColaboradores;
		File archivo = new File("equipo.in");
		Scanner sc = new Scanner(archivo);
		cantidadPreguntas = sc.nextInt();
		cantidadColaboradores = sc.nextInt();
		preguntas = new char[cantidadPreguntas];
		personas = new Persona[cantidadColaboradores];
		for(int i = 0 ; i < cantidadColaboradores; i++) {
			for(int j = 0; j < cantidadPreguntas; j++)
				preguntas[j] = sc.next().charAt(0);
			personas[0] = new Persona(preguntas);
		}
		sc.close();
		return personas;
	}
	
	public void escribirArchivo(Equipo equipo) throws IOException {
		FileWriter fw = new FileWriter("equipo.out");
		PrintWriter pw = new PrintWriter(fw);
		pw.println(equipo.getAfinidad());
		pw.println(equipo.getRespuestas());
		pw.close();
		fw.close();
	}
	
}
