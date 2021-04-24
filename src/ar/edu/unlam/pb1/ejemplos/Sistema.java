package ar.edu.unlam.pb1.ejemplos;

public class Sistema {
	
	private String nombreDelSistema;
	private Usuario usuarios[];
	private int cantidadDeUsuarios = 0;
	private final int CANTIDAD_MAXIMA_DE_USUARIOS = 1000;
	
	public Sistema(String nombreDelSistema) {
		this.nombreDelSistema = nombreDelSistema;
		usuarios = new Usuario[CANTIDAD_MAXIMA_DE_USUARIOS];
	}
	
	public void ingresarUsuario(Usuario nuevo) {
		usuarios[cantidadDeUsuarios++] = nuevo;
	}
		
	public boolean loguearUsuario(String nombre, String contrase�a) {
		for(int i = 0; i<cantidadDeUsuarios; i++) {
			if(usuarios[i].getUsuario().equals(nombre)) {
				if(usuarios[i].getContrase�a().equals(contrase�a)){
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	
}
