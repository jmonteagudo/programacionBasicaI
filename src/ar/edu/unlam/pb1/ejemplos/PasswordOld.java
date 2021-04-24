package ar.edu.unlam.pb1.ejemplos;

/* Para el manejo de cadenas de caracteres (Strings) conviene apoyarnos en la funcionalidad o compartamiento ya
 * desarrollado por otros programadores. 
 * En cualquier sitio de Internet podemos descubrir este comportamiento, investingando los m�todos que esta 
 * clase contiene, y analizando cuales de ellos podemos utilizar. Por ejemplo:
 * 
 * charAt: Devuelve el caracter indicado por par�metro
 * 		Recibe: int (posici�n en la cadena de caracteres)
 * 		Devuelve: char
 * 
 * getBytes: Devuelve un array de bytes con el c�digo ASCII de los caracteres que forman el String
 * 		Recibe: Nada
 * 		Devuelve: Un array de bytes
 * 
 * lenght: Devuelve la longitud de la cadena
 * 		Recibe: Nada
 * 		Devuelve: int
 * 
 * matches: Indica si la cadena cumple con la expresi�n pasada como par�metro
 * 		Recibe: String
 * 		Devuelve: boolean
 * 
 * toCharArray: Devuelve en un array de char, todos los caracteres de un String
 * 		Recibe: Nada
 * 		Devuelve: Un array de char
 * 
 * substring:
 */

public class PasswordOld {
	
	private int longitud;
	private String contrase�a;
	
	private final int LONGITUD_POR_DEFECTO = 8;
	
	public PasswordOld() {
		longitud = LONGITUD_POR_DEFECTO;
	}
	
	public PasswordOld(int longitud) {
		this.longitud = longitud;
		generarPassword();				
	}
	
	public void generarPassword() {
		
		String stringConLosCaracteresValidos = "ABCDEFGHIJKLMN�OPQRSTUVWXYZabcdefghijklmn�opqrstuvwxyz1234567890";
		int posicionAleatoriaDelString = 0;
				
		for(int i=0; i<this.longitud; i++) {
			posicionAleatoriaDelString = (int) (Math.random()*(stringConLosCaracteresValidos.length()));
			contrase�a = contrase�a + stringConLosCaracteresValidos.charAt(posicionAleatoriaDelString);
		}
	}
	
	public boolean esFuerte() {
		return contrase�a.matches("^(?=.*[0-9]){5,}(?=.*[a-z]){1,}(?=.*[A-Z]){2,}.{"+this.longitud+",}$");
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}
}
