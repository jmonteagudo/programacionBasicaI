package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class PruebaCuenta {

	public static void main(String[] args) {
		
		Cuenta laCuentaDelSantander = new Cuenta("AG", 32000.0);
		
		System.out.println("La cuenta de AG está en el siguiente estado" + laCuentaDelSantander.toString());

	}

}
