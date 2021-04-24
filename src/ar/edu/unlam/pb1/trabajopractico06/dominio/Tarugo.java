package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Tarugo {
	private final int LONGITUD;
	
	public Tarugo(int longitud) {
		LONGITUD = longitud;
	}
	
	public int getLongitud() {
		return LONGITUD;
	}
	
	public String toString() {
		return "La longitud del tarugo es: " + LONGITUD;
	}

}
