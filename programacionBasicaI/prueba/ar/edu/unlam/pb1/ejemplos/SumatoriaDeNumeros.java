package ar.edu.unlam.pb1.ejemplos;

import java.util.Scanner;

public class SumatoriaDeNumeros {

	public static void main(String[] args) {
		
		int i =0;
        int resultado=1;
        int numeroIngresado;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println ("Ingresar numero: ");
        numeroIngresado = teclado.nextInt();
       
        while (numeroIngresado < 0) {
        	System.out.println ("Numero incorrecto. Ingrese nuevamente: ");
            numeroIngresado = teclado.nextInt();
        }
        	
         while(i<numeroIngresado){
         	resultado *= 2;
            i++;
         }
         System.out.println("EL RESULTADO ES: "+resultado);
         
	}
	
	private static int sumatoria(int numero) {
		int resultado = 0;
		int i=0;
		
		while(i<=numero) {
			resultado=resultado+i;
			i++;
		}
		return resultado;
	}
	
	private static int factorial(int numero) {
		int resultado=numero;

		for(int i=numero-1; i>0; i--) {
			resultado *= i;
		}
		return resultado;
	}
	
	private static int potenciaDeDos(int potencia) {
		int resultado=1;
		int i = 0;
		final int DOS = 2;
		
		while(i<potencia) {
			resultado *= DOS;
			i++;
		}
		
		return resultado;
	}
	
	/*private static String divisores(int numero) {
		String resultado="";
		for(int i =0;i<numero;i++) {
			//Preguntamos si el i es divisor del numero
			resultado += i + ",";
		}
		return resultado;
		// Si recibi 10
		// resultado = "1, 2, 5"
	}*/
	
	

}
