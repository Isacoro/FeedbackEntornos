package Campeonato.modelo;

public class Partido {
	
	private int resultado;
	private String equipo;
	private String arbitro;
	private String incidencias;
	
//CONSTRUCTOR
	public Partido(int resultado, String equipo, String arbitro, String incidencias) {
		super();
		this.resultado = resultado;
		this.equipo = equipo;
		this.arbitro = arbitro;
		this.incidencias = incidencias;
	}

//GETTERS SETTERS
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
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

//TO STRING
	@Override
	public String toString() {
		return "Partido [resultado=" + resultado + ", equipo=" + equipo + ", arbitro=" + arbitro + ", incidencias="
				+ incidencias + "]";
	}
}
