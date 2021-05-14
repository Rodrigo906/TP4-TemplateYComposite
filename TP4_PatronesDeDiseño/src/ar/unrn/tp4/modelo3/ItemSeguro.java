package ar.unrn.tp4.modelo3;

public abstract class ItemSeguro {

	private String nombre;

	public ItemSeguro(String nombre) {
		this.nombre = nombre;
	}

	public abstract double calcularCosto();

}
