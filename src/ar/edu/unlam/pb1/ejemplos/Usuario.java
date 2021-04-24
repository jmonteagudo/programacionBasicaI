package ar.edu.unlam.pb1.ejemplos;

public class Usuario {
	
	private String usuario;
	private String contraseña;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	public Usuario(String usuario, String contraseña, String nombre, String apellido, int dni, int edad) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}
	
	public Usuario(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Usuario() {
		
	}
	
	public String getUsuario() {
		return usuario;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
