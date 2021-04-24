package ar.edu.unlam.pb1.ejemplos;

public class Estanteria {
	private Caja estantes[][];
	private int i = 0;
	private int j = 0;
	
	public Estanteria() {
		estantes = new Caja[10][10];
	}
	
	public void ingresarCaja(Caja nueva, int i, int j) {
		estantes[i][j] = nueva;
	}
}
