package ar.edu.unlam.pb1.ejemplos;

public class PruebaPassword {

	public static void main(String[] args) {
		
		Password contrasena;
		final int MULTIPLO = 8;
		
		for(int i = 1; i<=4; i++) {
			// Veamos que cuanto mas grande es la contrase�a, mas probabilidad de ser fuerte
			contrasena = new Password(i*MULTIPLO);
			
			if(contrasena.esFuerte()) {
				System.out.println(contrasena.getContrase�a() + " es fuerte");
			}
			else {
				System.out.println(contrasena.getContrase�a() + " no es fuerte");
			}
		}	
	}

}
