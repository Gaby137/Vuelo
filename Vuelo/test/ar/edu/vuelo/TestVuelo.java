package ar.edu.vuelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestVuelo {
	@Test
	public void QueSePuedaCompraparUnPasajeParaPasajeroEnUnVuelo() {
		
		Vuelo v1 = new Vuelo("Buenos Aires","Madrid",10);
		
		Pasajero p1= new Pasajero(1,"nombre","apellido");
		
		p1.comprarPasaje(v1,5);
		
//		assertEquals(p1, v1.getAsiento(p1.getAsiento().getNro()));
		assertEquals(1, v1.getListaDePasajeros().size());
	}
}
