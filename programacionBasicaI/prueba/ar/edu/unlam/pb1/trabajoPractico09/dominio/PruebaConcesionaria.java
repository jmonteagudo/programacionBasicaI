package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPractico03.domain.Coche;

public class PruebaConcesionaria {
		
	public static void main(String[] args) {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		System.out.println("Bienvenido a la concesionaria ");
		Concesionaria renault = new Concesionaria("Renault", CANTIDAD_MAXIMA_DE_VEHICULOS);
		
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1: 
				// opci�n 1
				ingresarUnNuevoVehiculo(renault);
				break;
			case 2: 
				// opci�n 2
				mostrarElListadoDeLosVehiculos(renault);
				break;
			case 3:
				// opci�n 3
				break;
			case 9:
				break;
			default:
				System.out.println("Opci�n Invalida");
				break;
			}

		} while (opcion != 9);
	}

	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Ingresar un nuevo veh�culo");
		System.out.println("2 - Mostrar el listado de veh�culos");
		System.out.println("3 - Mostrar el detalle de un c�digo en particular");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}
	
	private static void ingresarUnNuevoVehiculo(Concesionaria actual) {
		Scanner teclado = new Scanner(System.in);
		String marca, modelo;
		double precio;
		Coche nuevo;
		
		System.out.println("Ingrese la marca");
		marca = teclado.next();
		System.out.println("Ingrese la modelo");
		modelo = teclado.next();
		System.out.println("Ingrese la precio");
		precio = teclado.nextDouble();
		
		nuevo = new Coche(marca, modelo, 0, 0, precio);
		
		actual.agregarCoche(nuevo);		
	}
	
	private static void mostrarElListadoDeLosVehiculos(Concesionaria actual) {
		System.out.println(actual);
	}
	
	private static void mostrarElDetalleDeUnCodigoEnParticular() {
		
	}

}
