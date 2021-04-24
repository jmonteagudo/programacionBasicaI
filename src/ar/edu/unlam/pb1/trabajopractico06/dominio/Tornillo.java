package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Tornillo {
	private final TipoDeCabeza TIPO_DE_CABEZA; 
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;
	
	public Tornillo(TipoDeCabeza tipoDeCabeza, int longitud, int cantidadDeRosca) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRosca;
		this.posicionActual = 0;
	}
		
	public int getLongitud() {
		return LONGITUD;
	}
	
	public TipoDeCabeza getTipoDeCabeza() {
		return TIPO_DE_CABEZA;
	}
	
	public boolean girar(char sentido) {
		final char HORARIO = 'H', ANTIHORARIO = 'A';
		boolean sePudoGirar = false;
		
		switch(sentido) {
		case HORARIO:
			if(posicionActual < CANTIDAD_DE_ROSCA) {
				posicionActual++;
				sePudoGirar = true;
			}else {
				sePudoGirar = false;
			}
			break;
		case ANTIHORARIO:
			if(posicionActual>0) {
				posicionActual--;
				sePudoGirar = true;		
			}else {
				sePudoGirar = false;
			}
			break;
		default:
			sePudoGirar = false;
		}
		
		return sePudoGirar;
	}
	
	/*public String toString() {
		String caracteristicasTornillo = "El tornillo tipo ";
		switch(TIPO_DE_CABEZA){
		case 'P':
			caracteristicasTornillo += "Plano";
			break;
		case 'H':
			caracteristicasTornillo += "Phillips";
			break;
		case 'A':
			caracteristicasTornillo += "Allen";
			break;
		default:
			caracteristicasTornillo += "Inválido";
			break;
		}
		
		caracteristicasTornillo += " se encuentra en la posicion " + posicionActual;
		
		return caracteristicasTornillo;
	}*/
}
