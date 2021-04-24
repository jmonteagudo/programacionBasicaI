package ar.edu.unlam.pb1.trabajopractico06.prueba;

import ar.edu.unlam.pb1.trabajoPractico03.domain.Cuenta;

public class Hacker {

	public static void main(String[] args) {
		
		String nombreDeLaVictima = "Jorge";
		double saldoInicial = 5000.00;
				
		Cuenta victima = new Cuenta(nombreDeLaVictima, saldoInicial);
		
		saldoInicial = victima.getsaldo();
		
		while(victima.getsaldo()>(saldoInicial/2)) {
			double dineroAExtraer;
			
			dineroAExtraer = victima.getsaldo()*0.1;
			
			victima.retirar(dineroAExtraer);
			
			System.out.println("Se extrayeron " + dineroAExtraer + " pesos");
		}
		System.out.println("La cuenta de la victima quedo en " + victima.getsaldo());

	}

}
