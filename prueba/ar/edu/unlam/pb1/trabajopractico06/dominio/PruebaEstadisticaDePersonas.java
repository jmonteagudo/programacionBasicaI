package ar.edu.unlam.pb1.trabajopractico06.dominio;

import java.util.Scanner;

public class PruebaEstadisticaDePersonas {

	public static void main(String[] args) {
		
		int opcionDeseada = 0;
		Scanner teclado = new Scanner(System.in);
		
		do{
			mostrarElMenu();
			System.out.println("Ingresá la opción deseada:");
			opcionDeseada = teclado.nextInt();
		}while((opcionDeseada<1)||(opcionDeseada>7));
		
		switch(opcionDeseada) {
		case 1:
			// Registro de una nueva persona
		case 2:
			// Informar el peso completo
		}

		
		
	}
	
	private static void mostrarElMenu() {
		System.out.println("Bienvenido al INDEC");
		System.out.println("Menu de opciones");
		System.out.println("****************");
		System.out.println("1. Registrar nueva persona");
		System.out.println("2. Informar el peso promedio de la muestra");
		System.out.println("3. Informar cantidad de personas con bajo peso");
		System.out.println("4. Informar la cantidad de personas con peso normal");
		System.out.println("5. Informar la cantidad de personas con peso sobrepeso");
		System.out.println("6. Promedio de edad de las personas con bajo peso");
		System.out.println("7. Promedio de edad de las personas con bajo sobrepeso");
		System.out.println("9. Salir");		
		System.out.println("****************");
		
	}

}
