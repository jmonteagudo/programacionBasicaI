package ar.edu.unlam.pb1.trabajopractico08.dominio;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
        int contarA =0, contarE =0, contarI =0, contarO =0, contarU =0;
       
       
        final int TOPE = 10;
        int i=0;
        char[] vectorEstatico;
        vectorEstatico = new char[TOPE];

        for ( i = 0; i < vectorEstatico.length; i++) {
            vectorEstatico[i] = '\0';
        }        
        for (i = 0; i < vectorEstatico.length; i++) {
           
            System.out.println("Ingrese la proxima letra " + (i+1) + " : ");
            vectorEstatico[i] = teclado.next().charAt(0);
           
        }
       
       
        for ( i = 0; i < vectorEstatico.length; i++) {
            switch (vectorEstatico[i]) {
            case 'a':
            case 'A':
                contarA++;
                break;
            case 'e':
            case 'E':
                contarE++;
                break;
            case 'i':
            case 'I':
                contarI++;
                break;
            case'o':
            case'O':
                contarO++;
                break;
            case 'u':
            case 'U':            	
                contarU++;
                break;  
            }
        }
       
        System.out.println("cantidad de vocales a: " + contarA);
        System.out.println("cantidad de vocales e: " + contarE);
        System.out.println("cantidad de vocales i: " + contarI);
        System.out.println("cantidad de vocales o: " + contarO);
        System.out.println("cantidad de vocales u: " + contarU);
        System.out.println("cantidad de vocales encontradas: " + (contarA+contarE+contarI+contarU+contarO));
		
	}
}
