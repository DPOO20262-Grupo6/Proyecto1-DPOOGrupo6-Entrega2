package usuarios;

public class Entrenador extends EmpleadoDelClub {

	private static final long serialVersionUID = 1L;
	
	public Entrenador(String nombre, String login, String password, String codigoDescuento, int puntosFidelidad) {
		super(nombre, login, password, codigoDescuento, puntosFidelidad);
	}

}
