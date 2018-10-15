package org.team;

import java.util.Arrays;

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

	@Override
	public String toString() {
		return "Persona [preguntas=" + Arrays.toString(preguntas) + "]";
	}
	
	
	
}
