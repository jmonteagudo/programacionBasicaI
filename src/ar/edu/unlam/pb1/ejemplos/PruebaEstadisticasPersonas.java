package ar.edu.unlam.pb1.ejemplos;

import java.util.Scanner;

public class PruebaEstadisticasPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroIngresado = 0;
		int siguienteOsalir; //"1" o "2"
		String nombre;
		String apellido;
		String genero;
		int edad;
		long dni;
		double peso;
		double altura;
		
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoDos = new Scanner(System.in);
		Scanner tecladoTres = new Scanner(System.in);
		Scanner tecladoCuatro = new Scanner(System.in);
		Scanner tecladoCinco = new Scanner(System.in);
		Scanner tecladoSeis = new Scanner(System.in);
		Scanner tecladoSiete = new Scanner(System.in);
		Scanner tecladoOcho = new Scanner(System.in);
		Scanner tecladoSiguiente = new Scanner(System.in);
		
		while(numeroIngresado != 9) {
			do{
				mostrarMenu();
				System.out.print("Ingrese la opción deseada: ");
				numeroIngresado = teclado.nextInt();
				switch(numeroIngresado) {
				case 1:
					numeroIngresado = ingresarPersona(numeroIngresado, tecladoDos, tecladoTres, tecladoCuatro,
							tecladoCinco, tecladoSeis, tecladoSiete, tecladoOcho, tecladoSiguiente);
						break;
				case 2:
					numeroIngresado = calcularElPesoPromedio(numeroIngresado, tecladoSiguiente);
						break;
				case 3:
					numeroIngresado = calcularCantidadDePersonasConBajoPeso(numeroIngresado, tecladoSiguiente);
						break;
				case 4:
					numeroIngresado = informarCantidadDePersonasConPesoNormal(numeroIngresado, tecladoSiguiente);
						break;
				case 5:
					numeroIngresado = informarCantidadDePersonasConSobrePeso(numeroIngresado, tecladoSiguiente);
						break;
				case 6:
					numeroIngresado = informarElPromedioDeEdadDeLasPersonasConBajoPeso(numeroIngresado, tecladoSiguiente);
						break;
				case 7:
					numeroIngresado = informarElPromedioDeEdadDeLasPersonasConSobrePeso(numeroIngresado,
							tecladoSiguiente);
						break;
				case 9:
					numeroIngresado = 9;
					break;
				}
			}
			while((numeroIngresado > 7 || numeroIngresado < 1) && numeroIngresado != 9);
		}
		
		System.out.println("\nDesconectado.");
	}

	private static int informarElPromedioDeEdadDeLasPersonasConSobrePeso(int numeroIngresado,
			Scanner tecladoSiguiente) {
		int siguienteOsalir;
		System.out.print("\nPromedio de edad de las personas con sobre peso: ");
		getPromedioEdadSobrePeso();
		System.out.println("\n\nNavegar más opciones?\n1.Yes / 2.No" );
		siguienteOsalir = tecladoSiguiente.nextInt();
		if(siguienteOsalir != 1) {
			numeroIngresado = 9;
		}
		return numeroIngresado;
	}

	private static int informarElPromedioDeEdadDeLasPersonasConBajoPeso(int numeroIngresado, Scanner tecladoSiguiente) {
		int siguienteOsalir;
		System.out.print("\nPromedio de edad de las personas con bajo peso: ");
		getPromedioEdadBajoPeso();
		System.out.println("\n\nNavegar más opciones?\n1.Yes / 2.No" );
		siguienteOsalir = tecladoSiguiente.nextInt();
		if(siguienteOsalir != 1) {
			numeroIngresado = 9;
		}
		return numeroIngresado;
	}

	private static int informarCantidadDePersonasConSobrePeso(int numeroIngresado, Scanner tecladoSiguiente) {
		int siguienteOsalir;
		System.out.print("\nCantidad de personas con sobre peso: ");
		getCantidadDePersonasConSobrePeso();
		System.out.println("\n\nNavegar más opciones?\n1.Yes / 2.No" );
		siguienteOsalir = tecladoSiguiente.nextInt();
		if(siguienteOsalir != 1) {
			numeroIngresado = 9;
		}
		return numeroIngresado;
	}

	private static int informarCantidadDePersonasConPesoNormal(int numeroIngresado, Scanner tecladoSiguiente) {
		int siguienteOsalir;
		System.out.print("\nCantidad de personas con peso normal: ");
		getCantidadDePersonasConPesoNormal();
		System.out.println("\n\nNavegar más opciones?\n1.Yes / 2.No" );
		siguienteOsalir = tecladoSiguiente.nextInt();
		if(siguienteOsalir != 1) {
			numeroIngresado = 9;
		}
		return numeroIngresado;
	}

	private static int calcularCantidadDePersonasConBajoPeso(int numeroIngresado, Scanner tecladoSiguiente) {
		int siguienteOsalir;
		System.out.print("\nCantidad de personas con bajo peso: ");
		getCantidadDePersonasBajoPeso();
		System.out.println("\n\nNavegar más opciones?\n1.Yes / 2.No" );
		siguienteOsalir = tecladoSiguiente.nextInt();
		if(siguienteOsalir != 1) {
			numeroIngresado = 9;
		}
		return numeroIngresado;
	}

	private static int calcularElPesoPromedio(int numeroIngresado, Scanner tecladoSiguiente) {
		int siguienteOsalir;
		System.out.print("\nCantidad de personas: ");
		getCantidadDePersonas();
		System.out.print("\nPeso promedio: ");
		getPesoPromedio();
		System.out.println("\n\nNavegar más opciones?\n1.Yes / 2.No" );
		siguienteOsalir = tecladoSiguiente.nextInt();
		if(siguienteOsalir != 1) {
			numeroIngresado = 9;
		}
		return numeroIngresado;
	}

	private static int ingresarPersona(int numeroIngresado, Scanner tecladoDos, Scanner tecladoTres,
			Scanner tecladoCuatro, Scanner tecladoCinco, Scanner tecladoSeis, Scanner tecladoSiete, Scanner tecladoOcho,
			Scanner tecladoSiguiente) {
		int siguienteOsalir;
		String nombre;
		String apellido;
		String genero;
		int edad;
		long dni;
		double peso;
		double altura;
		System.out.println("Registrar Persona");
		System.out.print("\nNombre: ");
		nombre = tecladoDos.next();
		System.out.print("\nApellido: ");
		apellido = tecladoTres.next();
		System.out.print("\nGenero: ");
		genero = tecladoCuatro.next();
		System.out.print("\nEdad: ");
		edad = tecladoCinco.nextInt();
		System.out.print("\nDni: ");
		dni = tecladoSeis.nextLong();
		System.out.print("\nPeso: ");
		peso = tecladoSiete.nextDouble(); 
		System.out.print("\nAltura: ");
		altura = tecladoOcho.nextDouble();
		registrarPersona(nombre, apellido, genero, edad, dni, peso, altura);
		System.out.println("\n\nNavegar más opciones?\n1.Yes / 2.No" );
		siguienteOsalir = tecladoSiguiente.nextInt();
		if(siguienteOsalir != 1) {
			numeroIngresado = 9;
		}
		return numeroIngresado;
	}
	private static long cantidadDePersonas;
	private static double pesoTotal;
	private static long personasConSobrePeso;
	private static long personasConPesoIdeal;
	private static long personasDebajoDePeso;
	private static double edadPersonasBajoPeso;
	private static double edadPersonasSobrePeso;
	
	
	private static void mostrarMenu() {
		System.out.println("\n___________________________________________________");
		System.out.println(" ");
		System.out.println("Bienvenido al INDEC");
		System.out.println("___________________________________________________");
		System.out.println("___________________________________________________");
		System.out.println(" ");
		System.out.println("1.Registrar persona");
		System.out.println("2.Peso promedio de personas");
		System.out.println("3.Cantidad de personas con bajo peso");
		System.out.println("4.Cantidad de personas con peso normal");
		System.out.println("5.Cantidad de personas con sobre peso");
		System.out.println("6.Promedio de edad de las personas con bajo peso");
		System.out.println("7.Promedio de edad de las personas con sobre peso");
		System.out.println("___________________________________________________");
		System.out.println(" ");
		System.out.println("9.Salir");
		System.out.println("___________________________________________________\n");
	}
	
	private static void registrarPersona(String nombre, String apellido, String genero, int edad, long dni, double peso, double altura) {
		Persona persona = new Persona(nombre, apellido, genero, edad, dni, peso, altura);
		
		cantidadDePersonas++;
		pesoTotal += peso;
		if(persona.calcularIMC() == -1) {
			personasConPesoIdeal++;
		}
		else if(persona.calcularIMC() == 0) {
			personasDebajoDePeso++;
			edadPersonasBajoPeso += persona.getEdad();
		}
		else if(persona.calcularIMC() == 1){
			personasConSobrePeso++;
			edadPersonasSobrePeso += persona.getEdad();
		}
	}
	
	private static void getCantidadDePersonas() {
		System.out.print(cantidadDePersonas);
	}
	
	private static void getPesoPromedio() {
		System.out.print(pesoTotal / cantidadDePersonas);
	}
	
	private static void getCantidadDePersonasBajoPeso() {
		System.out.print(personasDebajoDePeso);
	}
	
	private static void getCantidadDePersonasConPesoNormal() {
		System.out.print(personasConPesoIdeal);
	}
	
	private static void getCantidadDePersonasConSobrePeso() {
		System.out.print(personasConSobrePeso);
	}
	
	private static void getPromedioEdadBajoPeso() {
		System.out.print(edadPersonasBajoPeso / personasDebajoDePeso);
	}
	
	private static void getPromedioEdadSobrePeso() {
		System.out.print(edadPersonasSobrePeso / personasConSobrePeso);
	}
}
