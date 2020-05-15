package Campeonato.modelo;

public class Equipo {
	
	private String nombre;
	private String equipacion1;
	private String equipacion2;
	private String categoria;
	private String patrocinador;

//CONSTRUCTOR
	public Equipo(String nombre, String equipacion1, String equipacion2, String categoria, String patrocinador) {
		super();
		this.nombre = nombre;
		this.equipacion1 = equipacion1;
		this.equipacion2 = equipacion2;
		this.categoria = categoria;
		this.patrocinador = patrocinador;
	}
	
//GETTERS SETTERS	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipacion1() {
		return equipacion1;
	}
	public void setEquipacion1(String equipacion1) {
		this.equipacion1 = equipacion1;
	}
	public String getEquipacion2() {
		return equipacion2;
	}
	public void setEquipacion2(String equipacion2) {
		this.equipacion2 = equipacion2;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}


//TO STRING
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", equipacion1=" + equipacion1 + ", equipacion2=" + equipacion2
				+ ", categoria=" + categoria + ", patrocinador=" + patrocinador + "]";
	}
}
