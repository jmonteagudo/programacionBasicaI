package ar.edu.unlam.pb1.trabajoPractico11.dominio;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int dni;
	private String profesion;
	
	public Persona(String nombre, String apellido, int dni, String profesion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.profesion = profesion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public String getProfesion() {
		return profesion;
	}


	public String toString() {
		return apellido + ", " + nombre; 
	}

}
