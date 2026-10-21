package deportesDeConjunto;

public class EquipoBaloncesto extends Equipo {
	
	private static final long serialVersionUID = 1L;
	
	private static final int minimoJugadoresHabilitados = 5;
	private static final String DEPORTE = "BALONCESTO";

	public EquipoBaloncesto(String categoria, String nombre, int cupoMaximoJugadores) {
		super(categoria, nombre, cupoMaximoJugadores);
	}

	public int getMinimoJugadoresHabilitados() {
		return minimoJugadoresHabilitados;
	}

	public String getDEPORTE() {
		return DEPORTE;
	}

}
