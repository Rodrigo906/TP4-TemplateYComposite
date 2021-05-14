package ar.unrn.tp4.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.unrn.tp4.modelo2.HistoriaDeUsuario;
import ar.unrn.tp4.modelo2.Spike;
import ar.unrn.tp4.modelo2.Tarea;

public class TestInciso2 {

	@Test
	public void calcularTiempoRestante() {

		HistoriaDeUsuario historia1 = new HistoriaDeUsuario("Calculos", 5, 1, "Criterios");
		HistoriaDeUsuario historia2 = new HistoriaDeUsuario("Calculos", 6, 2, "Criterios");
		Tarea tarea1 = new Tarea("calcular iva", 3, "descripcion de tarea 1");
		Tarea tarea2 = new Tarea("calcular descuentos", 2, "descripcion de tarea 2");
		Spike spike1 = new Spike("analisis", 6, "detalle");

		historia1.agregarTarea(tarea1);
		historia1.agregarTarea(tarea2);

		historia2.agregarTarea(tarea1);
		historia2.agregarTarea(tarea2);
		historia2.agregarTarea(spike1);

		Assert.assertEquals(10, historia1.calcularTiempoRestante());
		Assert.assertEquals(17, historia2.calcularTiempoRestante());

	}

}
