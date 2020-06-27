package ar.edu.unlam.pb1.trabajopractico06.prueba;

public class PruebaAscii {

	public static void main(String[] args) {
		char ascii = 48;
		System.out.println("Caracteres muméricos");
		do {
			System.out.print(" " + (int)ascii + " - " + ascii + ", ");
			ascii++;
		}while(ascii < 58);
		ascii = 65;
		System.out.println();
		System.out.println("Las letras mayusculas son: ");
		do {
			System.out.print(" " + (int)ascii + " - " + ascii + ", ");
			ascii++;
		}while(ascii < 91);
	}
	        

}
