package ar.unrn.domain.model;

public class EspecialCombo implements Combo {

	private String descripcion;
	private int precio;

	public EspecialCombo(String descripcion, int precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public void descripcion() {
		System.out.println(descripcion + ": " + precio);
	}

	public int precio() {
		return precio;
	}
}
