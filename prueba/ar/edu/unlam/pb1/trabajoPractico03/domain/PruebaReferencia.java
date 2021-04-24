package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class PruebaReferencia {

	public static void main(String[] args) {
		String texto1 = new String("Hola");
		String texto2 = new String("Hola");
		
		if(texto1 == texto2) {
			System.out.println("Los textos son iguales");
		}
		else {
			System.out.println("Los textos no son iguales");
		}

	}

}
