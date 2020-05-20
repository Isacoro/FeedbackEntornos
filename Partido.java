package Campeonato.modelo;


public class Partido {
	
	private int ResultadoEquipo1, ResultadoEquipo2;
	private String equipo;
	private String arbitro;
	private String incidencias;
	

	public void ResultadoPartido() {
		if(ResultadoEquipo1 > ResultadoEquipo2) {
			System.out.println("Pasa a la siguiente fase");
		}else {
			System.out.println("Queda eliminado");
		}
	}

	public Partido(int resultadoEquipo1, int resultadoEquipo2, String equipo, String arbitro, String incidencias) {
		super();
		ResultadoEquipo1 = resultadoEquipo1;
		ResultadoEquipo2 = resultadoEquipo2;
		this.equipo = equipo;
		this.arbitro = arbitro;
		this.incidencias = incidencias;
	}

	public int getResultadoEquipo1() {
		return ResultadoEquipo1;
	}

	public void setResultadoEquipo1(int resultadoEquipo1) {
		ResultadoEquipo1 = resultadoEquipo1;
	}

	public int getResultadoEquipo2() {
		return ResultadoEquipo2;
	}

	public void setResultadoEquipo2(int resultadoEquipo2) {
		ResultadoEquipo2 = resultadoEquipo2;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}

	public String getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(String incidencias) {
		this.incidencias = incidencias;
	}

	@Override
	public String toString() {
		return "Partido [ResultadoEquipo1=" + ResultadoEquipo1 + ", ResultadoEquipo2=" + ResultadoEquipo2 + ", equipo="
				+ equipo + ", arbitro=" + arbitro + ", incidencias=" + incidencias + "]";
	}
}

