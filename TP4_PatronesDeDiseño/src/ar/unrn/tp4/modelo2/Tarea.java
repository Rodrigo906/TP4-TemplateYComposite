package ar.unrn.tp4.modelo2;

public class Tarea extends ItemProyecto {

	private String descripcion;

	public Tarea(String nombre, int puntosDeHistoria, String descripcion) {
		super(nombre, puntosDeHistoria);
		this.descripcion = descripcion;
	}

	@Override
	public int calcularTiempoRestante() {
		return this.obtenerPuntosDeHistoria();
	}

}
