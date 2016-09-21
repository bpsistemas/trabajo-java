package trabajoEspecial;

public class PistaClase {

	int id;
	String titulo;
	int duracion;
	String interprete;
	String album;
	int anio;
	String genero;	
	
		public PistaClase(int id, String titulo, int duracion, String interprete, String album, int anio, String genero){
			this.id=id;
			this.titulo=titulo;
			this.duracion=duracion;
			this.interprete=interprete;
			this.album=album;
			this.anio=anio;
			this.genero=genero;			
		}
		
		public int getDuracion(){
			return this.duracion;
		}	
		
		public void mostrarPista(){
			System.out.println(this.id + "   " + this.titulo + "   " + this.duracion + "   " +this.interprete + "   " +this.album + "   " + this.anio+ "   " +this.genero);
		}
		
		
	
}
