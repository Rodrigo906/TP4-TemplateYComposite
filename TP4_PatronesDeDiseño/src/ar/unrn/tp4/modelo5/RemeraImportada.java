package ar.unrn.tp4.modelo5;

public class RemeraImportada extends Remera {

	private double recargo;
	private double impuestoAduana;

	public RemeraImportada(String marca, double precioUnitario, double recargo, double impuestoAduana,
			double impuestoComercio) {
		super(marca, precioUnitario, impuestoComercio);
		this.recargo = recargo;
		this.impuestoAduana = impuestoAduana;
	}

	@Override
	public double getImpuestoAdicionales(double precioUnitario) {
		return precioUnitario * (recargo + impuestoAduana);
	}

	@Override
	public double getDescuentos(double precioUnitario) {
		return 0;
	}
}
