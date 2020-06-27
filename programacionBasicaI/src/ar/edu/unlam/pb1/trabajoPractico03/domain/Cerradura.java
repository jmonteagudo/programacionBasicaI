package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class Cerradura {

	private int claveDeApertura;
	private final int CANTIDAD_DE_FALLOS_CONSECUTIVOS_QUE_LA_BLOQUEAN;
	private int cantidadDeIntentos;
	private boolean bloqueada;
	private boolean abierta;
	
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.bloqueada = false;
		this.abierta = false;
		this.cantidadDeIntentos = 0;
		this.claveDeApertura = claveDeApertura;
		this.CANTIDAD_DE_FALLOS_CONSECUTIVOS_QUE_LA_BLOQUEAN = cantidadDeFallosConsecutivosQueLaBloquean;
	}
	
	public boolean fueBloqueada() {
		return bloqueada;
	}
	
	public boolean abrir(int clave) {
		if(!abierta) {
			if(cantidadDeIntentos<CANTIDAD_DE_FALLOS_CONSECUTIVOS_QUE_LA_BLOQUEAN && this.claveDeApertura == clave) {
				abierta = true;
				cantidadDeIntentos=0;
			}
			else {
				cantidadDeIntentos++;
				if(cantidadDeIntentos>=CANTIDAD_DE_FALLOS_CONSECUTIVOS_QUE_LA_BLOQUEAN) {
					bloqueada = true;
				}
			}			
		}
		return abierta;
	}
}
