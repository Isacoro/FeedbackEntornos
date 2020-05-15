package Campeonato.modelo;

public class Patrocinadores {
	
	private String nombre;
	private String equipo;
	
//CONSTRUCTOR
	public Patrocinadores(String nombre, String equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
	}

//GETTERS SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

//TO STRING
	@Override
	public String toString() {
		return "Patrocinadores [nombre=" + nombre + ", equipo=" + equipo + "]";
	}
}
