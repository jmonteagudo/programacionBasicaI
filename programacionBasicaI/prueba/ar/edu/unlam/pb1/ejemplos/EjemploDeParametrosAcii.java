package ar.edu.unlam.pb1.ejemplos;

public class EjemploDeParametrosAcii {

	public static void main(String[] args) {
		char numeroExpresadoEnChar = '4';
		int numeroConvertido=0;
		
		numeroConvertido = convertirCharAEntero(numeroExpresadoEnChar);
		System.out.println("El numero convertido es: " + numeroConvertido);

	}
	
	private static int convertirCharAEntero(char codigo) {
		int numeroConvertido = (int)codigo;
		return numeroConvertido;
	}

}
