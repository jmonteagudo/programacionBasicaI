package ar.edu.unlam.pb1.trabajoPractico10.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPractico10.dominio.BatallaNaval;
import ar.edu.unlam.pb1.trabajoPractico10.dominio.Direccion;
import ar.edu.unlam.pb1.trabajoPractico10.dominio.Nave;

public class JuegoBatallaNaval {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		BatallaNaval juego = new BatallaNaval(10);
		Nave deDos, deTres, deCuatro;
		deDos = new Nave(0, 2, 2, Direccion.VERTICAL);
		deTres = new Nave(4, 4, 3, Direccion.HORIZONTAL);
		deCuatro = new Nave(7, 4, 4, Direccion.HORIZONTAL);
		int CANTIDAD_DE_CHANCES = 20;
		juego.agregarNave(deDos);
		juego.agregarNave(deTres);
		juego.agregarNave(deCuatro);
		
		System.out.println("Bienvenido a la batalla naval");
		System.out.println("Tenes " + CANTIDAD_DE_CHANCES + " intententos para adivinar donde hundir las 3 naves de 2, 3 y 4 casilleros");
		System.out.println("Mucha suerte!");
		
		int cantidadDeDisparos = 1, fila, columna;
		do {
			System.out.println(juego);
			System.out.println("Disparo número: " + cantidadDeDisparos);
			System.out.println("Fila: ");
			fila = teclado.nextInt();
			System.out.println("Columna: ");
			columna = teclado.nextInt();
			System.out.println(juego.disparar(fila, columna));	
			cantidadDeDisparos++;
		} while(cantidadDeDisparos < CANTIDAD_DE_CHANCES && !juego.hayGanador());
		
		if(juego.hayGanador()) {
			System.out.println("Felicitaciones!");
		}
		else {
			System.out.println("Otra vez será");
		}
	}

}
