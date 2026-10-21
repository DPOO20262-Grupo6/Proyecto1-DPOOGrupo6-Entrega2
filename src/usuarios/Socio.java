package usuarios;

import java.time.LocalDate;


public class Socio extends Usuario {
	
	private static final long serialVersionUID = 1L;

	private LocalDate fechaNacimiento;
	private int puntosDeFidelidad;
	
	public Socio(String nombre, String login, String password, LocalDate fechaNacimiento, int puntosDeFidelidad) {
		super(nombre, login, password);
		this.fechaNacimiento = fechaNacimiento;
		this.puntosDeFidelidad = puntosDeFidelidad;

	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getPuntosDeFidelidad() {
		return puntosDeFidelidad;
	}

	public void setPuntosDeFidelidad(int puntosDeFidelidad) {
		this.puntosDeFidelidad = puntosDeFidelidad;
	}

	
	// METODOS
	
	public InscripcionDisciplinaIndividual inscribirseDisciplina (String disciplina, String nivel, int rankingElo) {
		return new InscripcionDisciplinaIndividual(disciplina, nivel, rankingElo, this);
	}
	
	
	
}
