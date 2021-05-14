package ar.unrn.tp4.modelo4;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {
		super(mesEnPromocion);
	}

	@Override
	public double getMontoAdicionalConIvaEnPromocion(double precioProducto) {
		return precioProducto * 0.15;
	}

	@Override
	public double getMontoAdicionalConIvaNormal(double precioProducto) {
		return precioProducto * 0.21;
	}

}
