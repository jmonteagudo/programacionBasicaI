package ar.edu.unlam.pb1.trabajopractico06.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPractico03.domain.Persona;

public class PruebaEstadisticaDePersonas {

	public static void main(String[] args) {
		Persona nueva;
		int numeroDePersona=1, cantidadDePersonasConBajoPeso = 0, cantidadDePersonasConPesoNormal = 0, CantidadDePersonasConSobrePeso = 0, MUESTRA = 50 ;
		double sumatoriaPeso = 0.0, pesoPromedio = 0.0, sumatoriaDeEdadDePersonasConBajoPeso = 0.0, sumatoriaDeEdadDePersonasConSobrePeso = 0.0, promedioDeEdadDeLasPersonasConBajoPeso = 0.0, 
				promedioDeEdadDeLasPersonasConSobrePeso = 0.0;
		
		while(numeroDePersona<=MUESTRA) {
			nueva = ingresarNuevaPersona(numeroDePersona);
			sumatoriaPeso += nueva.getPeso();
			switch(nueva.calcularIMC()) {
			case -1:
				// Bajo Peso
				cantidadDePersonasConBajoPeso++;
				sumatoriaDeEdadDePersonasConBajoPeso+=nueva.getEdad();
			case 0:
				// Peso Normal
				cantidadDePersonasConPesoNormal++;
			case 1:
				// Sobre Peso
				CantidadDePersonasConSobrePeso++;
				sumatoriaDeEdadDePersonasConSobrePeso+=nueva.getEdad();
			default:
				// Error en calcularIMC
				System.out.println("ERROR. Revisar el cálculo del indice de masa corporal porque está arrojando valores inválidos");
			}
		}
		
		pesoPromedio = sumatoriaPeso / numeroDePersona;
		promedioDeEdadDeLasPersonasConBajoPeso = sumatoriaDeEdadDePersonasConBajoPeso / cantidadDePersonasConBajoPeso;
		promedioDeEdadDeLasPersonasConSobrePeso = sumatoriaDeEdadDePersonasConSobrePeso / CantidadDePersonasConSobrePeso;
		
		System.out.println("Peso promedio : " + pesoPromedio);
		System.out.println("Edad promedio de personas con bajo peso: " + promedioDeEdadDeLasPersonasConBajoPeso);
		System.out.println("Edad promedio de personas con sobrepeso: " + promedioDeEdadDeLasPersonasConSobrePeso);

	}
	
	public static Persona ingresarNuevaPersona(int numeroDePersona) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Ingrese el genero (Masculino o Femenino): ");
		String genero = teclado.nextLine();
		System.out.println("Ingrese el DNI: ");
		long dni = teclado.nextLong();
		System.out.println("Ingrese la altura: ");
		double altura = teclado.nextDouble();
		System.out.println("Ingrese el peso: ");
		double peso = teclado.nextDouble();
		
		Persona nueva = new Persona(nombre, genero, dni, altura, peso );
		
		System.out.println("Ingrese la edad: ");
		int edad = teclado.nextInt();
		for(int i = 0; i<edad; i++) {
			nueva.cumplirAnos();
		}
		teclado.close();
		return nueva;
	}

}
