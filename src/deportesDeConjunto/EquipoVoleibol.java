package deportesDeConjunto;

public class EquipoVoleibol extends Equipo {
	
	private static final long serialVersionUID = 1L;
	
	private static final int minimoJugadoresHabilitados = 6;
	private static final String DEPORTE = "VOLEIBOL";

	public EquipoVoleibol(String categoria, String nombre, int cupoMaximoJugadores) {
		super(categoria, nombre, cupoMaximoJugadores);
	}

	public int getMinimoJugadoresHabilitados() {
		return minimoJugadoresHabilitados;
	}

	public String getDEPORTE() {
		return DEPORTE;
	}

}
