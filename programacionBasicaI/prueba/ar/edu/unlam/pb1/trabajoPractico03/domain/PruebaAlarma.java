package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class PruebaAlarma {

	public static void main(String[] args) {
		int codigoDeSeguridad = 9876;
		Alarma laAlarmaDeAleAcme = new Alarma(codigoDeSeguridad);
		
		// Al crearla está encendida?
		if(laAlarmaDeAleAcme.isEncendida()) {
			System.out.println("Algo salio mal. No deberia esta encendida");
		}
		else {
			System.out.println("Al instanciarse, una alarma esta apagada");
		}
		
		// Encendemos la alarma
		laAlarmaDeAleAcme.encender(codigoDeSeguridad);
		
		// Está activada?
		if(laAlarmaDeAleAcme.activada()) {
			System.out.println("Algo salio mal. No deberia esta activada");			
		}
		else {
			System.out.println("Al instanciarse, una alarma esta inactiva");
		}
		
		// Que pasa si rompo un vidrio?
		laAlarmaDeAleAcme.activarSensorDeContacto();
		
		// Esta activada?
		if(laAlarmaDeAleAcme.activada()) {
			System.out.println("Joya, al romper un vidrio, la alarma suena");			
		}
		else {
			System.out.println("Algo salio mal, nadie vio nada");
		}		
		
		// Si la apago... se apaga?
		laAlarmaDeAleAcme.apagar(codigoDeSeguridad);
		
		if(laAlarmaDeAleAcme.isEncendida()) {
			System.out.println("Algo salio mal. No deberia esta encendida");
		}
		else {
			System.out.println("Al apagarse, una alarma esta apagada");
		}
	}

}
