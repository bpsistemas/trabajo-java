package base;

import java.util.Vector;
import busquedas.Criterio;

public class PlayListSimple extends PlayList {
	
	Vector <Musica> elementos = new Vector<Musica>();

	public PlayListSimple(String nom) {
		nombre = nom;
	}

	public Vector<Musica> getElementos() {
		return elementos;
	}

	public void addElemento (Musica m){
		elementos.add(m);
	}

	public void addElementos (Vector<Musica> vec){
		elementos.addAll(vec);
	}

	
	public void eliminar(Musica m) {
		if (elementos.contains(m)){
			elementos.remove(m);
		}
		for (Musica ite : elementos){
				ite.eliminar(m);
		}
	}
	
	public PlayListSimple busqueda(Criterio c) {
		PlayListSimple salida = new PlayListSimple("Resultado de la busqueda");
		for (Musica m : getElementos()){
			salida.addElementos(m.busqueda(c).getElementos());
		}
		return salida;
	}
	
	public void mostrar(){		
		System.out.println("PlayList: " + this.nombre );
		for (Musica m : getElementos()){
			m.mostrar();
		}
		System.out.println("----------------------------------------------------------------------------------------------");
	}
	
}
