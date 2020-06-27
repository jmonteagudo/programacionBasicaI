package ar.edu.unlam.pb1.ejemplos;

public class ArraysBidimensionales {
	  public static void main(String[] args) {

	        int matriz[][];/*= {{1,2,3,4},
	                        {5,6,7,8},
	                        {9,10,11,12},
	                        {13,14,15,16}};*/

	        matriz = new int[8][43];
	        
	        // Ingreso de los valores
	        int contador=0;
	        for(int i=0;i<matriz.length;i++) {
	            for(int j=0;j<matriz[i].length;j++) {
	                matriz[i][j] = contador++;
	            }
	        }
	        
	        // Visualización de los valores
	        for(int i=0;i<matriz.length;i++) {
	            for(int j=0;j<matriz[i].length;j++) {
	                System.out.print(matriz[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
}
