package ar.edu.unlam.pb1.ejemplos;

public class EstanteriaDePrueba {

	public static void main(String[] args) {
		Estanteria miEstanteria = new Estanteria();
		Plano miPlano = new Plano();
		Caja nuevaCaja = new Caja();
		
		nuevaCaja.setPlano(miPlano);
		
		miEstanteria.ingresarCaja(nuevaCaja, 0, 0);

	}

}
