package ar.edu.vuelo;

import java.util.Objects;

public class Asiento {

	private Boolean ocupado;
	private int nro;
	
	public Boolean getOcupado() {
		return ocupado;
	}
	public Asiento() {
		this.ocupado=false;
		this.nro=-1;
	}
	public Asiento(int nro2) {
		this.nro=nro2;
		this.ocupado=false;
	}
	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asiento other = (Asiento) obj;
		return nro == other.nro;
	}
	
	
	
}
