package org.team;

public class Equipo {
	
	private int afinidad;
	private Persona[] personas;
	
	public Equipo(Persona[] eq, int afinidad) {
		this.personas = eq;
		this.afinidad = afinidad;
	}

	public int getAfinidad() {
		return afinidad;
	}

	public void setAfinidad(int afinidad) {
		this.afinidad = afinidad;
	}

	public Persona[] getPersonas() {
		return personas;
	}

	public void setPersonas(Persona[] personas) {
		this.personas = personas;
	}
}
