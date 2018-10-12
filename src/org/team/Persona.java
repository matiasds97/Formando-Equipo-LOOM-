package org.team;

public class Persona {
	private char[] preguntas;
	private int[] sumaValores;
	
	public Persona(char[] preguntas) {
		this.preguntas = preguntas;
		sumaValores = new int[preguntas.length];
		obtenerValores();
	}
	
	private void obtenerValores() {
		int suma = 0;
		for(int i = 0; i < this.sumaValores.length; i++) {
			suma+= preguntas[i];
			this.sumaValores[i] = suma; 
		}
	}

	public char[] getPreguntas() {
		return preguntas;
	}
	
}
