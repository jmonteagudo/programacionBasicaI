package ar.edu.unlam.pb1.trabajoPractico11.dominio;

public class Vuelo {

	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;

	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;

	public Vuelo(String origen, String destino, int cantidadPasajero) {
		
		/* 
		 * El constructor debe generar las acciones necesarias para garantizar el correcto funcionamiento de los objetos de la clase
		 */

		this.origen = origen;
		this.destino = destino;
		this.pasajeros = new Pasajero[cantidadPasajero];
		this.asientos = new Pasajero[CANTIDAD_DE_FILAS][CANTIDAD_DE_ASIENTOS_POR_FILA];
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del avión. Devuelve true si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
		
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajeros[i] == null) {
				this.pasajeros[i] = pasajero;
				return true;
			}

		}
		return false;
	}

	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
		
		if (this.asientos[fila][columna]==null) {
			return true;	
		}
		return false;
	}

	public Pasajero buscarPasajero(int dni) {
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI.
		 */
		
		for (int i = 0; i < this.pasajeros.length; i++) {
			if (this.pasajeros[i]!=null&&this.pasajeros[i].getDni()==dni){
				return this.pasajeros[i];
			}
			
		}
		return null;
	}

	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		/*
		 * Asigna un asiento al pasajer recibido por parámetro
		 */
		
		if(this.verificarDisponibilidadAsiento(fila, columna)) {
			this.asientos[fila][columna]=pasajero;
			return true;
		}
		return false;
	}
	
	public void ordenarListaDePasajerosPorDNI() {
		/*
		 * Ordena la lista de pasajeros por DNI.
		 */
	}
	
	public Pasajero[] getPasajeros() {
		/*
		 * Devuelve la lista de pasajeros
		 */
		
		return pasajeros;
	}
	
	public String toString() {
		/*
		 * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se encuentra libre "L" u ocupado "O".
		 */

		String resultado = "";
		
		for (int i = 0; i < asientos.length; i++) {
			resultado += i+" ";
			for (int j = 0; j < 6; j++) {
				
				if (asientos[i][j] == null) {
		
					resultado += "L";
				}
				else
					resultado += "O";
			}
			resultado += "";
		}
		return resultado;
	}
}
