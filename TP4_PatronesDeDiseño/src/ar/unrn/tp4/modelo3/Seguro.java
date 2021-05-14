package ar.unrn.tp4.modelo3;

public class Seguro extends ItemSeguro {

	private double precio;

	public Seguro(String nombre, double precio) {
		super(nombre);
		this.precio = precio;
	}

	public double obtenerPrecio() {
		return this.precio;
	}

	@Override
	public double calcularCosto() {
		return this.obtenerPrecio();
	}

}
