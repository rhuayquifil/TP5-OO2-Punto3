package ar.unrn.main;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.domain.model.AdicionalCombo;
import ar.unrn.domain.model.Combo;
import ar.unrn.domain.model.Pedido;
import ar.unrn.domain.model.TipoCombo;

public class Main {

	public static void main(String[] args) {

		Combo comboConDosAdicional = new AdicionalCombo("Papas", 1, 20,
				new AdicionalCombo("Tomate", 2, 10, new TipoCombo("Especial", 80)));

		List<Combo> listaCombosPedido = new ArrayList<Combo>();
		listaCombosPedido.add(comboConDosAdicional);

		Pedido pedido = new Pedido(1, listaCombosPedido);

		pedido.descripcion();
		System.out.println("PRECIO NETO: " + pedido.precio());
	}
}
