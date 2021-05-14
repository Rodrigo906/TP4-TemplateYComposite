package ar.unrn.tp4.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo5.Remera;
import ar.unrn.tp4.modelo5.RemeraImportada;
import ar.unrn.tp4.modelo5.RemeraNacional;

public class TestInciso5 {

	@Test
	public void calcularPrecioVentaRemeraNacional() {
		Remera remeraNacional = new RemeraNacional("Levis", 200, 0.015, 0.2, 0.15);
		double resultado = remeraNacional.calcularPrecioVenta();
		Assert.assertEquals(193d, resultado, 1.0f);
	}

	@Test
	public void calcularPrecioVentaRemeraImportada() {
		Remera remeraImportada = new RemeraImportada("Nike", 200, 0.03, 0.05, 0.25);
		double resultado = remeraImportada.calcularPrecioVenta();
		Assert.assertEquals(266d, resultado, 1.0f);
	}

}
