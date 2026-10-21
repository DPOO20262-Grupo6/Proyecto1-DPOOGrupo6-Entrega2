package deportesDeConjunto;

import java.time.LocalDate;

public class PartidoInterno extends PartidoDeEquipo {
	
	private static final long serialVersionUID = 1L;
	
	private Equipo local; 
	private Equipo visitante;

	public PartidoInterno(LocalDate fecha, String deporte, Equipo local, Equipo visitante) {
		super(fecha, deporte);
		this.local = local;
		this.visitante = visitante;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
