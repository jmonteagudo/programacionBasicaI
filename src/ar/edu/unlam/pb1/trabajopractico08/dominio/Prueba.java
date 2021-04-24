package ar.edu.unlam.pb1.trabajopractico08.dominio;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personas[] = new String[3];
		int documentos[] = new int[3];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese nombre de la persona: ");
            personas[i] = teclado.next();
            System.out.println("Ingrese DNI de la persona: ");
            documentos[i] = teclado.nextInt();
            }
		while(documentos[0] != 6) {
			
		}
	}

}
