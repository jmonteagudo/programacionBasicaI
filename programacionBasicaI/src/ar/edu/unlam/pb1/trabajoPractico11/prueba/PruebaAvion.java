package ar.edu.unlam.pb1.trabajoPractico11.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPractico10.dominio.BatallaNaval;
import ar.edu.unlam.pb1.trabajoPractico10.dominio.Direccion;
import ar.edu.unlam.pb1.trabajoPractico10.dominio.Nave;
import ar.edu.unlam.pb1.trabajoPractico11.dominio.Avion;

public class PruebaAvion {

	private static Scanner teclado = new Scanner(System.in);
	private static Avion elQuevuela = new Avion("Boeing 747", "25/10/2019", "Jujuy", 5, 40, 50);

	public static void main(String[] args) {

		int opcionIngresada;
		
		System.out.println("Bienvenido al sistema de reserva de vuelos");
		System.out.println("Opción 1: Agregar tripulantes");
		System.out.println("Opción 2: Sentar pasajero");
		System.out.println("Opción 3: Salir");
		opcionIngresada = teclado.nextInt();
		
		switch(opcionIngresada) {
		case 1:
			ingresarTripulante();
			break;
		case 2:
			//ingresarPasajero();
			break;
		default:
			
		}
		
	}
	
	private static void ingresarTripulante() {

		
		
		
		System.out.println("Ingrese el nombre");
		String nombre = teclado.next();
		System.out.println("Ingrese el apellido");
		String apellido = teclado.next();
		System.out.println("Ingrese el dni:");
		int dni = teclado.nextInt();
		System.out.println("Ingresar profesion");
		String profesion = teclado.next();	
		
		
		
		
	}
	
	private static void sentarPasajero() {
		
		
		
		
		System.out.println("Ingrese el nombre");
		String nombre = teclado.next();
		System.out.println("Ingrese el apellido");
		String apellido = teclado.next();
		System.out.println("Ingrese el dni:");
		int dni = teclado.nextInt();

		
		
		
	}
	
	
}
