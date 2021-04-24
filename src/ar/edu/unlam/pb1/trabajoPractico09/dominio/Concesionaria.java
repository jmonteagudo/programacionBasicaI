package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import ar.edu.unlam.pb1.trabajoPractico03.domain.Coche;

public class Concesionaria {
	// Colección de coches
	private Coche flota[];
	private String nombre;
	private int cantidadActualDeCoches;
	
	public Concesionaria(String nombre, int cantidadMaximaDeCoches) {
		this.nombre = nombre;
		this.flota = new Coche [cantidadMaximaDeCoches];
		cantidadActualDeCoches = 0;
	}
	
	public boolean agregarCoche(Coche nuevo) {
		boolean resultado = false;
		if(cantidadActualDeCoches<flota.length) {
			flota[cantidadActualDeCoches++] = nuevo;
			resultado = true;
		}
		return resultado;
	}
	
	/*public boolean comprar(Coche nuevo) {
		for(int i = 0; i<flota.length; i++) {
			if(flota[i]==null) {
				flota[i] = nuevo;
				return true;
			}
		}
		return false;
	}
	
	public void vender(int codigo ) {
		flota[codigo] = null;
	}*/
	

	public Coche[] getFlota() {
		return flota;
	}

	public void setFlota(Coche[] flota) {
		this.flota = flota;
	}
	
	public void reemplazarCoche(int codigo, Coche nuevo) {
		flota[codigo] = nuevo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		String listado = "";
		
		for(int i = 0; i<cantidadActualDeCoches; i++) {
			listado += "[" + i + "]" + flota[i].getMarca() + " - " + flota[i].getModelo() + "\n";
		}
		
		return listado;
	}
	
	public Coche buscarCochePorCodigo(int codigo) {
		return flota[codigo];
	}
	
	public Coche buscarCochePorModelo(String modelo) {
		Coche resultado = null;
		for(int i = 0; i<flota.length; i++) {
			if(flota[i].getModelo().equals(modelo)) {
				resultado = flota[i];
			}
		}
		return resultado;
	}
}
