package ar.edu.unlam.pb1.ejemplos;

public class Restaurant {
	
	private boolean mesas[][];
	
	public Restaurant(int cantidadFilas, int cantidadColumnas) {
		mesas = new boolean[cantidadFilas][cantidadColumnas];
	}
	
	public void inicializarMapaDeMesas() {
		for(int i=0; i<mesas.length; i++) {
			for(int j=0; j<mesas.length; j++) {
				mesas[i][j] = false;
			}
		}
	}
	
	public boolean estaLaMesaOcupada(int fila, int columna) {
		return mesas[fila][columna];
	}
	
	public void ocuparMesa(int fila, int columna) {
		mesas[fila][columna] = true;
	}
}
