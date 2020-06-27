package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class Sensor {
	private boolean estado;
	
	public Sensor() {
		estado = false;
	}
	
	public boolean activado() {
		return estado;
	}
	
	public void activar() {
		estado = true;
	}
	
	public void desactivar() {
		estado = false;
	}
}
