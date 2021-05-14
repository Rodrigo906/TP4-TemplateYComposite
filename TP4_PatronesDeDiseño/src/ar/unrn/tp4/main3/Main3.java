package ar.unrn.tp4.main3;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.tp4.modelo3.ItemSeguro;
import ar.unrn.tp4.modelo3.PaqueteSeguros;
import ar.unrn.tp4.modelo3.Seguro;

public class Main3 {

	public static void main(String[] args) {

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

		System.out.println(paqueteSeguros.calcularCosto());
		System.out.println(paqueteDeSegurosYPaquetes.calcularCosto());

	}

}
