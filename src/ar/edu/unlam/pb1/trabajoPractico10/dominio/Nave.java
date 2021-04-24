package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public class Nave {
	
	private int filaInicial;
	private int columnaInicial;
	private int dimension;
	private Direccion direccion;
	private int cantidadDeImpactos;
	
	public Nave(int filaInicial, int columnaInicial, int dimension, Direccion direccion) {
		this.filaInicial = filaInicial;
		this.columnaInicial = columnaInicial;
		this.dimension = dimension;
		this.direccion = direccion;
		this.cantidadDeImpactos = 0;
	}
	
	public void impactar() {
		cantidadDeImpactos++;
	}
	
	public boolean hundido() {
		return cantidadDeImpactos==dimension;
	}

	public int getFilaInicial() {
		return filaInicial;
	}

	public int getColumnaInicial() {
		return columnaInicial;
	}

	public int getDimension() {
		return dimension;
	}

	public Direccion getDireccion() {
		return direccion;
	}
}
