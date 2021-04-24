package ar.edu.unlam.pb1.trabajopractico08.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.parciales.Vuelo;

public class CajeroAutomatico {

	public static void main(String[] args) {
		System.out.println("Bienvenido al banco ");
		Cuenta actual = new Cuenta("Natalia");
		int opcionesValidas[] = {1,2,3,9};
		
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1: 
				// opción 1
				extraer(actual);
				break;
			case 2: 
				// opción 2
				break;
			case 3:
				// opción 3
				break;
			case 9:
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}

		//} while (opcion != 9);
		} while (opcion != opcionesValidas[0] && opcion != opcionesValidas[1] && opcion != opcionesValidas[2]);
		
		
		

	}

	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - DEPOSITAR");
		System.out.println("2 - EXTRAER");
		System.out.println("3 - CONSULTAR");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}
	
	private static void extraer(Cuenta actual) {
		Scanner teclado = new Scanner(System.in);
		double monto;
		
		System.out.println("************************");
		System.out.println("EXTRAER\n");
		System.out.println("************************");
		System.out.println("Ingrese el monto a extraer");
		
		monto = teclado.nextDouble();
		actual.retirar(monto);
		
	}
}
