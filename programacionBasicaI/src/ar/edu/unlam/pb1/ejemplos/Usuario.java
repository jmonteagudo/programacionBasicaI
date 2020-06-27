package ar.edu.unlam.pb1.ejemplos;

public class Usuario {
	
	private String usuario;
	private String contrase�a;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	public Usuario(String usuario, String contrase�a, String nombre, String apellido, int dni, int edad) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}
	
	public Usuario(String usuario, String contrase�a) {
		this.usuario = usuario;
		this.contrase�a = contrase�a;
	}

	public Usuario() {
		
	}
	
	public String getUsuario() {
		return usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
