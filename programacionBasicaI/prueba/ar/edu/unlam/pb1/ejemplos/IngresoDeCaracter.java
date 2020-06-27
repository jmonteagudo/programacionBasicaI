package ar.edu.unlam.pb1.ejemplos;

import java.util.Scanner;

public class IngresoDeCaracter {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String textoIngresado = "", textoDePrueba2 = "";
		int entero = 0;
		double real = 0.0;
		char ascii = '\0';
	
		System.out.println("Ingrese un texto");
		//textoIngresado = teclado.next();
		textoIngresado = teclado.nextLine();
		
		System.out.println("Ingrese otro texto");
		//textoDePrueba2 = teclado.next();
		textoDePrueba2 = teclado.nextLine();
		
		System.out.println(textoIngresado);
		System.out.println(textoDePrueba2);
		
		System.out.println("Ingrese un int");
		entero = teclado.nextInt();
		System.out.println("Ingrese un double");
		real = teclado.nextDouble();
		
		System.out.println(real);

		System.out.println("Ingrese solo un caracter");
		ascii = teclado.next().charAt(0);
		System.out.println(ascii);
	
		/*textoIngresado = teclado.nextLine();
		ascii = textoIngresado.charAt(0);*/
	}

}
