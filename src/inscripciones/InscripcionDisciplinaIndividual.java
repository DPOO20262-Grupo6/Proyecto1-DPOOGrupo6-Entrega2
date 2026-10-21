package inscripciones;

import java.io.Serializable;

import usuarios.Socio;

public class InscripcionDisciplinaIndividual implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String disciplina;
	private String nivel;
	private int rankingElo;
	private Socio socio;
	
	public InscripcionDisciplinaIndividual(String disciplina, String nivel, int rankingElo, Socio socio) {
		this.disciplina = disciplina;
		this.nivel = nivel;
		this.rankingElo = rankingElo;
		this.socio = socio;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getRankingElo() {
		return rankingElo;
	}

	public void setRankingElo(int rankingElo) {
		this.rankingElo = rankingElo;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
}
