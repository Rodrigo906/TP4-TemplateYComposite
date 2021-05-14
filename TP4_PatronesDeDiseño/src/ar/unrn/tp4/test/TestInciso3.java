package ar.unrn.tp4.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo3.ItemSeguro;
import ar.unrn.tp4.modelo3.PaqueteSeguros;
import ar.unrn.tp4.modelo3.Seguro;

public class TestInciso3 {

	@Test
	public void calcularCostoPaquete() {

		Seguro s1 = new Seguro("vida", 100);
		Seguro s2 = new Seguro("auto", 200);

		List<ItemSeguro> seguros = new ArrayList<ItemSeguro>();
		seguros.add(s1);
		seguros.add(s2);

		ItemSeguro paqueteSeguros = new PaqueteSeguros("Paquete1", seguros);
		double resultado = paqueteSeguros.calcularCosto();
		Assert.assertEquals(270d, resultado, 1.0f);
	}

	@Test
	public void calcularCostoDeSegurosYPaquetes() {
		Seguro s1 = new Seguro("vida", 100);
		Seguro s2 = new Seguro("auto", 200);
		Seguro s3 = new Seguro("Hogar", 300);
		Seguro s4 = new Seguro("Medico", 400);

		List<ItemSeguro> seguros = new ArrayList<ItemSeguro>();
		seguros.add(s1);
		seguros.add(s2);

		ItemSeguro paqueteSeguros = new PaqueteSeguros("Paquete1", seguros);

		List<ItemSeguro> segurosYPaquetes = new ArrayList<ItemSeguro>();
		segurosYPaquetes.add(s3);
		segurosYPaquetes.add(s4);
		segurosYPaquetes.add(paqueteSeguros);

		ItemSeguro paqueteDeSegurosYPaquetes = new PaqueteSeguros("Paquete2", segurosYPaquetes);
		double resultado = paqueteDeSegurosYPaquetes.calcularCosto();
		Assert.assertEquals(824.5d, resultado, 1.0f);

	}

}
