package inscripciones;

import usuarios.Socio;

public class InscripcionEquipoFutbol extends InscripcionEquipo{
	
	private static final long serialVersionUID = 1L;
	
	private int tarjetasAmarillasAcumuladasInterno;
	private boolean suspendidoInterno;
	
	public InscripcionEquipoFutbol(String posicion, int numeroCamiseta, Socio socio, int tarjetasAmarillasAcumuladasInterno, boolean suspendidoInterno) {
		super(posicion, numeroCamiseta, socio);
		this.tarjetasAmarillasAcumuladasInterno = tarjetasAmarillasAcumuladasInterno;
		this.suspendidoInterno = suspendidoInterno;
	}

	public int getTarjetasAmarillasAcumuladasInterno() {
		return tarjetasAmarillasAcumuladasInterno;
	}

	public void setTarjetasAmarillasAcumuladasInterno(int tarjetasAmarillasAcumuladasInterno) {
		this.tarjetasAmarillasAcumuladasInterno = tarjetasAmarillasAcumuladasInterno;
	}

	public boolean isSuspendidoInterno() {
		return suspendidoInterno;
	}

	public void setSuspendidoInterno(boolean suspendidoInterno) {
		this.suspendidoInterno = suspendidoInterno;
	}
	
	
}
