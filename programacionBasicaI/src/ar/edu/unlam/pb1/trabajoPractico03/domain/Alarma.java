package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class Alarma {
	private Sensor sensorDeMovimiento;
	private Sensor sensorDeContacto;
	private Sensor sensorDeSonido;
	
	private boolean encendida;
	private int codigoDeSeguridad;
	
	public Alarma(int codigoDeSeguridad) {
		this.sensorDeMovimiento = new Sensor();
		this.sensorDeContacto = new Sensor();
		this.sensorDeSonido = new Sensor();
		this.encendida = false;
		this.codigoDeSeguridad = codigoDeSeguridad;
	}
	
	public void encender(int codigoDeSeguridad) {
		if(this.codigoDeSeguridad == codigoDeSeguridad) {
			this.encendida = true;	
		}
	}
	
	public void apagar(int codigoDeSeguridad) {
		if(this.codigoDeSeguridad == codigoDeSeguridad) {
			this.encendida = false;
		}
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public boolean activada() {
		boolean estaActiva = false;
		if(encendida) {
			if(sensorDeContacto.activado() || sensorDeMovimiento.activado() || sensorDeSonido.activado()) {
				estaActiva = true;
			}
		}
		return estaActiva;
	}
	
	public void activarSensorDeContacto() {
		sensorDeContacto.activar();
	}
	
	public void desactivarSensorDeContacto() {
		sensorDeContacto.desactivar();
	}
	
	public void activarSensorDeSonido() {
		sensorDeSonido.activar();
	}

	public void desactivarSensorDeSonido() {
		sensorDeSonido.desactivar();
	}
	
	public void activarSensorDeMovimiento() {
		sensorDeMovimiento.activar();
	}

	public void desactivarSensorDeMovimiento() {
		sensorDeMovimiento.desactivar();
	}
}
