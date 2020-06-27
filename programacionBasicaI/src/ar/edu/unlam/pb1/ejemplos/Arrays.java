package ar.edu.unlam.pb1.ejemplos;

import java.util.Random;

public class Arrays {
	
	public static void main(String[] args) {
		int[] vectorEnteros;
		String[] vectorString;
		final int TAMANIO_ENTERO=5;
		
		vectorEnteros = new int[TAMANIO_ENTERO];
			
		System.out.println("Valores enteros");
		for(int i=0;i<vectorEnteros.length; i++) {
			vectorEnteros[i]=(int) (Math.random()*100);
		}
		
		for(int i=0;i<vectorEnteros.length; i++) {
			System.out.println(vectorEnteros[i]);
		}
		
	}

}
