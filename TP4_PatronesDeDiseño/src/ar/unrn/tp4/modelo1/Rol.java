package ar.unrn.tp4.modelo1;

public abstract class Rol {

	private String nombre;
	private double salario;

	public Rol(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
	}

	public double calcularMontoSalarial() {
		return 0;
	}

	public double obtenerSalario() {
		return this.salario;
	}

	public String obtenerNombre() {
		return this.nombre;
	}

}
