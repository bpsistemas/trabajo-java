package base;

import java.util.Vector;

public abstract class PlayList extends Musica{
	
	
	public abstract Vector <Musica> getElementos();
	
	public int getDuracion() {
		int acum = 0;
		for (Musica m : getElementos()){
			acum +=m.getDuracion();
		}
		return acum;
	}
	
	public String getInterprete() {
		String salida = "";
		Vector<Musica> aux = getElementos();
		salida = aux.get(0).getInterprete();
		for (Musica m : aux){
			if (!salida.equals(m.getInterprete())){
				salida = "Varios";
				break;
			}
		}
		return salida;
	}
	
	public String getAlbum() {
		String salida = "";
		Vector<Musica> aux = getElementos();
		salida = aux.get(0).getAlbum();
		for (Musica m : aux){
			if (!salida.equals(m.getAlbum())){
				salida = "Varios";
				break;
			}
		}
		return salida;
		
	}
	
	public int getAnio() {
		int mayor = 0;
		for (Musica m : getElementos()){
			if (m.getAnio() > mayor){
				mayor = m.getAnio();
			}
		}
		return mayor;
	}
	
	public String getGenero() {
		String salida = "";
		Vector<String> generos = new Vector<String>();
		Vector<Integer> cantidades = new Vector<Integer>();
		for (Musica m : getElementos()){
			if (generos.contains(m.getGenero())){
				int i = generos.indexOf(m.getGenero());
				cantidades.set(i, cantidades.get(i) + 1);
			}else{
				generos.add(m.getGenero());
				cantidades.add(1);
			}
		}
		int cont = 0;
		for (int i = 0; i < cantidades.size(); i++){
			if (cantidades.get(i) > cont){
				cont = cantidades.get(i);
				salida = generos.get(i);
			}
		}
		return salida;
	}
		
	
}
