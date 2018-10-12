package org.team;
import java.util.ArrayList;

public class Equipo {
	
	private int afinidad;
	private int respuestasIguales;
	private int cantidadColaboradores;
	
	public Equipo(int cantidadColaboradores, int respuestasIguales) {
		this.cantidadColaboradores = cantidadColaboradores;
		this.respuestasIguales = respuestasIguales;
		this.afinidad = this.cantidadColaboradores * this.respuestasIguales * this.respuestasIguales;
	}

	public int getAfinidad() {
		return afinidad;
	}
	
	public String getRespuestas() {
		String respuesta = "";
		char[] opcionesElegidas = new char[respuestasIguales];
		for(int i = 0; i < this.respuestasIguales; i++)
			respuesta += opcionesElegidas[i];
		return respuesta;
	}

	public void setAfinidad(int afinidad) {
		this.afinidad = afinidad;
	}

}
