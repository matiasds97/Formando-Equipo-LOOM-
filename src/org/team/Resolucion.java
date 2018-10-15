package org.team;
import java.util.ArrayList;

public class Resolucion {
	
	ArrayList<Equipo> equipos;
	ArrayList<Persona> persona;
	
	public Resolucion(ArrayList<Persona> personas) {
		this.equipos = new ArrayList<Equipo>();
		this.persona = personas;
	}
	
	public void crearEquipos() {
		
	}
	
	/**
	 * 
	 * @param p1 Persona a comparar
	 * @param p2 Otra persona a comparar
	 * @return Cantidad de preguntas en las que coinciden de forma consecutiva.
	 */
	public int compararPersonas(Persona p1, Persona p2) {
		int cantPreguntas = 0;
		char[] a = p1.getPreguntas();
		char[] b = p2.getPreguntas();
		System.out.println("Persona 1: ");
		for (char c : a) {
			System.out.print(c);
		}
		System.out.println("\nPersona 2: ");
		for (char c : b) {
			System.out.print(c);
		}
		for(int i = 0; i < p1.getPreguntas().length; i++) {
			if(p1.getPreguntas()[i] == p2.getPreguntas()[i])
				cantPreguntas++;
			else
				return cantPreguntas;
		}
		return cantPreguntas;
	}
	
	public Equipo equipoMaximaAfinidad() {
		Equipo equipoMax;
		equipoMax = equipos.remove(0);
		for(int i = 0; i < equipos.size(); i++) {
			Equipo auxiliar = equipos.remove(0);
			if(equipoMax.getAfinidad() < auxiliar.getAfinidad())
				equipoMax = auxiliar;
		}
		return equipoMax;
	}

}
