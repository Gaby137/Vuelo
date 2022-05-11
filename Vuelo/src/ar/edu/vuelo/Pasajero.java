package ar.edu.vuelo;

public class Pasajero {
	private int dni;
	private String nombre;
	private String apellido;
	private Pasaje pasaje;

	public Pasajero(int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaje = new Pasaje();
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}

	public Boolean comprarPasaje(Vuelo vuelo, int nroAsiento) {
		Boolean comprado = false;
		if (!vuelo.getListaDePasajeros().contains(this)) {
			if (vuelo.disponibilidadDeAsiento(nroAsiento)) {
				Pasaje p = new Pasaje(100.0, vuelo.obtenerAsiento(nroAsiento));
				this.pasaje = p;
				vuelo.getListaDePasajeros().add(this);
				comprado = true;
			}
		}

		return comprado;

	}

}
