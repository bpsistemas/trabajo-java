
public class colecccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playlistSimple p1 = new playlistSimple(1, "El Tiempo No Para", 311, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional");
		playlistSimple p2 = new playlistSimple(2, "Mi caramelo", 290, "Bersuit Vergarabat", "De la cabeza", 2002, "Rock nacional");
		playlistSimple p3 = new playlistSimple(3, "Party Rock Anthem", 408, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
		playlistSimple p4 = new playlistSimple(4, "Sorry for Party Rocking", 421, "LMFAO", "Sorry for Party Rocking", 2011, "Electro pop");
		playlistSimple p5 = new playlistSimple(5, "Fix you", 255, "Coldplay", "X&Y", 2005, "Rock alternativo");
		playlistSimple p6 = new playlistSimple(6, "Speed of Sound", 455, "Coldplay", "X&Y", 2005, "Rock alternativo");
		playlistSimple p7 = new playlistSimple(7, "Viva la vida", 320, "Coldplay", "Viva la vida", 2008, "Rock alternativo");
		playlistSimple p8 = new playlistSimple(8, "Whit or whitout you", 360, "U2", "The Joshua Tree", 1987, "Rock");
		playlistSimple p9 = new playlistSimple(9, "Vertigo", 355, "U2", "How to Dismantle an Atomic Bomb", 2004, "Rock");
		playlistSimple p10 = new playlistSimple(10, "City of Blinding Lights", 284, "U2", "How to Dismantle an Atomic Bomb", 2004, "Rock");
		playlistSimple p11 = new playlistSimple(11, "A la luz de la luna", 438, "El Indio Solari", "Pajaritos, bravos muchachitos", 2013, "Rock nacional");
		playlistSimple p12 = new playlistSimple(12, "Yo Canibal", 258, "Patricio rey y sus redonditos de ricota", "Lobo Suelto, Cordero atado", 1993, "Rock nacional");
		
		playlistCompuesta l1 = new playlistCompuesta("Clasicos del Rock");
		l1.agregar(p1);l1.agregar(p2);l1.agregar(p8);l1.agregar(p9);l1.agregar(p10);l1.agregar(p12);
		
		playlistCompuesta l2 = new playlistCompuesta("Lo mejor");
		l2.agregar(p3);l2.agregar(p4);l2.agregar(p7);l2.agregar(p12);
		
		playlistCompuesta l3 = new playlistCompuesta("Coldplay");
		l3.agregar(p5);l3.agregar(p6);l3.agregar(p7);
		
		playlistCompuesta l4 = new playlistCompuesta("EL Indio");
		l4.agregar(p12);l4.agregar(p11);
		
		l1.mostrar();
		l2.mostrar();
		l3.mostrar();
		
		l1.mostrarDuracion();
		l2.mostrarDuracion();
		l3.mostrarDuracion();
		l4.mostrarDuracion();
		
	}

}
