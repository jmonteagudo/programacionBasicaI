package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public class Sudoku {
	
	private int tablero[][];
	
	public Sudoku(int tablero[][]) {
		this.tablero = tablero;
	}
	
	public boolean validar(int fila, int columna, int valor) {
		if(validarFila(fila, valor) == false) {
			return false;
		}
		if(validarColumna(columna, valor) == false) {
			return false;
		}
		if(validarCuadrante(fila, columna, valor) == false) {
			return false;
		}
		
		return true;
	}
	
	private boolean validarFila(int fila, int valor) {
		for(int i = 0; i<tablero[fila].length; i++) {
			if(tablero[fila][i] == valor) {
				return false;
			}
		}
		return true;
	}
	
	private boolean validarColumna(int columna, int valor) {
		for(int i = 0; i<tablero.length; i++) {
			if(tablero[i][columna] == valor) {
				return false;
			}
		}
		return true;
	}
	
	private boolean validarCuadrante(int fila, int columna, int valor) {
		int cuadranteI, cuadranteJ;
		
		cuadranteI = ((int) fila /3);
		cuadranteJ = ((int) columna /3);
		
		for(int i=(cuadranteI*3); i<((cuadranteI*3)+3); i++) {
			for(int j=(cuadranteJ*3); j<((cuadranteJ*3)+3); j++) {
				if(tablero[i][j] == valor) {
					return false;
				}
			}
		}
		return true;
	}
	
	public int[][] getTablero() {
		return tablero;
	}
	
	public boolean validar() {
		int auxiliar = 0;
		
		if(algunaCeldaVacia()) {
			return false;
		}
		
		for(int i=0; i<tablero.length; i++) {
			for(int j= 0; j<tablero[i].length; j++) {
				auxiliar = tablero[i][j];
				tablero[i][j] = 0;
				if(!(validarFila(i, auxiliar))) {
					tablero[i][j] = auxiliar;
					return false;
				}
				if(!(validarColumna(j, auxiliar))) {
					tablero[i][j] = auxiliar;
					return false;
				}
				if(!(validarCuadrante(i, j, auxiliar))) {
					tablero[i][j] = auxiliar;
					return false;
				}
				tablero[i][j] = auxiliar;
			}
		}
		return true;
		
	}
	
	public boolean algunaCeldaVacia() {
		for(int i=0; i<tablero.length; i++) {
			for(int j= 0; j<tablero[i].length; j++) {
				if(tablero[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void resetear() {
		for(int i=0; i<tablero.length; i++) {
			for(int j= 0; j<tablero[i].length; j++) {
				tablero[i][j] = 0;
			}
		}
	}
	
	public void setValor(int fila, int columna, int valor) {
		if(valor>=1 && valor<=9) {
			tablero[fila][columna] = valor;
		}
	}

}
