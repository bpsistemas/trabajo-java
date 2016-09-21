package trabajoEspecial;
import java.util.*;

public class ListaClase {
	
	ArrayList <PistaClase> lista;
	String nombre;
		
	public ListaClase(String nombre) {	
		this.nombre=nombre;
	}
	
	public void agregarPista(PistaClase p){
		//lista[lista.length] = new PistaClase(p.id,p.titulo,p.duracion,p.interprete,p.titulo,p.anio,p.genero);
		this.lista.add(p);
	}
	
	public void mostrarPistas(){
		System.out.println(this.nombre + ": ");
		for(int i=0; i<this.lista.size(); i++){
            lista.get(i).mostrarPista();
        }
	}
	
	public void getDuracion(){
		System.out.println(this.nombre);
		int duracion = 0;
		for(int i=0; i<this.lista.size(); i++){
            duracion = duracion + lista.get(i).getDuracion();
        }
	}

	
}
