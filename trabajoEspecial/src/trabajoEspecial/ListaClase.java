package trabajoEspecial;
import java.util.*;

public class ListaClase {
	
	//Vector <PistaClase> lista;
	private ArrayList<PistaClase> lista = new ArrayList<PistaClase>();
	private String nombre;
		
	public ListaClase(String nombre) {	
		this.nombre = nombre;
	}
	
	public void agregarPista(PistaClase p){
		this.lista.add(p);
	}
	
	public void mostrarPistas(){
		System.out.println("\n"+this.nombre + ": ");
		
		for(int i=0; i<this.lista.size(); i++){
            lista.get(i).mostrarPista();
        }
	}
	
	public int getDuracion(){
		int duracion = 0;
		for(int i=0; i<this.lista.size(); i++){
            duracion = duracion + lista.get(i).getDuracion();
        }
		return duracion;
	}
	
	public void mostrarDuracion(){
		System.out.println("\n" + this.nombre + " - Duracion: " + this.getDuracion());
		
	}

	
}
