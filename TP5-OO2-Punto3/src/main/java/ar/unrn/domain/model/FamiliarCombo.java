package ar.unrn.domain.model;

public class FamiliarCombo implements Combo {

	private String descripcion;
	private int precio;

	public FamiliarCombo(String descripcion, int precio) {
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