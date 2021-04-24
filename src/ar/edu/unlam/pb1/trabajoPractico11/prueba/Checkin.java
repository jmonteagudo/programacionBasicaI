package ar.edu.unlam.pb1.trabajoPractico11.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPractico11.dominio.Pasajero;
import ar.edu.unlam.pb1.trabajoPractico11.dominio.Vuelo;

public class Checkin {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido ");
		int CantidadPasajero = 189;
		Vuelo vuelo = new Vuelo("Buenos Aires", "Bariloche", CantidadPasajero);

		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1: 
				registrarPasajero(vuelo);
				break;
			case 2: 
				elegirAsiento(vuelo);
				break;
			case 3:
				listarPasajeros(vuelo);
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}

		} while (opcion != 9);
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar pasajero");
		System.out.println("2 - Elegir Asiento");
		System.out.println("3 - Listar pasajeros");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}
	
	public static void registrarPasajero(Vuelo actual) {
		
		/*
		 * Interfaz de usuario encargada de ingresar un pasajero al vuelo. Debe ingresar los datos necesarios e informar por pantalla el resultado de la operación
		 */

		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;

		System.out.println("************************");
		System.out.println("Registrar pasajero\n");
		System.out.println("Ingrese el nombre");
		nombre = teclado.next();
		System.out.println("Ingrese el apellido");
		apellido = teclado.next();
		System.out.println("Ingrese el dni");
		dni = teclado.nextInt();
		Pasajero pasajero = new Pasajero(dni, nombre, apellido);
		if (actual.agregarPasajero(pasajero)) {
			System.out.println("Se registro el pasajero correctament");
		}
		else {
			System.out.println("El vuelo ya se encuentra lleno");
		}		
	}
	
	private static void elegirAsiento(Vuelo actual) {
		/*
		 * Interfaz de usuario encargada de gestionar la asignación de asientos en el vuelo. Debe permitir el ingreso de los datos y mostrar por pantalla el resultado de la operación
		 */
		Scanner teclado = new Scanner(System.in);
		int dni, fila, columna;
		Pasajero pasajeroASentar;
		
		actual.toString();
		System.out.println("Ingrese dni Pasaero");
		dni = teclado.nextInt();
		pasajeroASentar = actual.buscarPasajero(dni);

		if (pasajeroASentar != null) {
			actual.toString();
			System.out.println();
			boolean asientoAsignado = false;
			do {
				System.out.println("Ingrese fila");
				fila = teclado.nextInt();
				System.out.println("Ingrese columna");
				columna = teclado.nextInt();
				asientoAsignado = actual.asignarAsiento(pasajeroASentar, fila, columna);

				if (asientoAsignado)
					System.out.println("Se reservo el asiento correctamente para el pasajero ");
				else {

					System.out.println("El asiento elegido esta ocupado ");
					actual.toString();
					System.out.println("ingrese el asiento nuevamente");
				}

			} while (!asientoAsignado);

		} else
			System.out.println("el pasajero no existe");
	}

	private static void listarPasajeros(Vuelo actual) {
		/*
		 * Se debe mostrar la lista de pasajeros registrados para éste vuelo ordenados por DNI
		 */
	}
}
