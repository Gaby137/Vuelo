package ar.edu.vuelo;

import java.util.HashSet;
import java.util.Set;

public class Vuelo {
	private Set<Pasajero> listaDePasajeros;
	private String origen;
	private String destino;
	private int capacidadMaxima;
	private Set<Asiento> asientos;

	public Vuelo(String origen, String destino, int capacidadMaxima) {
		this.origen = origen;
		this.destino = destino;
		this.capacidadMaxima = capacidadMaxima;
		this.listaDePasajeros = new HashSet<>();
		this.asientos = new HashSet<>();
	}

	public Boolean disponibilidadDeAsiento(int nro) {
		Boolean disponible = false;

		Asiento a = new Asiento();

		if (nro >= 0 && nro < capacidadMaxima) {

			if (!this.asientos.contains(new Asiento(nro))) {
				a.setNro(nro);
				a.setOcupado(true);
				this.asientos.add(a);

				disponible = true;
			}

		}

		return disponible;
	}

	public Asiento obtenerAsiento(Integer nroAsiento) {
		Asiento asientoEncontrado = null;
		for (Asiento asiento : asientos) {
			if (nroAsiento.equals(asiento.getNro())) {
				asientoEncontrado = asiento;
			}
		}
		return asientoEncontrado;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Set<Pasajero> getListaDePasajeros() {
		return listaDePasajeros;
	}

	public void setListaDePasajeros(Set<Pasajero> listaDePasajeros) {
		this.listaDePasajeros = listaDePasajeros;
	}

	public Set<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(Set<Asiento> asientos) {
		this.asientos = asientos;
	}

}
