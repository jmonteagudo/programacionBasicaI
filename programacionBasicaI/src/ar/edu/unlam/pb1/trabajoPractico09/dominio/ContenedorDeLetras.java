package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class ContenedorDeLetras {
	
	private char letrasContenidas[];
	private int cantidadDeLetrasIngresadas;
	
	public ContenedorDeLetras(int cantidadDeLetras) {
		letrasContenidas = new char[cantidadDeLetras];
		cantidadDeLetrasIngresadas = 0;
	}
	
	public void ingresarNuevaLetra(char letra) {
		letrasContenidas[cantidadDeLetrasIngresadas++] = letra;
	}
	
	public char buscarLetra(int posicion) {
		return letrasContenidas[posicion];
	}
	
	public String toString() {
		String salida = "";
		
		for(int i=0; i<letrasContenidas.length; i++) {
			salida += "[" + i + "] - " + letrasContenidas[i] + "\n";
		}
		
		return salida;
	}

}
