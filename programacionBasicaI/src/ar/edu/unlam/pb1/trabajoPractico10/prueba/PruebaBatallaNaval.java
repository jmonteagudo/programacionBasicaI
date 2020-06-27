package ar.edu.unlam.pb1.trabajoPractico10.prueba;

import ar.edu.unlam.pb1.trabajoPractico10.dominio.BatallaNaval;
import ar.edu.unlam.pb1.trabajoPractico10.dominio.Direccion;
import ar.edu.unlam.pb1.trabajoPractico10.dominio.Nave;

public class PruebaBatallaNaval {

	public static void main(String[] args) {

		BatallaNaval juego = new BatallaNaval(10);
		Nave nueva = new Nave(3, 4, 4, Direccion.HORIZONTAL);
		juego.agregarNave(nueva);
		nueva = new Nave(0, 1, 4, Direccion.VERTICAL);
		juego.agregarNave(nueva);
		System.out.println(juego);

		System.out.println(juego.disparar(3, 0));
		System.out.println(juego);
		System.out.println(juego.disparar(3, 4));
		System.out.println(juego);
		System.out.println(juego.disparar(0, 1));
		System.out.println(juego);
		System.out.println(juego.disparar(1, 1));
		System.out.println(juego);
		System.out.println(juego.disparar(2, 1));
		System.out.println(juego);
		System.out.println(juego.disparar(3, 1));
		System.out.println(juego);

	}

}
