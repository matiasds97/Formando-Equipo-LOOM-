package org.team;
import java.util.ArrayList;

public class Equipo {
	
	private int respuestasIguales;
	private ArrayList<Persona> colaboradores;
	
	public Equipo() {
		colaboradores = new ArrayList<Persona>();
	}
	
	public String getRespuestas() {
		String respuesta = "";
		char[] opcionesElegidas = new char[respuestasIguales];
		for(int i = 0; i < this.respuestasIguales; i++)
			respuesta += opcionesElegidas[i];
		return respuesta;
	}
	
	public void agregarColaborador(Persona p) {
		this.colaboradores.add(p);
	}
	
	public void setRespuestasIguales(int respuestasIguales) {
		this.respuestasIguales = respuestasIguales;
	}

	public int getAfinidad() {
		return colaboradores.size() * this.respuestasIguales * this.respuestasIguales;
	}

}
