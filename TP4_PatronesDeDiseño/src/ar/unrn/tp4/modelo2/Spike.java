package ar.unrn.tp4.modelo2;

public class Spike extends ItemProyecto {

	private String detalle;

	public Spike(String nombre, int puntosDeHistoria, String detalle) {
		super(nombre, puntosDeHistoria);
		this.detalle = detalle;
	}

	@Override
	public int calcularTiempoRestante() {
		return this.obtenerPuntosDeHistoria();
	}

}
