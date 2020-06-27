package ar.edu.unlam.pb1.trabajopractico06.prueba;

import ar.edu.unlam.pb1.trabajopractico06.dominio.*;

public class PruebaDestornillador {

	public static void main(String[] args) {
		
		Destornillador phillips, plano, allen;
		Tornillo phillips1, phillips2, plano1, plano2;
		Tarugo generico1, generico2;
		
		// Instanciamos los objetos
		phillips = new Destornillador(TipoDeCabeza.PHILLIPS);
		plano = new Destornillador(TipoDeCabeza.PLANO);
		allen = new Destornillador(TipoDeCabeza.ALLEN);
		
		phillips1 = new Tornillo(TipoDeCabeza.PHILLIPS, 6, 4);
		phillips2 = new Tornillo(TipoDeCabeza.PHILLIPS, 10, 8);
		plano1 = new Tornillo(TipoDeCabeza.PLANO, 6, 4);
		plano2 = new Tornillo(TipoDeCabeza.PLANO, 4, 2);
		
		generico1 = new Tarugo(10);
		generico2 = new Tarugo(5);
		
		
		// Verificamos se hayhan instanciado bien
		System.out.println(phillips);
		System.out.println(plano);
		System.out.println(allen);
		
		System.out.println(phillips1);
		System.out.println(phillips2);
		System.out.println(plano1);
		System.out.println(plano2);
		
		System.out.println(generico1);
		System.out.println(generico2);
		
		// Atornillamos phillips1
		phillips.atornillar(phillips1);
		System.out.println(phillips1);
	}
}
