package ar.edu.vuelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestVuelo {
	@Test
	public void QueSePuedaCompraparUnPasajeParaPasajeroEnUnVuelo() {

		Vuelo v1 = new Vuelo("Buenos Aires", "Madrid", 10);

		Pasajero p1 = new Pasajero(1, "nombre", "apellido");

		p1.comprarPasaje(v1, 5);

		assertEquals(1, v1.getListaDePasajeros().size());
	}

	@Test
	public void QueNoSePuedaComprarDosPasajeParaMismoPasajeroEnUnVuelo() {

		Vuelo v1 = new Vuelo("Buenos Aires", "Madrid", 10);

		Pasajero p1 = new Pasajero(1, "nombre", "apellido");

		p1.comprarPasaje(v1, 5);

		assertFalse(p1.comprarPasaje(v1, 4));
		assertEquals(1, v1.getListaDePasajeros().size());

	}
<<<<<<< HEAD
	
=======

>>>>>>> 40a3186a20e1d8bc6117d40dc2888ea1dc7cd906
	@Test
	public void QueSePuedaAsignarUnAsientoPasajeroEnUnVuelo() {

		Vuelo v1 = new Vuelo("Buenos Aires", "Madrid", 10);

		Pasajero p1 = new Pasajero(1, "nombre", "apellido");

		p1.comprarPasaje(v1, 5);

		// comapra el asiento q tienel pasajero con la lista de asientos ()vuelo tien
		// eobtener el asiento

		assertEquals(p1.getPasaje().getAsiento(), v1.obtenerAsiento(5));
	}
	
	@Test
	public void QueSeNOPuedaAsignarUnAsientoOCUPADOPasajeroEnUnVuelo() {

		

	}
	
	@Test
	public void QueSeNOPuedaAsignarUnAsientoSiDespegoElVuelo() {


	}
	
	@Test
	public void ObtenerListaPasajerosQueNoVolaron () {


	}
	
	
}
