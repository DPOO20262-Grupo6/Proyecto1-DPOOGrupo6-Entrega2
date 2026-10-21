package usuarios;

public class Fisioterapeuta extends EmpleadoDelClub {

	private static final long serialVersionUID = 1L;
	
	public Fisioterapeuta(String nombre, String login, String password, String codigoDescuento, int puntosFidelidad) {
		super(nombre, login, password, codigoDescuento, puntosFidelidad);
	}
	

}
