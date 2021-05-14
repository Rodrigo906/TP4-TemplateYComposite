package ar.unrn.tp4.modelo5;

public class RemeraNacional extends Remera {

	private double recargoTransporte;
	private double bonificacion;

	public RemeraNacional(String marca, double precioUnitario, double recargaTransporte, double bonificacion,
			double impuestoComercio) {
		super(marca, precioUnitario, impuestoComercio);
		this.recargoTransporte = recargaTransporte;
		this.bonificacion = bonificacion;
	}

	@Override
	public double getImpuestoAdicionales(double precioUnitario) {
		return precioUnitario * this.recargoTransporte;
	}

	@Override
	public double getDescuentos(double precioUnitario) {
		return precioUnitario * this.bonificacion;
	}
}
