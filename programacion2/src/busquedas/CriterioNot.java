package busquedas;

import base.Pista;

public class CriterioNot implements Criterio{
	Criterio criterio;

	public CriterioNot(Criterio c) {
		criterio= c;
	}
	
	public boolean cumple(Pista p) {
		return (!criterio.cumple(p));
	}

	public Criterio copiar() {
		CriterioNot cn = new CriterioNot(criterio.copiar());
		return cn;
	}
}
