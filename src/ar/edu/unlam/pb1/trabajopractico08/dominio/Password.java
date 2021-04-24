package ar.edu.unlam.pb1.trabajopractico08.dominio;

public class Password {
	private int longitud;
	private String contrasena;
	
	private final int LONGITUD_POR_DEFAULT = 8;
	
	public Password() {
		this.longitud = LONGITUD_POR_DEFAULT;
		this.contrasena = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}
	
	private void generarPassword() {
		
	}
	
	public boolean esFuerte() {
		int cantidadNumeros=0;
		for(int i=0; i<contrasena.length(); i++) {
			if(contrasena.charAt(i)>48 && contrasena.charAt(i)<57) {
				cantidadNumeros++;
			}
		}
		
		return false;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}	
}
