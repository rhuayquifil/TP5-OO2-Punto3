package ar.unrn.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Combos {

	private List<Combo> listaCombo;

	public Combos() {
		super();
		this.listaCombo = new ArrayList<Combo>();
	}

	public void agregar(Combo combo) throws DomainExceptions {
		try {
			Objects.requireNonNull(combo);
		} catch (NullPointerException e) {
			throw new DomainExceptions("Combo nulo");
		}

		this.listaCombo.add(combo);
	}

	public void descripcion() {
		for (Combo combo : listaCombo) {
			combo.descripcion();
			System.out.println("PRECIO: " + combo.precio() + '\n');
		}
	}

	public int precio() {
		int precioTotalCombos = 0;
		for (Combo combo : listaCombo) {
			precioTotalCombos += combo.precio();
		}
		return precioTotalCombos;
	}
}
