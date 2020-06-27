package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class PruebaTornillo {

	public static void main(String[] args) {
		int numero;
		Tornillo phillips = new Tornillo(TipoDeCabeza.PHILLIPS, 6, 15);
		Tornillo plano = new Tornillo(TipoDeCabeza.PLANO, 10, 20);
		Destornillador blackAndDecker = new Destornillador(TipoDeCabeza.PHILLIPS);
		
		System.out.println("Condiciones iniciales:");
		System.out.println(phillips.toString());
		System.out.println(plano.toString());
		System.out.println(blackAndDecker.toString());
		
		blackAndDecker.atornillar(phillips);
		blackAndDecker.atornillar(plano);
		
		System.out.println(phillips.toString());
		System.out.println(plano.toString());

	}

}
