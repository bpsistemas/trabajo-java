package trabajoEspecial;

public class TrabajoEspecialClase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PistaClase p1 = new PistaClase(1, "El Tiempo No Para", 311, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional");
		PistaClase p2 = new PistaClase(2, "Mi caramelo", 290, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional");
		PistaClase p3 = new PistaClase(3, "Party Rock Anthem", 408, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
		PistaClase p4 = new PistaClase(4, "Sorry for Party Rocking", 421, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
		PistaClase p5 = new PistaClase(5, "Fix you", 255, "Coldplay", "X&Y", 2005, "Rock alternativo");
		PistaClase p6 = new PistaClase(6, "Speed of Sound", 455, "Coldplay", "X&Y", 2005, "Rock alternativo");
		PistaClase p7 = new PistaClase(7, "Viva la vida", 320, "Coldplay", "Viva la vida", 2008, "Rock alternativo");
		PistaClase p8 = new PistaClase(8, "Whit or whitout you", 360, "U2", "The Joshua Tree", 1987, "Rock");
		PistaClase p9 = new PistaClase(9, "Vertigo", 355, "U2", "How to Dismantle an Atomic Bomb", 2004, "Rock");
		PistaClase p10 = new PistaClase(10, "City of Blinding Lights", 284, "U2", "How to Dismantle an Atomic Bomb", 2004, "Rock");
		PistaClase p11 = new PistaClase(11, "A la luz de la luna", 438, "El Indio Solari", "Pajaritos, bravos muchachitos", 2013, "Rock nacional");
		PistaClase p12 = new PistaClase(12, "Yo Canibal", 258, "Patricio rey y sus redonditos de ricota", "Lobo Suelto, Cordero atado", 1993, "Rock nacional");
		
		
		/*System.out.println("ID  Titulo  Duracion  Interprete    Titulo de Album   A–o    Genero");
		p1.mostrarPista();
		p2.mostrarPista();
		p3.mostrarPista();
		p4.mostrarPista();
		p5.mostrarPista();
		p6.mostrarPista();
		p7.mostrarPista();
		p8.mostrarPista();
		p9.mostrarPista();
		p10.mostrarPista();
		p11.mostrarPista();
		p12.mostrarPista();*/
		
		ListaClase l1 = new ListaClase("Clasicos del Rock");
		l1.agregarPista(p1);l1.agregarPista(p2);l1.agregarPista(p8);l1.agregarPista(p9);l1.agregarPista(p10);l1.agregarPista(p12);
		
		ListaClase l2 = new ListaClase("Lo mejor");
		l2.agregarPista(p3);l2.agregarPista(p4);l2.agregarPista(p7);l2.agregarPista(p12);
		
		ListaClase l3 = new ListaClase("Coldplay");
		l3.agregarPista(p5);l3.agregarPista(p6);l3.agregarPista(p7);
		
		ListaClase l4 = new ListaClase("EL Indio");
		l4.agregarPista(p12);l4.agregarPista(p11);
		
		l1.mostrarPistas();
		l2.mostrarPistas();
		l3.mostrarPistas();
		
		l1.mostrarDuracion();
		l2.mostrarDuracion();
		l3.mostrarDuracion();
		l4.mostrarDuracion();
		
		
	}

}

