package ar.edu.unlam.pb1.trabajoPractico09.prueba;

import java.util.Scanner;

public class PruebaCapicua {

	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int numeroIngresado[], TAMANIO_NUMERO = 6;
		
		numeroIngresado = new int[TAMANIO_NUMERO];
		
		System.out.println("Ingrese " + TAMANIO_NUMERO + " numeros: ");
		for(int i = 0; i<TAMANIO_NUMERO; i++) {
			numeroIngresado[i] = teclado.nextInt();
		}
		
		int i=0, j=TAMANIO_NUMERO - 1;
		while((i<=j) && (numeroIngresado[i]==numeroIngresado[j])) {
			i++;
			j--;
		}
		
		if(i>=j) {
			System.out.println("El número ingresado es capicua");
		}
		else {
			System.out.println("El número ingresado no es capicua");
		}
		
	}
}
