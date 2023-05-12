package ar.unrn.domain.model;

import java.util.List;

public class Pedido {

	private int id;
	private List<Combo> listaCombosPedido;

	public Pedido(int id, List<Combo> listaCombosPedido) {
		super();
		this.id = id;
		this.listaCombosPedido = listaCombosPedido;
	}

	public void descripcion() {
		System.out.println("Pedido: " + id + '\n');

		for (Combo combo : listaCombosPedido) {
			combo.descripcion();
			System.out.println("PRECIO: " + combo.precio() + '\n');
		}
	}

	public int precio() {
		int precioTotalCombos = 0;
		for (Combo combo : listaCombosPedido) {
			precioTotalCombos += combo.precio();
		}
		return precioTotalCombos;
	}
}
