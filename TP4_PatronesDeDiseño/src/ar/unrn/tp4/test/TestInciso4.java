package ar.unrn.tp4.test;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo4.Calculador;
import ar.unrn.tp4.modelo4.CalculadorJubilado;
import ar.unrn.tp4.modelo4.CalculadorNoJubilado;

public class TestInciso4 {

	@Test
	public void calcularCobroJubiladoSinPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonthValue() + 1);
		double resultado = calculador.calcularPrecio(100);
		Assert.assertEquals(110d, resultado, 1.0f);
	}

	@Test
	public void calcularCobroNoJubiladoSinPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonthValue() + 1);
		double resultado = calculador.calcularPrecio(100);
		Assert.assertEquals(121d, resultado, 1.0f);
	}

	@Test
	public void calcularCobroJubiladoConPromocion() {
		Calculador calculador = new CalculadorJubilado(LocalDate.now().getMonthValue());
		double resultado = calculador.calcularPrecio(100);
		Assert.assertEquals(100d, resultado, 1.0f);
	}

	@Test
	public void calcularCobroNoJubiladoConPromocion() {
		Calculador calculador = new CalculadorNoJubilado(LocalDate.now().getMonthValue());
		double resultado = calculador.calcularPrecio(100);
		Assert.assertEquals(115d, resultado, 1.0f);
	}
}
