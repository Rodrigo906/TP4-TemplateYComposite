package ar.unrn.tp4.modelo5;

public abstract class Remera {

	private double precioUnitario;
	private String marca;
	private double impuestoComercio;

	public Remera(String marca, double precioUnitario, double impuestoComercio) {
		this.marca = marca;
		this.precioUnitario = precioUnitario;
		this.impuestoComercio = impuestoComercio;
	}

	public double calcularPrecioVenta() {
		double precioVenta = this.getPrecioUnitario() + this.getImpuestoAdicionales(precioUnitario)
				- this.getDescuentos(precioUnitario) + this.getImpuestoComercio();
		return precioVenta;
	}

	private double getPrecioUnitario() {
		return this.precioUnitario;
	}

	private double getImpuestoComercio() {
		return this.getPrecioUnitario() * this.impuestoComercio;
	}

	protected abstract double getImpuestoAdicionales(double precioUnitario);

	protected abstract double getDescuentos(double precioUnitario);
}
