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
		int i, j, k;
		int cantPreguntas = persona[0].getSumaValores().length;
		int cantRespuestasIguales = 0;
		boolean agregadoAlTeam = false;
		boolean continuarBuscando = true;
		ArrayList<Persona> aRemover = new ArrayList<Persona>();
		Equipo equipo = new Equipo();
		equipos = new ArrayList<Equipo>();
		for(i = 0; i < cantPreguntas - 1; i++) {
			for (Persona p : persona) //Agrega a todos los colaboradores al equipo.
				equipo.agregarColaborador(p);
			for(j = 0; j < cantPreguntas & continuarBuscando == true; j++) {
				cantRespuestasIguales = j;
				for(k = i + 1; k < persona.length; k++) {
					if(persona[i].getSumaValores()[j] != persona[k].getSumaValores()[j])
						aRemover.add(persona[k]);
					else
						agregadoAlTeam = true;
				}
				if(agregadoAlTeam == true) {
					for (Persona p : aRemover)
						equipo.removerColaborador(p);
				}
				else
					continuarBuscando = false;
			}
			equipo.setRespuestasIguales(cantRespuestasIguales);
			equipos.add(equipo);
			equipo = new Equipo();
		}
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
