package ar.edu.unlam.pb1.ejemplos;

public class Ejercicio1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 2;
		
		a = a + b + c;
		System.out.println("Después de la cuarta instrucción a tiene el valor:" + a);
		b = c / 2;
		System.out.println("Después de la quinta instrucción b tiene el valor:" + b);
		a = a / b + potencia(a,c);
		
		System.out.println("Después de la sexta instrucción a tiene el valor:" + a);
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
