package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb1.trabajoPractico03.domain.Coche;

public class ConcesionariaTest {

	@Test
	public void queSeCreeLaConcesionariaCorrectamente() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Concesionaria volkswagen = new Concesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche laFlotaDeOlivieri[] = volkswagen.getFlota();
		
		assertEquals("Olivieri", volkswagen.getNombre());
		assertEquals(CANTIDAD_MAXIMA_DE_VEHICULOS, laFlotaDeOlivieri.length);
	}
	
	@Test
	public void queSeAgregueBienUnCoche() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Concesionaria volkswagen = new Concesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche vw = new Coche("VW", "FOX", 0, 0 ,1000.0);
		
		assertTrue(volkswagen.agregarCoche(vw));
	}
	
	@Test
	public void queSeListeCorrectamenteLaFlota() {
		final int CANTIDAD_MAXIMA_DE_VEHICULOS = 100;
		Concesionaria volkswagen = new Concesionaria("Olivieri", CANTIDAD_MAXIMA_DE_VEHICULOS);
		Coche vw = new Coche("VW", "FOX", 0, 0 ,1000.0);
		Coche ford = new Coche("FORD", "KA", 0, 0 ,2007.0);
		String resultado = volkswagen.toString();
		
		volkswagen.agregarCoche(vw);
		volkswagen.agregarCoche(ford);
		resultado = volkswagen.toString();
		
		assertEquals(resultado, volkswagen.toString());
	}

}
