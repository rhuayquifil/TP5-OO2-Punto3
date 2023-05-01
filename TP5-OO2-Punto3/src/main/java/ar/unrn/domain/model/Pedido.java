package ar.unrn.domain.model;

public class Pedido {

	private int id;
	private Combos listaCombosPedido;

	public Pedido(int id, Combos listaCombosPedido) {
		super();
		this.id = id;
		this.listaCombosPedido = listaCombosPedido;
	}

	public void descripcion() {
		System.out.println("Pedido: " + id + '\n');
		this.listaCombosPedido.descripcion();
	}

	public int precio() {
		return listaCombosPedido.precio();
	}
}
