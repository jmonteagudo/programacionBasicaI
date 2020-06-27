package ar.edu.unlam.pb1.trabajoPractico02.dominio;

public class Calculadora {
	
	private double operador1;
	private double operador2;
	private double resultado;
	
	
	public Calculadora() {
		
	}

	public Calculadora (double operador1, double operador2) {
		this.operador1= operador1;
		this.operador2= operador2;
		
	}
	
	public double sumar () {
		resultado = operador1 + operador2;
		
		return resultado;
	}
	public double getResultado () {
		return resultado;
	}
	
	public double sumar (double operador1, double operador2) {
		this.operador1=operador1;
		this.operador2=operador2;
		resultado = operador1 + operador2;
		return resultado;
		
	}
	
	public double restar () {
		resultado = operador1 - operador2;
		return resultado;
	}
	
	public double dividir (double numerador, double divisor) {
		if (divisor!=0) {
			resultado = numerador / divisor;
		}
		return resultado;
	}
	
	

}
