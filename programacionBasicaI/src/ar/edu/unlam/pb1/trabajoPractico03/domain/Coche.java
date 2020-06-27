package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class Coche {
	private final int CERO_KILOMETRO;
	private final int ANO_ACTUAL;
	private static int cantidadDeCoches;
	private String marca;
	private String modelo;
	private int kilometros;
	private int anio;
	private double precio;

	public Coche(String marca, String modelo, int kilometros, int ano, double precio) {
		CERO_KILOMETRO = 0;
		ANO_ACTUAL = 2020;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
		this.anio = ano;
		this.precio = precio;
		Coche.cantidadDeCoches++;
	}

	public int getCantidadDeCoches() {
		return cantidadDeCoches;
	}

	public void setCantidadDeCoches(int cantidadDeCoches) {
		this.cantidadDeCoches = cantidadDeCoches;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCERO_KILOMETRO() {
		return CERO_KILOMETRO;
	}

	public int getANO_ACTUAL() {
		return ANO_ACTUAL;
	}
	
	
}
