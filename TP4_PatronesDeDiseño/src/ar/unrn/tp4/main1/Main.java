package ar.unrn.tp4.main1;

import ar.unrn.tp4.modelo1.EmpleadoACargo;
import ar.unrn.tp4.modelo1.EmpleadoRegular;

public class Main {

	public static void main(String[] args) {

		// Se pueden declarar como rol
		EmpleadoRegular empleado1 = new EmpleadoRegular("Pedro", 1000);
		EmpleadoRegular empleado2 = new EmpleadoRegular("Luis", 2000);
		EmpleadoRegular empleado3 = new EmpleadoRegular("Jose", 1500);

		EmpleadoACargo lider1 = new EmpleadoACargo("Ramirez", 3000);
		EmpleadoACargo lider2 = new EmpleadoACargo("Matias", 3500);
		lider1.agregarEmpleado(empleado1);
		lider1.agregarEmpleado(empleado2);
		lider1.agregarEmpleado(empleado3);

		EmpleadoACargo mandoMedio1 = new EmpleadoACargo("Franco", 4000);
		EmpleadoACargo mandoMedio2 = new EmpleadoACargo("Jorge", 4500);
		mandoMedio1.agregarEmpleado(lider1);
		mandoMedio1.agregarEmpleado(lider2);

		EmpleadoACargo gerente1 = new EmpleadoACargo("Sebastian", 5000);
		EmpleadoACargo gerente2 = new EmpleadoACargo("Martin", 5500);
		gerente1.agregarEmpleado(mandoMedio1);
		gerente1.agregarEmpleado(mandoMedio2);

		EmpleadoACargo director = new EmpleadoACargo("Lucas", 6000);
		director.agregarEmpleado(gerente1);
		director.agregarEmpleado(gerente2);

		System.out.println("Salario de un empleado: " + empleado1.calcularMontoSalarial());
		System.out.println(
				"Salario total de lider de proyecto Ramirez y empleados a cargo: " + lider1.calcularMontoSalarial());
		System.out.println(
				"Salario total de mando medio Franco y empleados a cargo: " + mandoMedio1.calcularMontoSalarial());
		System.out
				.println("Salario total de gerente Sebastian y empleados a cargo: " + gerente1.calcularMontoSalarial());
		System.out.println("Monto total de salarios de la empresa: " + director.calcularMontoSalarial());

	}

}
