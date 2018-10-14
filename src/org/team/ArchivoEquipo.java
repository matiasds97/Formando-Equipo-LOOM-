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
			String stringu = sc.nextLine();
			for(int j = 0; j < stringu.length(); j++) 
				preguntas[j] = stringu.charAt(j);
			
			personas[i] = new Persona(preguntas);
		}
		
		sc.close();
		return personas;
	}
	
	public void escribirArchivo(Equipo equipo) throws IOException {
		FileWriter fw = new FileWriter("equipo.out");
		PrintWriter pw = new PrintWriter(fw);
		int x = equipo.getAfinidad();
		if(x != 0) 
			pw.println(equipo.getAfinidad());
		else 
			pw.println("No hay equipos con afinidad.");
		String s = equipo.getRespuestas();
		if(s.isEmpty()) 
			pw.print("No hay respuestas para mostrar.");
		else
			pw.print(equipo.getRespuestas());
		pw.close();
		fw.close();
	}
	
}
