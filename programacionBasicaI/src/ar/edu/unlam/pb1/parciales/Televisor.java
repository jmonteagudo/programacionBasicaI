package ar.edu.unlam.pb1.parciales;

public class Televisor {
	
	private static final char ENTRADA_TELEVISION_DE_AIRE = 'A';
	private static final char ENTRADA_TELEVISION_POR_CABLE = 'C';
	private static final char ENTRADA_HDMI1 = '1';
	private static final char ENTRADA_HDMI2 = '2';
	private static final char ENTRADA_USB = 'U';
	
	private final byte CANAL_MAXIMO_TELEVISION_ABIERTA;
	private final short CANAL_MAXIMO_TELEVISION_POR_CABLE;
	private final byte CANAL_MINIMO_TELEVISION;
	
	private final byte VOLUMEN_MINIMO = 0;
	private final byte VOLUMEN_MAXIMO = 100;
	
	private static long ultimoNumeroDeSerie = 0;
	private final long numeroDeSerie;
		
	private boolean controlParenteralActivado;
	private short claveControlParenteral;
	private short canalParaMayoresInicial ;
	private short canalParaMayoresFinal;
	
	private boolean encendido;
	private byte volumenActual;
	private short canalActual;
	private short canalAnterior;
	private char entradaActual;
	
	public Televisor(byte canalMaximoTelevisionAbierta, short canalMaximoTelevisionPorCable) {
		this.numeroDeSerie = ultimoNumeroDeSerie++;
		this.CANAL_MAXIMO_TELEVISION_ABIERTA = canalMaximoTelevisionAbierta;
		this.CANAL_MAXIMO_TELEVISION_POR_CABLE = canalMaximoTelevisionPorCable;
		this.CANAL_MINIMO_TELEVISION = 0;
		this.controlParenteralActivado = false;
		this.claveControlParenteral = 0;
		this.canalParaMayoresInicial = 0;
		this.canalParaMayoresFinal = 0;
		this.encendido = false;
		this.volumenActual = 0;
		this.canalActual = 0;
		this.entradaActual = Televisor.ENTRADA_TELEVISION_DE_AIRE;
	}	
	
	public Televisor(byte canalMaximoTelevisionAbierta, short canalMaximoTelevisionPorCable, short claveControlParenteral, short canalParaMayoresInicial, short canalParaMayoresFinal) {
		this.numeroDeSerie = ultimoNumeroDeSerie++;
		this.CANAL_MAXIMO_TELEVISION_ABIERTA = canalMaximoTelevisionAbierta;
		this.CANAL_MAXIMO_TELEVISION_POR_CABLE = canalMaximoTelevisionPorCable;
		this.CANAL_MINIMO_TELEVISION = 0;
		this.controlParenteralActivado = true;
		this.claveControlParenteral = claveControlParenteral;
		this.canalParaMayoresInicial = canalParaMayoresInicial;
		this.canalParaMayoresFinal = canalParaMayoresFinal;
		this.encendido = false;
		this.volumenActual = 0;
		this.canalActual = 0;
		this.entradaActual = Televisor.ENTRADA_TELEVISION_DE_AIRE;
	}	
	
	public void encenderOApagar() {
		this.encendido = !this.encendido;
	}
	
	public String toString() {
		return "Volmen actual " + volumenActual + "Canal actual " + canalActual + "Entrada actual: " + entradaActual;
	}
	
	public void seleccionarEntrada(char entradaDeseada) {

		switch(entradaDeseada) {
		case Televisor.ENTRADA_TELEVISION_DE_AIRE:
		case Televisor.ENTRADA_TELEVISION_POR_CABLE:
		case Televisor.ENTRADA_HDMI1:
		case Televisor.ENTRADA_HDMI2:
		case Televisor.ENTRADA_USB:
			this.entradaActual = entradaDeseada;
			break;
		}		
	}

	public void subirOBajarAnalogicamente(char operacion) {
		short canalActual = this.getCanalActual();
		byte volumenActual = this.getVolumenActual();
		
		switch(operacion) {
		case '+':
			this.setVolumne(++volumenActual);
			break;
		case '-':
			this.setVolumne(--volumenActual);
			break;
		case '>':
			this.setCanal(++canalActual);
			break;
		case '<':
			this.setCanal(--canalActual);
			break;
		}
	}
	
	private void setVolumne(byte volumenDeseado) {
		if(volumenDeseado>= VOLUMEN_MINIMO && volumenDeseado <= VOLUMEN_MAXIMO) {
			this.volumenActual = volumenDeseado;
		}
	}
	public void cambiarDeCanal(char canalDeseado) {
		this.canalAnterior = this.canalActual;
		this.setCanal((short) convertirAShort(canalDeseado));
	}
	
	public void cambiarDeCanal(char primerDigito, char segundoDigito) {
		short canalDeseado = convertirAShort(primerDigito, segundoDigito);
		this.setCanal(canalDeseado);		
	}
	
	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito) {
		short canalDeseado = convertirAShort(primerDigito, segundoDigito, tercerDigito);
		this.setCanal(canalDeseado);
	}
	
	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		short canalDeseado = convertirAShort(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
		this.setCanal(canalDeseado);
	}
	
	private void setCanal(short canalDeseado) {
		boolean canalValido = false;
		
		switch(this.entradaActual) {
		case Televisor.ENTRADA_TELEVISION_DE_AIRE:
			if(canalDeseado>=CANAL_MINIMO_TELEVISION && canalDeseado<=CANAL_MAXIMO_TELEVISION_ABIERTA){
				canalValido=true;
			}
			break;
		case Televisor.ENTRADA_TELEVISION_POR_CABLE:
			if(canalDeseado>=CANAL_MINIMO_TELEVISION && canalDeseado<CANAL_MAXIMO_TELEVISION_POR_CABLE) {
				if(!this.controlParenteralActivado) {
					canalValido = true;
				}
				else if(canalDeseado<canalParaMayoresInicial || canalDeseado>canalParaMayoresFinal) {
					canalValido = true;
				}
			}
			break;
		default:
			canalValido = false;
		}
		
		if(canalValido==true) {
			this.canalAnterior = this.canalActual;
			this.canalActual = canalDeseado;

		}
	}
	
	public void volverAlCanalAnterior() {
		short auxiliar = 0;
		auxiliar = canalAnterior;
		this.canalAnterior = this.canalActual;
		this.canalActual = auxiliar;
	}
	
	public void silenciar() {
		this.volumenActual = 0;
	}
	
	public boolean activarElControlParenterla(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		boolean seActivoElControlParenteral = false;
		short claveRecibida = convertirAShort(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
		
		if(this.claveControlParenteral == claveRecibida) {
			this.controlParenteralActivado = true;
			seActivoElControlParenteral = true;
		}
		return seActivoElControlParenteral;
	}
	
	public boolean deactivarElControlParenteral(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		boolean seDesactivoElControlParenteral = false;
		short claveRecibida = convertirAShort(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
		
		if(this.claveControlParenteral == claveRecibida) {
			this.controlParenteralActivado = false;
			seDesactivoElControlParenteral = true;
		}
		return seDesactivoElControlParenteral;
	}
	
	public static char getEntradaTelevisionDeAire() {
		return ENTRADA_TELEVISION_DE_AIRE;
	}


	public static char getEntradaTelevisionPorCable() {
		return ENTRADA_TELEVISION_POR_CABLE;
	}


	public static char getEntradaHdmi1() {
		return ENTRADA_HDMI1;
	}


	public static char getEntradaHdmi2() {
		return ENTRADA_HDMI2;
	}


	public static char getEntradaUsb() {
		return ENTRADA_USB;
	}


	public long getNumeroDeSerie() {
		return numeroDeSerie;
	}


	public boolean isControlParenteralActivado() {
		return controlParenteralActivado;
	}


	public boolean isEncendido() {
		return encendido;
	}


	public byte getVolumenActual() {
		return volumenActual;
	}


	public short getCanalActual() {
		return canalActual;
	}


	public char getEntradaActual() {
		return entradaActual;
	}

	private short convertirAShort(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		final short MILENA = 1000;
		final short CENTENA = 100;
		final short DECENA = 10;
		
		short claveRecibida = (short)(
										(short) (convertirAShort(primerDigito) * MILENA)  + 
										(short) (convertirAShort(segundoDigito) * CENTENA)  + 
										(short) (convertirAShort(tercerDigito) * DECENA) + 
										(short) (convertirAShort(cuartoDigito))
									);

		return claveRecibida;
	}
	
	private short convertirAShort(char primerDigito, char segundoDigito, char tercerDigito) {
		final short CENTENA = 100;
		final short DECENA = 10;
		
		short claveRecibida = (short)(
										(short) (convertirAShort(primerDigito) * CENTENA)  + 
										(short) (convertirAShort(segundoDigito) * DECENA) + 
										(short) (convertirAShort(tercerDigito))
									);
		
		return claveRecibida;
	}
	
	private short convertirAShort(char primerDigito, char segundoDigito) {
		final short DECENA = 10;
		
		short claveRecibida = (short)((convertirAShort(primerDigito) * DECENA) + (convertirAShort(segundoDigito)));
		return claveRecibida;
	}
	
	private short convertirAShort(char primerDigito) {
		final short DECENA = 10;
		final short ASCII_CERO = 48;
		
		short claveRecibida = (short)(((short) primerDigito)-ASCII_CERO);
		return claveRecibida;
	}
}
