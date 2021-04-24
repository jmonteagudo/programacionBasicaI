package ar.edu.unlam.pb1.trabajopractico08.dominio;

public class Cuenta {

	private String titular;
	private double saldo;
	
	public Cuenta(String titular){
		this.titular = titular;
		this.saldo = 0.0;
	}
	
	public Cuenta(String titular, double saldo){
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getsaldo() {
		return saldo;
	}

	// Eliminamos el método saldo porque no se puede manipular el saldo 
	/*public void setsaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	public String toString(){
		return "Titular: " + this.titular + " saldo: " + this.saldo;
	}
	
	public void depositar(double cantidad){
		if(cantidad>=0){
			this.saldo += cantidad;
		}
	}
	
	public void retirar(double cantidad){
		if(this.saldo<cantidad){
			System.out.println("Saldo insuficiente");
		}
		else{
			this.saldo-=cantidad;
		}
	}


}
