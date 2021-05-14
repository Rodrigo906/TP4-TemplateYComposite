package ar.unrn.tp4.modelo3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros extends ItemSeguro {

	private final double DESCUENTOXSEGUROADICIONAL = 0.05;
	private List<ItemSeguro> items = new ArrayList<ItemSeguro>();

	public PaqueteSeguros(String nombre, List<ItemSeguro> seguros) {
		super(nombre);
		this.items = seguros;
	}

	public void agregarItem(ItemSeguro item) {
		this.items.add(item);
	}

	public void eliminarItem(ItemSeguro item) {
		this.items.remove(item);
	}

	@Override
	public double calcularCosto() {
		double costoTotal = 0;
		double descuentoAcumulativo = 0;
		for (ItemSeguro Item : this.items) {
			costoTotal += Item.calcularCosto();
			descuentoAcumulativo += DESCUENTOXSEGUROADICIONAL;
		}
		return costoTotal - (costoTotal * descuentoAcumulativo);

	}

}
