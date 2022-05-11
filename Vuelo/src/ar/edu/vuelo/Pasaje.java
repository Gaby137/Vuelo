package ar.edu.vuelo;

import java.security.Timestamp;

public class Pasaje {

	private Double precio;
	private Asiento asiento;
	
	public Pasaje() {
		
	}
	public Pasaje(Double precio, Asiento asiento) {
		super();
		this.precio = precio;
		this.asiento = asiento;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Asiento getAsiento() {
		return asiento;
	}
	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
	
}
