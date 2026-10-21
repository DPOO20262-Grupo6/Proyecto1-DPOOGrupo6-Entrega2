package deportesDeConjunto;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class PartidoDeEquipo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private LocalDate fecha;
	private String deporte;
	
	private ResultadoPartidoEquipo resultado;
	
	public PartidoDeEquipo(LocalDate fecha, String deporte) {
		this.fecha = fecha;
		this.deporte = deporte;
		this.resultado = null;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public ResultadoPartidoEquipo getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoPartidoEquipo resultado) {
		this.resultado = resultado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
