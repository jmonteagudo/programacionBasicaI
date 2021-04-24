package ar.edu.unlam.pb1.trabajoPractico10.prueba;

import ar.edu.unlam.pb1.trabajoPractico10.dominio.Sudoku;

public class PruebaSudoku {
	
	public static void main(String args[]) {
	
		Sudoku facil, intermedio, dificil;
		
		int[][] valido = {
				{1, 5, 4, 6, 9, 3, 2, 8, 7},
				{6, 3, 2, 5, 7, 8, 9, 4, 1},
				{8, 9, 7, 1, 2, 4, 6, 5, 3},
				{5, 1, 9, 8, 4, 7, 3, 2, 6},
				{2, 4, 3, 9, 6, 5, 7, 1, 8},
				{7, 6, 8, 3, 1, 2, 4, 9, 5},
				{4, 8, 6, 7, 5, 9, 1, 3, 2},
				{9, 7, 5, 2, 3, 1, 8, 6, 4},
				{3, 2, 1, 4, 8, 6, 5, 7, 9}
		};
		
		int[][] invalido = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9},
				{2, 3, 4, 5, 6, 7, 8, 9, 1},
				{3, 4, 5, 6, 7, 8, 9, 1, 2},
				{4, 5, 6, 7, 8, 9, 1, 2, 3},
				{5, 6, 7, 8, 9, 1, 2, 3, 4},
				{6, 7, 8, 9, 1, 2, 3, 4, 5},
				{7, 8, 9, 1, 2, 3, 4, 5, 6},
				{8, 9, 1, 2, 3, 4, 5, 6, 7},
				{9, 1, 2, 3, 4, 5, 6, 7, 8}
		};
		facil = new Sudoku(valido);
		
		// Validamos un Sudoku completado correctamente
		if(facil.validar()==true) {
			System.out.println("Validación OK para Sudoku completado correctamete");
		}
		else {
			System.out.println("Fallo validacion para Sudoku completado correctamete");
		}
		
		// Validamos un sudoku con errores
		intermedio = new Sudoku(invalido);
		if(intermedio.validar()==false) {
			System.out.println("Validación OK para Sudoku completado incorrectamete");
		}
		else {
			System.out.println("Fallo validacion para Sudoku completado incorrectamete");
		}
		
		// Validamos el ingreso de un valor valido
		facil.resetear();
		
		if(facil.validar(0, 0, 1)==true) {
			System.out.println("Validación OK para ingreso valor válido");
			facil.setValor(0, 0, 1);
		}
		else {
			System.out.println("Fallo validacion para ingreso de valor válido");
		}
		
		if(facil.validar(0, 1, 2)==true) {
			System.out.println("Validación OK para ingreso valor válido");
			facil.setValor(0, 1, 2);
		}
		else {
			System.out.println("Fallo validacion para ingreso de valor válido");
		}
		
		if(facil.validar(0, 2, 3)==true) {
			System.out.println("Validación OK para ingreso valor válido");
			facil.setValor(0, 2, 3);
		}
		else {
			System.out.println("Fallo validacion para ingreso de valor válido");
		}
		
		if(facil.validar(0, 3, 4)==true) {
			System.out.println("Validación OK para ingreso valor válido");
			facil.setValor(0, 3, 4);
		}
		else {
			System.out.println("Fallo validacion para ingreso de valor válido");
		}
		
		// Validamos el ingreso de un valor invalido a nivel fila
		if(facil.validar(0, 4, 1)==false) {
			System.out.println("Validación OK para ingreso valor inválido en una fila");
		}
		else {
			System.out.println("Fallo validacion para ingreso de valor inválido en una fila");
		}
		
		// Validamos el ingreso de un valor invalido a nivel columna
		if(facil.validar(1, 0, 1)==false) {
			System.out.println("Validación OK para ingreso valor inválido en una columna");
		}
		else {
			System.out.println("Fallo validacion para ingreso de valor inválido en una columna");
		}
		
		// Validamos el ingreso de un valor invalido a nivel cuadrante 
		facil.resetear();
		facil.setValor(3, 6, 1);
		facil.setValor(3, 7, 2);
		facil.setValor(3, 8, 3);
		facil.setValor(4, 6, 4);
		facil.setValor(4, 7, 5);
		facil.setValor(4, 8, 6);

		if(facil.validar(5, 7, 3)==false){
			System.out.println("Validación OK para ingreso valor inválido en un cuadrante");
		}
		else {
			System.out.println("Fallo validacion para ingreso de valor inválido en un cuadrante");
		}
	}	
}
