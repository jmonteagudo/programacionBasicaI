package ar.edu.unlam.pb1.ejemplos;

import java.util.Scanner;

import ar.edu.unlam.pbi.utils.*;

public class HolaMundo {
	
	public static void main(String[] args) {
		
		int numeroEntero = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero entero:");

		numeroEntero = s.nextInt();
		
		if(numeroEntero>0) {
			System.out.println("El n�mero ingresado es positivo");
		}
		else {
			if(numeroEntero<0) {
				System.out.println("El n�mero ingresado es negativo");
			}
			else {
				System.out.println("El n�mero ingresado no puede catalogarse entre positivo o negativo");
			}
		}
		
	}

}
