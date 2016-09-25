
import java.util.*;

public class playlistCompuesta extends playlist{
	
	private String nombre;
	private Vector <playlist> listado;

	
	public playlistCompuesta(String nombre){
		listado = new Vector<playlist>();
		this.nombre = nombre;
	}
	
	public void mostrar(){
		System.out.println("Playlist: " + this.nombre);
		for(Enumeration<playlist> E = listado.elements(); E.hasMoreElements();){
			E.nextElement().mostrar();
		}
	}

	public int duracion(){
		int suma = 0;
		for(Enumeration<playlist> E = listado.elements(); E.hasMoreElements();){
			suma = suma + E.nextElement().duracion();
		}
		return suma;
	}
	
	public void mostrarDuracion(){
		System.out.println("Duracion de " + this.nombre + ": " + this.duracion());
	}
		
	public void agregar(playlist P){
		listado.add(P);
	}

}
