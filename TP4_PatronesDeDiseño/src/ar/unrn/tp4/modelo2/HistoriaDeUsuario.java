package ar.unrn.tp4.modelo2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario extends ItemProyecto {

	private int numero;
	private String criteriosDeAceptacion;
	private List<ItemProyecto> tareas = new ArrayList<ItemProyecto>();

	public HistoriaDeUsuario(String nombre, int puntosDeHistoria, int numero, String criteriosDeAceptacion) {
		super(nombre, puntosDeHistoria);
		this.numero = numero;
		this.criteriosDeAceptacion = criteriosDeAceptacion;
	}

	@Override
	public int calcularTiempoRestante() {
		int puntosTotales = this.obtenerPuntosDeHistoria();
		for (ItemProyecto ip : this.tareas) {
			puntosTotales += ip.calcularTiempoRestante();
		}
		return puntosTotales;
	}

	public void agregarTarea(ItemProyecto tarea) {
		this.tareas.add(tarea);
	}

	public void eliminarTarea(ItemProyecto tarea) {
		this.tareas.remove(tarea);
	}

}
