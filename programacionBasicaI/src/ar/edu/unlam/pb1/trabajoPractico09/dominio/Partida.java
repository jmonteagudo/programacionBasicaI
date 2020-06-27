package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Partida {
	
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador turnoActual;
	
	public Partida(String nombreJugador1, String nombreJugador2) {
		jugador1 = new Jugador(nombreJugador1);
		jugador2 = new Jugador(nombreJugador2);
	}
	
	public void elegirIniciador() {
		
		double valorAleatorio = Math.random();
		if(valorAleatorio<0.5) {
			turnoActual = jugador1;
		}
		else {
			turnoActual = jugador2;
		}
	}
	
	public void setPalabraAAdivinarJugador1(String palabraAAdivinarPorAdversario) {
		jugador1.setPalabraAAdivinarPorAdversario(palabraAAdivinarPorAdversario);
		jugador2.inicializarPalabraAAdivinarPorMi(palabraAAdivinarPorAdversario.length());
	}
	
	public void setPalabraAAdivinarJugador2(String palabraAAdivinarPorAdversario) {
		jugador2.setPalabraAAdivinarPorAdversario(palabraAAdivinarPorAdversario);
		jugador1.inicializarPalabraAAdivinarPorMi(palabraAAdivinarPorAdversario.length());
	}
	
	public Jugador getTurnoActual() {
		return turnoActual;
	}
	
	public boolean arriegarLetra(char letraArriesgada) {
		boolean letraEncontrada = false;
		Jugador adversario;
		
		if(turnoActual == jugador1) {
			adversario = jugador2;
		}else {
			adversario = jugador1;
		}
		
		String palabraAAdivinar = adversario.getPalabraAAdivinarPorAdversario();
		
		for(int i = 0; i<palabraAAdivinar.length(); i++) {
			char letraActual = palabraAAdivinar.charAt(i);
			if(letraActual == letraArriesgada) {
				turnoActual.ingresarLetra(letraArriesgada, i);
				letraEncontrada=true;
			}
		}
		
		return letraEncontrada;
	}
	
	public boolean arriesgarPalabra(String palabraArriesgada) {
		String palabraAdversario;
		Jugador adversario;

		if(turnoActual == jugador1) {
			adversario = jugador2;
		}else {
			adversario = jugador1;
		}
		
		if(adversario.getPalabraAAdivinarPorAdversario().equals(palabraArriesgada)) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public void cambiarTurno() {
		if(turnoActual == jugador1) {
			turnoActual = jugador2;
		}else {
			turnoActual = jugador1;
		}
	}
	
	
}
