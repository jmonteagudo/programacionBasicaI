package ar.edu.unlam.pb1.trabajoPractico09.prueba;

import ar.edu.unlam.pb1.trabajoPractico09.dominio.ContenedorDeLetras;

public class PruebaContenedorDeLetras {

	public static void main(String[] args) {

		ContenedorDeLetras prueba = new ContenedorDeLetras(5);
		
		prueba.ingresarNuevaLetra('a');
		prueba.ingresarNuevaLetra('e');
		prueba.ingresarNuevaLetra('i');
		prueba.ingresarNuevaLetra('o');
		prueba.ingresarNuevaLetra('u');
		
		System.out.println("La letra en la posición 2 es: " + prueba.buscarLetra(2));

		System.out.println("El contenido del contenedor de letras es:");
		System.out.println(prueba.toString());
	}

}
