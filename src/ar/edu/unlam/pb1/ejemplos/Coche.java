package ar.edu.unlam.pb1.ejemplos;

public class Coche {
	
	private String marca;
	private String modelo;
	private int kilometros;
	private int a�o; 
	private double precio;
	
	private static int cantidadCoches=0;
	
	private final int CERO_KM = 0;
	private final int A�O_ACTUAL = 2018;
	
	public Coche(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.kilometros = CERO_KM;
		this.a�o = A�O_ACTUAL;
		cantidadCoches++;
	}
	
	public Coche(String marca, String modelo, int kilometros, int a�o, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.kilometros = kilometros;
		this.a�o = A�O_ACTUAL;
		cantidadCoches++;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public static int getCantidadCoches() {
		return Coche.cantidadCoches;
	}
	
	public int calcularAntiguedad() {
		return (A�O_ACTUAL-a�o);
	}
	
	public int getKilometros() {
		return this.kilometros;
	}
}
