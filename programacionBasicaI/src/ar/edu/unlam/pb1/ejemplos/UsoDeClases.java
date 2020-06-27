package ar.edu.unlam.pb1.ejemplos;

public class UsoDeClases {

	public static void main(String[] args) {
		
		java.util.Random numeroAleatorio = new java.util.Random();
		
		for(int i=0; i<20; i++) {
			//System.out.println("Numero aleatorio:" + numeroAleatorio.nextInt());
			//System.out.println("Numero aleatorio:" + numeroAleatorio.nextFloat());
			System.out.println("Numero aleatorio:" + (int) (Math.random()*10));
		}

		int i = Integer.parseInt("1000");
		
		char c = 'b';
		int value = c;
		System.out.println("Ascii: " + value + " valor: " + c);
	}

}
