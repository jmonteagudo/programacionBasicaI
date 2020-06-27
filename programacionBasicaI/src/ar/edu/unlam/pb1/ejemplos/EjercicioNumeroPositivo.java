package ar.edu.unlam.pb1.ejemplos;

import java.util.Scanner;

public class EjercicioNumeroPositivo {
	
	public static void main(String[] args) {
		
		int numeroEntero = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero:");

		numeroEntero = s.nextInt();
		
		if(numeroEntero>0) {
			System.out.println("El número ingresado es positivo");
		}
		else {
			if(numeroEntero<0) {
				System.out.println("El número ingresado es negativo");
			}
			else {
				System.out.println("El número ingresado no puede catalogarse entre positivo o negativo");
			}
		}
		
		char caracter = 'a';
		
		switch(caracter) {
		case 'a':
			
		}
		
	}


}
