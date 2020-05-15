package Campeonato.modelo;

import java.util.Date;

public class Calendario {
	
	private Date fecha;
	private String campo;
	private String partido;
	
//CONSTRUCTOR
	public Calendario(Date fecha, String campo, String partido) {
		super();
		this.fecha = fecha;
		this.campo = campo;
		this.partido = partido;
	}
	
//GETTERS SETTERS	
	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getCampo() {
		return campo;
	}


	public void setCampo(String campo) {
		this.campo = campo;
	}


	public String getPartido() {
		return partido;
	}


	public void setPartido(String partido) {
		this.partido = partido;
	}


//TO STRING
	@Override
	public String toString() {
		return "Calendario [fecha=" + fecha + ", campo=" + campo + ", partido=" + partido + "]";
	}
}
