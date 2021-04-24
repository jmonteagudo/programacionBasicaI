package ar.edu.unlam.pb1.ejemplos;

import java.util.Scanner;

public class PruebaCoche {

	public static void main (String args[]) {
		Concesionaria carOne = new Concesionaria(1000);
		
		Coche nuevoCoche;
		nuevoCoche = new Coche("Ford", "Focus", 150000.0);
		nuevoCoche = new Coche("Fiat", "Toro", 160000.0);
		nuevoCoche = new Coche("Volkswagen", "Amarok", 200000.0);
		
		carOne.ingresarCoche(nuevoCoche);
		carOne.ingresarCoche(nuevoCoche);
		carOne.ingresarCoche(nuevoCoche);
	}	
}
