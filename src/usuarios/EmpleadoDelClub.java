package usuarios;

public abstract class EmpleadoDelClub extends Usuario {
	
	private static final long serialVersionUID = 1L;
	
	private String codigoDescuento;
	private int puntosFidelidad;
	
	public EmpleadoDelClub (String nombre, String login, String password, String codigoDescuento, int PuntosFidelidad) {
		super(nombre, login, password);
		this.codigoDescuento = codigoDescuento;
		this.puntosFidelidad = PuntosFidelidad;
	}

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	public int getPuntosFidelidad() {
		return puntosFidelidad;
	}

	public void setPuntosFidelidad(int puntosFidelidad) {
		this.puntosFidelidad = puntosFidelidad;
	}
	
	

}
