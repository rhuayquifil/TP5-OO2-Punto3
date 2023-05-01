package ar.unrn.domain.model;

public abstract class AdicionalCombo implements Combo {

	private String descripcion;
	private int cantidad;
	private int precio;
	private Combo combo;

	public AdicionalCombo(String descripcion, int cantidad, int precio, Combo combo) {
		super();
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.combo = combo;
	}

	public void descripcion() {
		this.combo.descripcion();
		System.out.println(descripcion + " x " + cantidad + ": " + precio * cantidad);
	}

	public int precio() {
		return this.combo.precio() + (precio * cantidad);
	}
}
