package busquedas;

import base.Pista;

public class CriterioAnd implements Criterio {
	Criterio criterio1;
	Criterio criterio2;
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		criterio1 = c1;
		criterio2 = c2;
	}
	
	public boolean cumple(Pista p) {
		return (criterio1.cumple(p) && criterio2.cumple(p));
	}

	public Criterio copiar() {
		CriterioAnd ca = new CriterioAnd(criterio1.copiar(), criterio2.copiar());
		return ca;
	}
}
