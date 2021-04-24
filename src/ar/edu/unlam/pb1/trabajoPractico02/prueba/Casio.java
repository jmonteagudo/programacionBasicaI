package ar.edu.unlam.pb1.trabajoPractico02.prueba;

import ar.edu.unlam.pb1.trabajoPractico02.dominio.Calculadora;

public class Casio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora casio= new Calculadora();
		
		casio.sumar(5,8);
		if (casio.getResultado() == 13) {
			System.out.println("el resultado es valido");
		}
		
		
	}

}
