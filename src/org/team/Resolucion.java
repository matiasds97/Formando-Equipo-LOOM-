package org.team;

import java.util.ArrayList;

public class Resolucion {

	ArrayList<Equipo> equipos;
	Persona[] persona;

	public Resolucion(Persona[] personas) {
		this.equipos = new ArrayList<Equipo>();
		this.persona = personas;
	}

	public void crearEquipos() {
		// Por cada chabon, comparar a las personas a ver con cual tiene maxima
		// afinidad, es decir
		// obtener la cantidad maxima y despues fijarse cuales son los que tienen esa
		// cantidad de afinidad
		// y agregarlos al mismo team.
		int longitud = this.persona.length;
		for(int i = 0; i < longitud - 1; i++) {
			int maximo = this.obtenerMaximaCoincidencia(i);
			if(maximo != 0) {
				Equipo e = new Equipo();
				e.agregarColaborador(this.persona[i]);
				for(int j = i + 1; j < longitud; j++) {
					if(this.compararPersonas(this.persona[i], this.persona[j]) == maximo)
						e.agregarColaborador(this.persona[j]);
				}
				e.setRespuestasIguales(maximo);
				this.equipos.add(e);
			}
		}
	}

	/**
	 * 
	 * @param p1 Persona a comparar
	 * @param p2 Otra persona a comparar
	 * @return Cantidad de preguntas en las que coinciden de forma consecutiva.
	 */
	public int compararPersonas(Persona p1, Persona p2) { // Cambiar a private
		int cantPreguntas = 0;
		char[] a = p1.getPreguntas();
		char[] b = p2.getPreguntas();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i])
				cantPreguntas++;
			else
				return cantPreguntas;
		}
		return cantPreguntas;
	}

	/**
	 * 
	 * @return Devuelve la maxima cantidad de respuestas consecutivas iguales entre una persona y las demas. 
	 */
	public int obtenerMaximaCoincidencia(int indexPersona) {
		int cantPreguntas = this.persona[0].getPreguntas().length;
		int cantPersonas = this.persona.length;
		int maximo = 0;
		for (int j = indexPersona + 1; j < cantPersonas; j++) {
				int valor = compararPersonas(this.persona[indexPersona],this.persona[j]);
				if(maximo < valor)
					maximo = valor;
		}
		return maximo;
	}

	public Equipo equipoMaximaAfinidad() {
		Equipo equipoMax;
		equipoMax = equipos.remove(0);
		for (int i = 0; i < equipos.size(); i++) {
			Equipo auxiliar = equipos.remove(0);
			if (equipoMax.getAfinidad() < auxiliar.getAfinidad())
				equipoMax = auxiliar;
		}
		return equipoMax;
	}

}
