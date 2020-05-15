package Campeonato.modelo;

public class Arbitros {
	
	private String nombre;
	private String categoria;
	
//CONSTRUCTOR
	public Arbitros(String nombre, String categoria) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
	}
	
//GETTERS SETTERS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


//TO STRING
	@Override
	public String toString() {
		return "Arbitros [nombre=" + nombre + ", categoria=" + categoria + "]";
	}
}
