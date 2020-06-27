package ar.edu.unlam.pb1.ejemplos;

public class Password {
	
	private int longitud;
	private String contrase�a;
	
	private final int LONGITUD_POR_DEFECTO = 8;
	
	public Password() {
		longitud = LONGITUD_POR_DEFECTO;
		contrase�a = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		contrase�a = "";
		generarPassword();				
	}
	
	public void generarPassword() {
		
		final char[] caracteresValidos = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','�','o','p','q','r','s','t','u','v','w','x','y','z', 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','�','O','P','Q','R','S','T','U','V','W','X','Y','Z', '0','1','2','3','4','5','6','7','8','9'};
		int posicionAleatoria = 0;
				
		for(int i=0; i<this.longitud; i++) {
			posicionAleatoria = (int) (Math.random()*(caracteresValidos.length));
			contrase�a = contrase�a + caracteresValidos[posicionAleatoria];
		}
	}
	
	public boolean esFuerte() {
		
		int cantidadDeMayusculas=0;
		int cantidadDeMinusculas=0;
		int cantidadDeNumeros=0;
		
		cantidadDeMayusculas = calcularCantidadDeMayusculas();
		cantidadDeMinusculas = calcularCantidadDeMinusculas();
		cantidadDeNumeros = calcularCantidadDeNumeros();
		
		if(cantidadDeMayusculas>=2 && cantidadDeMinusculas >= 1 && cantidadDeNumeros >= 5) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Otra opci�n para calcular la fortaleza de la contrase�a
	//expresionRegular = "^(?=.*[0-9]){5,}(?=.*[a-z]){1,}(?=.*[A-Z]){2,}.{\"+this.longitud+\",}$";
	public boolean esFuerte(String expresionRegular) {
		return contrase�a.matches(expresionRegular);
	}
	
	private int calcularCantidadDeMayusculas() {
		final char[] letrasMayusculas = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','�','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int cantidad=0;
		for(int i=0; i<contrase�a.length(); i++) {
			for(int j=0; j<letrasMayusculas.length; j++) {
				if(contrase�a.charAt(i)==letrasMayusculas[j]) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}
	
	private int calcularCantidadDeMinusculas() {
		final char[] letrasMinusculas = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','�','o','p','q','r','s','t','u','v','w','x','y','z'};
		int cantidad=0;
		for(int i=0; i<contrase�a.length(); i++) {
			for(int j=0; j<letrasMinusculas.length; j++) {
				if(contrase�a.charAt(i)==letrasMinusculas[j]) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}
	
	private int calcularCantidadDeNumeros() {
		final char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
		int cantidad=0;
		for(int i=0; i<contrase�a.length(); i++) {
			for(int j=0; j<numeros.length; j++) {
				if(contrase�a.charAt(i)==numeros[j]) {
					cantidad++;
				}
			}
		}
		return cantidad;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return String.valueOf(contrase�a);
	}
}
