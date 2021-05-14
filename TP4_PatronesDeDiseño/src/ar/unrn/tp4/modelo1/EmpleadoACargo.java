package ar.unrn.tp4.modelo1;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoACargo extends Rol {

	private List<Rol> empleados = new ArrayList<Rol>();

	public EmpleadoACargo(String nombre, double salario) {
		super(nombre, salario);
	}

	public void agregarEmpleado(Rol empleado) {
		this.empleados.add(empleado);
	}

	public void eliminarEmpleado(Rol empleado) {
		this.empleados.remove(empleado);
	}

	@Override
	public double calcularMontoSalarial() {
		double salarioTotal = this.obtenerSalario();
		for (Rol r : this.empleados) {
			salarioTotal += r.calcularMontoSalarial();
		}
		return salarioTotal;
	}

}
