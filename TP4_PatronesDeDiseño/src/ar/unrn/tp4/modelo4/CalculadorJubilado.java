package ar.unrn.tp4.modelo4;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	public double getMontoAdicionalConIvaEnPromocion(double precioProducto) {
		return 0;
	}

	@Override
	public double getMontoAdicionalConIvaNormal(double precioProducto) {
		return precioProducto * 0.1;
	}
}
