package ar.edu.unlam.pb1.ejemplos;

public class PruebaPersona {

	public static void main(String[] args) {

		final int EDAD_BUSCADA = 50;
		Persona ana = new Persona("Ana", "MUJER", 321321, 0.5, 0.5);
		
		System.out.println(ana.toString());
		
		// Inicialización; Condición; Íncremento
		for(int i=0; i<EDAD_BUSCADA; i++) {
			ana.cumplirAnos();
		}
		
		System.out.println(ana.toString());

	}

}
