package ar.edu.unlam.pb1.trabajoPractico11.dominio;

public class Avion {
	
	private String modelo;
	private String fechaVuelo;
	private String ciudadDestino;
	
	private Persona tripulantes[];
	private Persona pasajeros[][];
	
	public Avion(String modelo, String fechaVuelo, String ciudadDestino, int cantidadMaximaDeTripulantes, int cantidadDeFilas, int cantidadDeColumnas) {
		/*
		 * En el constructor de la clase se deben ejecutar las instrucciones necesarias para el correcto funcionamiento 
		 * de la misma.
		 */
	}
	
	public boolean registrarTripulante(Persona tripulante) {
		/*
		 * Sólo se pude registrar un tripulante si:
		 * a. La cantidad de tripulantes registrados es menor a la cantidad máxima de tripulantes para éste avión
		 * b. La profesión de la persona es "Asafata" o "Piloto" o "Copiloto".
		 */
		return true;
	}
	
	public boolean sentarPasajero(Persona pasajero, int fila, int columna) {
		/*
		 * Sólo se podrá sentar un pasajero si el asiento indicado está vacío
		 * 
		 */
		return true;
	}
	
	public Persona buscarPasajero(int dni) {
		/*
		 * Debe devolver el pasajero que tiene el DNI
		 */
		return null;
	}
	
	public Persona buscarPasajero(String apellido, String nombre) {
		/*
		 * Debe devolver el pasajero que tiene ese apellido y nombre
		 */
		return null;
	}
	
	public void ordenarTripulantesPorDni() {
		/*
		 * Ordena el array de tripulantes por dni
		 */
		
	}
	
	public void ordenarTripulantesPorApellido() {
		/*
		 * Ordena el array de tripulantes por apellido
		 */
	}
	
	public String toString() {
		/*
		 * Debe devolver un String que grafique los asientos qué asientos se encuentran ocupados y cuales libres
		 */
		return null;
	}

}
