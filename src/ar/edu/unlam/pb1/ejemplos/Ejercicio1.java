package ar.edu.unlam.pb1.ejemplos;

public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 2;
		
		a = a + b + c;
		System.out.println("Despu�s de la cuarta instrucci�n a tiene el valor:" + a);
		b = c / 2;
		System.out.println("Despu�s de la quinta instrucci�n b tiene el valor:" + b);
		a = a / b + potencia(a,c);
		
		System.out.println("Despu�s de la sexta instrucci�n a tiene el valor:" + a);
		System.out.println(a);
		System.out.println("a");
	}
	
	private static int potencia(int base, int exponente) {
		for(int i = 1; i<exponente; i++) {
			base*=base;
		}
		return base;
	}
}
