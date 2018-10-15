package org.team;

public class Persona {
	private char[] preguntas;
	private int[] sumaValores;
	
	public Persona(char[] preguntas) {
		this.preguntas = preguntas;
	}

	public char[] getPreguntas() {
		return this.preguntas;
	}
	
	public int[] getSumaValores() {
		return this.sumaValores;
	}
	
}
