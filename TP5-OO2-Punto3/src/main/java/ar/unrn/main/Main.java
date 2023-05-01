package ar.unrn.main;

import ar.unrn.domain.model.CarneAdicionalCombo;
import ar.unrn.domain.model.Combo;
import ar.unrn.domain.model.Combos;
import ar.unrn.domain.model.DomainExceptions;
import ar.unrn.domain.model.EspecialCombo;
import ar.unrn.domain.model.FamiliarCombo;
import ar.unrn.domain.model.PapasAdicionalCombo;
import ar.unrn.domain.model.Pedido;
import ar.unrn.domain.model.QuesoAdicionalCombo;
import ar.unrn.domain.model.TomateAdicionalCombo;

public class Main {

	public static void main(String[] args) {

//		Combo combo = new BasicoCombo("Combo Basico", 10);

		Combo combo1 = new PapasAdicionalCombo("Papas Adicional", 1, 10,
				new PapasAdicionalCombo("Papas Adicional", 3, 10, new CarneAdicionalCombo("Carne Adicional", 2, 10,
						new TomateAdicionalCombo("Tomate Adicional", 2, 5, new FamiliarCombo("Combo Familiar", 20)))));

		Combo combo2 = new QuesoAdicionalCombo("Queso Adiciaonal", 1, 5,
				new PapasAdicionalCombo("Papas Adicional", 2, 8, new EspecialCombo("Combo Especial", 30)));

		try {

			Combos listaCombosPedido = new Combos();

			listaCombosPedido.agregar(combo1);
			listaCombosPedido.agregar(combo2);

			Pedido pedido = new Pedido(1, listaCombosPedido);

			pedido.descripcion();
			System.out.println("PRECIO NETO: " + pedido.precio());

		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
		}
	}
}
