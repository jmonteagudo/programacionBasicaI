package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public class BatallaNaval {
	
	private Casillero tablero[][];
	
	public BatallaNaval(int tamanioDelTablero) {
		tablero = new Casillero[tamanioDelTablero][tamanioDelTablero];
		inicializarTablero();
	}
	
	private void inicializarTablero() {
		for(int i=0; i<tablero.length; i++) {
			for(int j=0; j<tablero.length; j++) {
				tablero[i][j] = new Casillero();
			}
		}
	}
	
	public boolean agregarNave(Nave nueva) {
		
		if(sePuedeAgregar(nueva) == false) {
			return false;
		}
		
		if(nueva.getDireccion()==Direccion.HORIZONTAL) {
			agregarNaveEnDireccionHorizontal(nueva);
		}
		else {
			agregarNaveEnDireccionVertical(nueva);
		}
		
		return true;
	}
	
	private boolean sePuedeAgregar(Nave nueva) {
		if(nueva.getDireccion()==Direccion.HORIZONTAL) {
			return sePuedeAgregarHorizontalmente(nueva);
		}
		else {
			return sePuedeAgregarVerticalmente(nueva);
		}
	}

	private boolean sePuedeAgregarVerticalmente(Nave nueva) {
		for(int i=nueva.getColumnaInicial(); i<tablero[0].length; i++) {
			if(tablero[i][nueva.getColumnaInicial()].getEstado() != EstadosDelCasillero.LIBRE) {
				return false;
			}
		}
		return true;
	}

	private boolean sePuedeAgregarHorizontalmente(Nave nueva) {
		for(int j=nueva.getColumnaInicial(); j<tablero[0].length; j++) {
			if(tablero[nueva.getFilaInicial()][j].getEstado() != EstadosDelCasillero.LIBRE) {
				return false;
			}
		}
		return true;
	}
	
	private void agregarNaveEnDireccionHorizontal(Nave nueva) {
		for(int j=nueva.getColumnaInicial(); j<nueva.getColumnaInicial()+nueva.getDimension(); j++) {
			tablero[nueva.getFilaInicial()][j].setNave(nueva);
			tablero[nueva.getFilaInicial()][j].setEstado(EstadosDelCasillero.OCUPADO);
		}
	}
	
	private void agregarNaveEnDireccionVertical(Nave nueva) {
		for(int i=nueva.getFilaInicial(); i<nueva.getFilaInicial()+nueva.getDimension(); i++) {
			tablero[i][nueva.getColumnaInicial()].setNave(nueva);
			tablero[i][nueva.getColumnaInicial()].setEstado(EstadosDelCasillero.OCUPADO);
		}
	}
	
	public String disparar(int fila, int columna) {
		if(tablero[fila][columna].getEstado()==EstadosDelCasillero.OCUPADO) {
			tablero[fila][columna].setEstado(EstadosDelCasillero.IMPACTADO);
			tablero[fila][columna].getNave().impactar();
			if(tablero[fila][columna].getNave().hundido()) {
				return "Hundido!!!";
			}
			else {
				return "Tocado!";
			}
		}
		else if(tablero[fila][columna].getEstado()==EstadosDelCasillero.LIBRE){
			tablero[fila][columna].setEstado(EstadosDelCasillero.AGUA);
			return "Agua";
		}
		else {
			return "Desperdiciaste un turno! Esa posición ya la habías arriesgado.";
		}
	}
	
	public boolean hayGanador() {
		for(int i=0; i<tablero[0].length; i++) {
			for(int j=0; j<tablero.length; j++) {
				if(tablero[i][j].getEstado() == EstadosDelCasillero.OCUPADO) {
					return false;
				}
			}
		}
		return true;
	}
	
	public String toString() {
		String estado = " ";

		for(int i=0; i<tablero.length; i++) {
			estado+="____";
		}
		estado += " \n";
		for(int i=0; i<tablero[0].length; i++) {
			for(int j=0; j<tablero.length; j++) {
				estado += " | ";
				switch(tablero[i][j].getEstado()) {
				case AGUA:
					estado += "X";
					break;
				case IMPACTADO:
					estado += "!";
					break;
				default:
					estado += " ";
				}					
			}
			estado += " |\n";
		}
		estado+=" ";
		for(int i=0; i<tablero.length; i++) {
			estado+="¯¯¯¯";
		}
		return estado;
	}
}
