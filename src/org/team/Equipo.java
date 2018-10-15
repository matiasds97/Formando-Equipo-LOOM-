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
		Persona p = colaboradores.get(0);
		char[] opcionesElegidas = new char[respuestasIguales];
		for(int i = 0; i < this.respuestasIguales; i++)
			respuesta += p.getPreguntas()[i];
		System.out.println(respuesta);
		return respuesta;
	}
	
	public void agregarColaborador(Persona p) {
		this.colaboradores.add(p);
	}
	
	public void removerColaborador(Persona p) {
		this.colaboradores.remove(p);
	}
	
	public void setRespuestasIguales(int respuestasIguales) {
		this.respuestasIguales = respuestasIguales;
	}

	public int getAfinidad() {
		return colaboradores.size() * this.respuestasIguales * this.respuestasIguales;
	}
	
	public void vaciarEquipo() {
		this.colaboradores.clear();
	}

}
