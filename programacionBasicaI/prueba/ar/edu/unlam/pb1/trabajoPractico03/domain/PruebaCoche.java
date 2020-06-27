package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class PruebaCoche {

	public static void main(String[] args) {
		Coche elCocheDeLucrecia = new Coche("VW", "Golf", 0, 2020, 100000.0);
		System.out.println("La cantidad de coches es: " + elCocheDeLucrecia.getCantidadDeCoches());

		Coche elCocheDeRoberto = new Coche("VW", "Gol", 0, 2020, 90000.0);
		System.out.println("La cantidad de coches es: " + elCocheDeRoberto.getCantidadDeCoches());
	}

}
