package ar.unrn.tp4.modelo2;

public abstract class ItemProyecto {

	private String nombre;
	private int puntosDeHistoria;

	public ItemProyecto(String nombre, int puntosDeHistoria) {
		this.nombre = nombre;
		this.puntosDeHistoria = puntosDeHistoria;
	}

	public int obtenerPuntosDeHistoria() {
		return this.puntosDeHistoria;
	}

	public int calcularTiempoRestante() {
		return 0;
	}
}
