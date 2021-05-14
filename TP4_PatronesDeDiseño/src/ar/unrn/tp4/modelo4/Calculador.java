package ar.unrn.tp4.modelo4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public Calculador(int mesEnPromocion) {
		this.log = new LogTransaction();
		this.mesEnPromocion = mesEnPromocion;

	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;
		if (of(mesEnPromocion).equals(now().getMonth())) {
			precioTotal += this.getMontoAdicionalConIvaEnPromocion(precioProducto);
		} else {
			precioTotal += this.getMontoAdicionalConIvaNormal(precioProducto);
		}
		log.log(this.getClass().getName());
		return precioTotal;
	}

	protected abstract double getMontoAdicionalConIvaEnPromocion(double precioProducto);

	protected abstract double getMontoAdicionalConIvaNormal(double precioProducto);

}
