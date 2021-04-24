package ar.edu.unlam.pb1.trabajoPractico03.domain;

public class Persona {

	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	
	private final String HOMBRE = "Hombre";
	private final String MUJER = "MUJER";
	
	private final int MAYOR_DE_EDAD = 18;
	
	public Persona(String nombre, String genero, long dni, double peso, double altura){
		this.nombre = nombre;
		if(genero.toUpperCase().equals("MUJER")){
			this.genero = MUJER;
		}
		else{
			this.genero = HOMBRE;
		}
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		viva = true;
	}
		
	public String toString(){
		// return (nombre + " es " + genero.toUpperCase()=="MUJER"? " una ": " un " + genero + " de " + edad + " años de edad, pesa " + peso + " kilos, mide " + altura + " metro de altura  y su DNI es " + dni);
		if(viva){
			if(genero.toUpperCase().equals("MUJER")){
				return nombre + " es una " + genero + " de " + edad + " años de edad, pesa " + peso + " kilos, mide " + altura + " metro de altura  y su DNI es " + dni;
			}else{
				return nombre + " es un " + genero + " de " + edad + " años de edad, pesa " + peso + " kilos, mide " + altura + " metro de altura  y su DNI es " + dni;
			}
		}else{
			return nombre + " fue una gran persona que se llevaba muy bien con sus vecinos. QEPD";
		}
	}
	
	public void alimentar(double kilos){
		peso+=kilos;
	}	
	
	public void crecer(double metros){
			altura+=metros;
	}
	
	public void cumplirAnos(){
		edad++;
		System.out.println("Que los cumplas feliz\nQue los cumplas feliz\nQue los cumplas " + nombre + " que los cumplas feliz!");
	}
	
	public void morir(){
		viva = false;
	}
	
	public double pesar(){
		return peso;
	}
	
	public boolean esMayorDeEdad() {
		if(edad>=MAYOR_DE_EDAD) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int calcularIMC() {
		int BAJO_PESO = -1, NORMO_PESO = 0, SOBRE_PESO = 1;
		double imc = (peso/(altura*altura));
		if(imc<20.0) {
			return BAJO_PESO;
		}
		else if(imc>=20 && imc<=25) {
			return NORMO_PESO;
		}
		else {
			return SOBRE_PESO;
		}
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public int getEdad() {
		return edad;
	}

}
