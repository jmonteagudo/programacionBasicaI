package ar.edu.unlam.pb1.trabajopractico06.prueba;

import ar.edu.unlam.pb1.trabajoPractico03.domain.Persona;
import ar.edu.unlam.pb1.trabajopractico01.dominio.Ascensor;

public class PruebaEnClase {

	public static void main(String[] args) {
		// Primitivos
		char letra;
		int numero;
		float plata;
		
		// Objetos
		Persona jorge;
		Ascensor prueba;
		String palabra;
		
		char letras[];
		int numeros[];
		
		numero = 5;
		//jorge = new Persona();
		/*
		letras = new char[5];
		letras[0] = 'a';
		letras[1] = 'e';
		letras[2] = 'i';
		letras[3] = 'o';
		letras[4] = 'u';
		
		for(int i=1; i<letras.length; i++) {
			System.out.println(letras[i]);
		}
*/
		Persona alumnosConMejorPromedio[];
		alumnosConMejorPromedio = new Persona[4];
	
		jorge = new Persona("Jorge", "Masculino", 654654, 80.0, 1.70);
		alumnosConMejorPromedio[0] = jorge;
		alumnosConMejorPromedio[1] = new Persona("Camila", "Femenino", 165465, 65, 1.6);
		alumnosConMejorPromedio[2] = jorge;
		alumnosConMejorPromedio[3] = alumnosConMejorPromedio[1];
		
		for(int i = 0; i<alumnosConMejorPromedio.length; i++) {
			System.out.println(alumnosConMejorPromedio[i].getEdad());
			System.out.println(alumnosConMejorPromedio[i].toString());
		}
		

	}

}
