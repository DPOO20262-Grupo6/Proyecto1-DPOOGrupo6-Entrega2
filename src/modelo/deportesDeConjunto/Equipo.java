package modelo.deportesDeConjunto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import modelo.inscripciones.InscripcionEquipo;

public abstract class Equipo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String categoria;
	private String nombre;
	private int cupoMaximoJugadores;
	private List<InscripcionEquipo> inscripciones;
	
	public Equipo(String categoria, String nombre, int cupoMaximoJugadores) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.cupoMaximoJugadores = cupoMaximoJugadores;
		this.inscripciones = new ArrayList<>();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCupoMaximoJugadores() {
		return cupoMaximoJugadores;
	}

	public void setCupoMaximoJugadores(int cupoMaximoJugadores) {
		this.cupoMaximoJugadores = cupoMaximoJugadores;
	}

	public List<InscripcionEquipo> getInscripciones() {
		return inscripciones;
	}

	public void setInscripciones(List<InscripcionEquipo> inscripciones) {
		this.inscripciones = inscripciones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
