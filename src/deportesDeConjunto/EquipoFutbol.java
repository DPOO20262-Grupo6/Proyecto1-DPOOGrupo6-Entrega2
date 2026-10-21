package deportesDeConjunto;

public class EquipoFutbol extends Equipo {
	
	private static final long serialVersionUID = 1L;
	
	private static final int minimoJugadoresHabilitados = 7;
	private static final String DEPORTE = "FUTBOL";

	public EquipoFutbol(String categoria, String nombre, int cupoMaximoJugadores) {
		super(categoria, nombre, cupoMaximoJugadores);
	}

	public int getMinimoJugadoresHabilitados() {
		return minimoJugadoresHabilitados;
	}

	public String getDEPORTE() {
		return DEPORTE;
	}
}



