package inscripciones;

import java.io.Serializable;

import usuarios.Socio;

public class InscripcionEquipo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String posicion;
	private int numeroCamiseta;
	
	private Socio socio;

	public InscripcionEquipo(String posicion, int numeroCamiseta, Socio socio) {
		this.posicion = posicion;
		this.numeroCamiseta = numeroCamiseta;
		this.socio = socio;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
}
