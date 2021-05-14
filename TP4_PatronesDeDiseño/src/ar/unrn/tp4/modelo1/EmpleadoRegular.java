package ar.unrn.tp4.modelo1;

public class EmpleadoRegular extends Rol {

	public EmpleadoRegular(String nombre, double salario) {
		super(nombre, salario);
	}

	@Override
	public double calcularMontoSalarial() {
		return this.obtenerSalario();
	}

}
