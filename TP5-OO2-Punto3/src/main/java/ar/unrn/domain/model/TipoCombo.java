package ar.unrn.domain.model;

public class TipoCombo implements Combo {

	private String descripcion;
	private int precio;

	public TipoCombo(String descripcion, int precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public void descripcion() {
		System.out.println("Combo " + descripcion + ": " + precio);
	}

	public int precio() {
		return precio;
	}
}
