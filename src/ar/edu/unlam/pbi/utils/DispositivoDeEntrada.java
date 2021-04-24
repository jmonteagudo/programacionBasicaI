package ar.edu.unlam.pbi.utils;

import java.io.*;

public class DispositivoDeEntrada {
	
	private static String inicializar() {
		String buffer="";
		InputStreamReader flujo=new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(flujo);
		try {
			buffer = teclado.readLine();
		} catch(Exception e) {
			System.out.append("Ingreso incorrecto");
		}
		
		return buffer;
	}
	
	public static int leerInteger() {
		int valor = Integer.parseInt(inicializar());
		return valor;
	}
	
	public static double leerDouble(){
		double valor = Double.parseDouble(inicializar());
		return valor;
	}
	
	public static String leerString() {
		String valor = inicializar();
		return valor;
	}
	
	public static char leerChar() {
		return (inicializar().charAt(0)); 
	}

}
