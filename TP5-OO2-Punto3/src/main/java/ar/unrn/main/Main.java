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
				new AdicionalCombo("Tomate", 2, 10, new TipoCombo("Especial", 120)));

		Combo comboConTresAdicional = new AdicionalCombo("Carne", 3, 25,
				new AdicionalCombo("Queso", 3, 10, new AdicionalCombo("Papas", 3, 20, new TipoCombo("Familiar", 150))));

		List<Combo> primerPedido = new ArrayList<Combo>();
		primerPedido.add(comboConDosAdicional);
		primerPedido.add(comboConTresAdicional);

		Pedido pedido = new Pedido(1, primerPedido);

		pedido.descripcion();
		System.out.println("PRECIO NETO: " + pedido.precio());
	}
}
