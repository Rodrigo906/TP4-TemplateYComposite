package ar.unrn.tp4.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo1.EmpleadoACargo;
import ar.unrn.tp4.modelo1.EmpleadoRegular;

public class TestInciso1 {

	@Test
	public void calcularMontoSalarial() {

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

		Assert.assertEquals(Double.valueOf(1000), (Double) empleado1.calcularMontoSalarial());
		Assert.assertEquals(Double.valueOf(7500), (Double) lider1.calcularMontoSalarial());
		Assert.assertEquals(Double.valueOf(15000), (Double) mandoMedio1.calcularMontoSalarial());
		Assert.assertEquals(Double.valueOf(24500), (Double) gerente1.calcularMontoSalarial());
		Assert.assertEquals(Double.valueOf(36000), (Double) director.calcularMontoSalarial());

	}

}
