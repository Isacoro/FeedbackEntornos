package Campeonato.modelo;

import java.util.Date;

public class FichaJugador {
	
	private String nombre;
	private String apellidos;
	private Date fecha_nacimiento;
	private String direccion;
	private int telefono;
	private String equipo;
	
//CONSTRUCTOR
	public FichaJugador(String nombre, String apellidos, Date fecha_nacimiento, String direccion, int telefono,
			String equipo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.equipo = equipo;
	}

//GETTERS SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
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
		return "FichaJugador [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", equipo=" + equipo + "]";
	}
}
