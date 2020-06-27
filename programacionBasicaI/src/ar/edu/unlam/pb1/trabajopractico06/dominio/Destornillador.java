package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Destornillador {
	private final TipoDeCabeza TIPO_DE_CABEZA; 
	
	public Destornillador(TipoDeCabeza tipoDeCabeza) {
		TIPO_DE_CABEZA = tipoDeCabeza;
	}
	
	public void desatornillar(Tornillo tornilloActual) {
		
		boolean sePuedeSeguir = true;
		final char HORARIO = 'H', ANTIHORARIO = 'A';
		
		if(tornilloActual.getTipoDeCabeza()==TIPO_DE_CABEZA) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(ANTIHORARIO);
			}
		}	
	}
	
	public void atornillar(Tornillo tornilloActual) {
		
		boolean sePuedeSeguir = true;
		final char HORARIO = 'H', ANTIHORARIO = 'A';
		
		if(tornilloActual.getTipoDeCabeza()==TIPO_DE_CABEZA) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(HORARIO);
			}
		}
	}
	
	public void desatornillar(Tornillo tornilloActual, Tarugo tarugoActual) {
		
		boolean sePuedeSeguir = true;
		final char HORARIO = 'H', ANTIHORARIO = 'A';
		
		if(tornilloActual.getTipoDeCabeza()==TIPO_DE_CABEZA &&	 tornilloActual.getLongitud() == tarugoActual.getLongitud()) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(ANTIHORARIO);
			}
		}
	}
	
	public void atornillar(Tornillo tornilloActual, Tarugo tarugoActual) {
		
		boolean sePuedeSeguir = true;
		final char HORARIO = 'H', ANTIHORARIO = 'A';
		
		if(tornilloActual.getTipoDeCabeza()==TIPO_DE_CABEZA && tornilloActual.getLongitud() <= tarugoActual.getLongitud()) {
			while(sePuedeSeguir) {
				sePuedeSeguir = tornilloActual.girar(HORARIO);
			}
		}
	}
	/*
	public String toString () {
		String caracteristicasDestornillador = "Destornillador tipo ";
		switch(TIPO_DE_CABEZA){
		case 'P':
			caracteristicasDestornillador += "Plano";
			break;
		case 'H':
			caracteristicasDestornillador += "Phillips";
			break;
		case 'A':
			caracteristicasDestornillador += "Allen";
			break;
		default:
			caracteristicasDestornillador += "Inválido";
			break;
		}
		return caracteristicasDestornillador;
	}*/
}
