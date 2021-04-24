package ar.edu.unlam.pb1.trabajoPractico11.prueba;

import java.util.Scanner;

public class InterfazRestaurant {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char opcionSeleccionada = '\0';
		
		do {
			mostrarOpciones();
			opcionSeleccionada = (teclado.next()).charAt(0);
		} while(opcionSeleccionada != '9');

	}
	
	private static void mostrarOpciones() {
		System.out.println("Menu de opciones");
		System.out.println("1 - Alta de mozos");
		System.out.println("2 - Consultar mesas disponibles");
		System.out.println("3 - Ingresar comensales");
		System.out.println("4 - Agregar pedido a una mesa");
		System.out.println("5 - Cerrar mesa");
		System.out.println("6 - Cerrar caja");
		System.out.println("7 - Listado de platos");
		System.out.println("8 - Listado de mozos");
		System.out.println("9 - Salir");
	}

}
