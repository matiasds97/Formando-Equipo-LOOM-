package org.team;
import java.util.ArrayList;

public class Resolucion {
	
	public Equipo crearEquipos(Persona[] personas) {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		char primerRespuesta;
		int cantidadRespuestasIguales;
		int colaboradoresPorEquipo;
		for(int i = 0; i < personas.length - 1; i++) { //En este for vamos recorriendo colaborador a colaborador
			colaboradoresPorEquipo = 0;
			cantidadRespuestasIguales = 0;
			primerRespuesta = personas[i].getPreguntas()[0];
			for (int j = i + 1; j < personas.length; j++) { //En este vamos a comparar el colaborador del for de afuera con los demás.
				if(personas[j].getPreguntas()[0] == primerRespuesta)
					ca
			}
		}
		
		return null;
	}
	
	public Equipo equipoMaximaAfinidad(Equipo[] equipos) {
		return null;
	}

}
