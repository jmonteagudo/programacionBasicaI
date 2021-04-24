package ar.edu.unlam.pb1.parciales;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;


public class TelevisorTest {
	
public static void main(String[] args) {
		
		System.out.println("Bienvenido ");
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();

		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			/*switch (opcion) {
			case 1: 
				registrarPasajero(vuelo);
				break;
			case 2: 
				elegirAsiento(vuelo);
				break;
			case 3:
				listarPasajeros(vuelo);
				break;
			default:
				System.out.println("Opci�n Invalida");
				break;
			}*/

		} while (opcion != 9);
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Cambiar de canal");
		System.out.println("2 - Subir el volumen n veces");
		System.out.println("3 - Bajar el volumen n veces");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}

	
	@Test
	public void testGetEntradas() {
		/*
		 * El televisor cuenta con 5 entradas (Televisi�n de aire, Televisi�n por cable, HDMI1, HDMI2 y USB). Por
			norma los c�digos de entrada para todos los televisores son los siguientes:
			� ENTRADA_TELEVISION_DE_AIRE = �A�
			� ENTRADA_TELEVISION_POR_CABLE = �C�
			� ENTRADA_HDMI1 = �1�
			� ENTRADA_HDMI2 = �2�
			� ENTRADA_USB = �U�
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		assertEquals('A', Televisor.getEntradaTelevisionDeAire());
		assertEquals('C', Televisor.getEntradaTelevisionPorCable());
		assertEquals('1', Televisor.getEntradaHdmi1());
		assertEquals('2', Televisor.getEntradaHdmi2());
		assertEquals('U', Televisor.getEntradaUsb());
		
	}
	
	@Test
	public void testGetNumerpDeSerie(){
		/*
		 * Cada plaqueta tiene asociado un n�mero de serie, que es un identificador �nico. Esta numeraci�n se
			definir� autom�ticamente en el momento de la creaci�n. Sabiendo que esta plaqueta se podr� utilizar
			para distintos modelos de televisores, incluso reconvertir televisores en desuso, se estima que a lo
			largo del tiempo se podr�n fabricar alrededor de tres mil millones de plaquetas (3.000.000.000)
		 */
		
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		Televisor lg = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		lg.encenderOApagar();
		
		assertNotEquals(sony.getNumeroDeSerie(), lg.getNumeroDeSerie());
	}
	
	@Test
	public void testNoCambiaCanal() {
		/*
		 * Las �nicas dos entradas que permiten la visualizaci�n y modificaci�n de canales son las de �Televisi�n
			de aire� y �Televisi�n por cable�
		 */
		
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		int canalActual = 0;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		canalActual = sony.getCanalActual();
		
		sony.seleccionarEntrada(Televisor.getEntradaHdmi1());
		sony.subirOBajarAnalogicamente('>');
		
		assertEquals(canalActual, sony.getCanalActual());
	}
	
	@Test
	public void testCanalesMaximos() {
		/*
		 *  Es importante se�alar que la cantidad m�xima de canales de la
			televisi�n abierta es de 127 mientras que para la televisi�n por cable es de 32767 canales. Sin
			embargo, al momento de la instanciaci�n de un televisor determinado, se realiza el proceso de
			sintonizaci�n. Esto consiste en determinar el m�ximo canal de aire y el m�ximo canal de cable.
		 */
		
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
				
		sony.seleccionarEntrada(Televisor.getEntradaTelevisionDeAire());
		// Modificar para que cuando llega al m�ximo empice del inicio.
		for(int i= 0; i<20; i++) {
			sony.subirOBajarAnalogicamente('>');
		}
		assertEquals(canalMaximoTvAbierta, sony.getCanalActual());
	}
	
	@Test
	public void testLimitesVolumen() {
		/*
		 * El volumen va desde 0 a 100.
		 */
		
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
				
		sony.seleccionarEntrada(Televisor.getEntradaTelevisionDeAire());
		
		for(int i= 0; i<200; i++) {
			sony.subirOBajarAnalogicamente('+');
		}
		assertEquals(100, sony.getVolumenActual());
		
		for(int i= 400; i>0; i--) {
			sony.subirOBajarAnalogicamente('-');
		}
		assertEquals(0, sony.getVolumenActual());
	}
	
	@Test
	public void testDefinirControlParenta() {
		/*
		 * Existen modelos que poseen un sistema de control parenteral, el cual establece un rango en el cual se
			establece un contenido exclusivo para mayores (canalParaMayoresInicial y canalParaMayoresFinal).
			Este rango s�lo est� definido para los canales de televisi�n por cable, no habiendo restricci�n alguna
			para los canales de aire. Cuando el control parenteral est� activo, no se podr� sintonizar ning�n canal
			que se encuentre dentro de este rango. La clave para activar o desactivar el control parenteral se
			establece al momento de la instalaci�n y s�lo se comparte con el propietario adulto del dispositivo.
			Esta clave est� compuesta de un valor num�rico de 4 d�gitos. De igual manera, los rangos de canales
			exclusivos para mayores se establecen al momento de la creaci�n del dispositivo, y exclusivamente
			para aquellos modelos que tienen habilitada la funcionalidad.
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200, claveControlParental = 1234, canalParaMayoresInicial =50, canalParaMayoresFinal=55;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable, claveControlParental, canalParaMayoresInicial, canalParaMayoresFinal);
		
		sony.encenderOApagar();
	}
	
	@Test
	public void testEncender() {
		/*
		 * a. encenderOApagar [Bot�n Power]: Invierte el estado del televisor. Si se encuentra apagado, lo
enciende, caso contrario lo apaga
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		assertFalse(sony.isEncendido());
		sony.encenderOApagar();
		assertTrue(sony.isEncendido());
		sony.encenderOApagar();
		assertFalse(sony.isEncendido());
	}
	
	@Test
	public void testToString() {
		/*
		 * b. toString [Bot�n Display]: Devuelvo la informaci�n con el estado actual del televisor
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		assertFalse(sony.toString().startsWith("sony"));
	}
	
	@Test
	public void testSeleccionarEntrada() {
		/*
		 * c. seleccionarEntrada [Bot�n Input]: Selecciona la entrada deseada
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		sony.seleccionarEntrada(Televisor.getEntradaHdmi1());
		
		assertEquals(Televisor.getEntradaHdmi1(), sony.getEntradaActual());
		sony.seleccionarEntrada(Televisor.getEntradaTelevisionPorCable());
		assertEquals(Televisor.getEntradaTelevisionPorCable(), sony.getEntradaActual());	
	}
	
	@Test
	public void testSubirOBajarAnalogicamente() {
		/*
		 * d. subirOBajarAnalogicamente [+ / - / < / >] Seg�n lo que recibe de par�metro sube o baja el
			volumen o de canal:
			i. �+� Sube el volumen
			ii. �-� Baja el volumen
			iii. �>� Sube de canal
			iv. �<� Baja de canal
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		byte volumenActual;
		short canalActual;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		volumenActual = sony.getVolumenActual();
		canalActual = sony.getCanalActual();
		
		sony.subirOBajarAnalogicamente('+');
		assertEquals((++volumenActual), sony.getVolumenActual());
		sony.subirOBajarAnalogicamente('-');
		assertEquals((--volumenActual), sony.getVolumenActual());
		
		sony.subirOBajarAnalogicamente('>');
		assertEquals((++canalActual), sony.getCanalActual());
		sony.subirOBajarAnalogicamente('<');
		assertEquals((--canalActual), sony.getCanalActual());
	}
	
	@Test
	public void testCambiarDeCanal() {
		/*
		 * e. cambiarDeCanal: Disponible en varios formatos (S�lo disponible para las entradas de televisi�n
			de aire o cable):
			i. [0 � 9] Cambio digital un digito (recibe el canal deseado)
			ii. [10+] Cambio digital dos d�gitos (recibe la decena y la unidad. A partir de ah� construye
			el canal deseado)
			iii. [100 +] Cambio digital tres d�gitos (recibe la centana, la decena y la unidad, a partir de
			ah� construye el canal deseado)
			iv. [1000 +] Cambio digital cuatro d�gitos (recibe los cuatro d�gitos que formar�n el canal)
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 2000;
		short canalDeseado = 4;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		sony.seleccionarEntrada(Televisor.getEntradaTelevisionPorCable());
				
		sony.cambiarDeCanal('4');
		assertEquals(canalDeseado, sony.getCanalActual());
		
		canalDeseado = (short)24;
		sony.cambiarDeCanal('2', '4');
		assertEquals(canalDeseado, sony.getCanalActual());
		
		canalDeseado = (short)122;
		sony.cambiarDeCanal('1', '2', '2');
		assertEquals(canalDeseado, sony.getCanalActual());
		
		canalDeseado = (short)1224;
		sony.cambiarDeCanal('1', '2', '2', '4');
		assertEquals(canalDeseado, sony.getCanalActual());
		
	}
	
	@Test
	public void testVolverAlCanalAnterior() {
		/*
		 * f. volverAlCanalAnterior [Prev.]: Retorna al �ltimo canal seleccionado.
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		short canalAnterior = 8;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		sony.seleccionarEntrada(Televisor.getEntradaTelevisionPorCable());

		sony.cambiarDeCanal('8');
		sony.cambiarDeCanal('4');
		sony.volverAlCanalAnterior();
		assertEquals(canalAnterior, sony.getCanalActual());		
	}
	
	@Test
	public void testSilenciar() {
		/*
		 * g. silenciar [Mute]: Actualiza el valor del volumen en cero
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		sony.subirOBajarAnalogicamente('+');
		sony.subirOBajarAnalogicamente('+');
		sony.subirOBajarAnalogicamente('+');
		
		if(sony.getVolumenActual() != 0) {
			sony.silenciar();
			assertEquals((byte)0, sony.getVolumenActual());
		}
		else {
			assertTrue(false);
		}
	}
	
	@Test
	public void testActivarControlParental() {
		/*
		 * activarControlParental
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200, claveControlParental = 1234, canalParaMayoresInicial =50, canalParaMayoresFinal=55;
		
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable, claveControlParental, canalParaMayoresInicial, canalParaMayoresFinal);
		
		sony.encenderOApagar();
		
		sony.activarElControlParenterla('1', '2', '3', '4');
		assertTrue(sony.isControlParenteralActivado());
		
		sony.seleccionarEntrada(Televisor.getEntradaTelevisionPorCable());
		
		sony.cambiarDeCanal('5');
		assertEquals((short)5, sony.getCanalActual());
		
		sony.cambiarDeCanal('5', '1');
		assertNotEquals((short)51, sony.getCanalActual());
	}
	
	@Test
	public void testGetCanalActual() {
		/*
		 * i. Los gets que consideres absolutamente necesario para poder completar el desarrollo.
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		assertEquals((short)0, sony.getCanalActual());		
	}
	
	@Test
	public void testGetVolumenActual() {
		/*
		 * i. Los gets que consideres absolutamente necesario para poder completar el desarrollo.
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
		
		assertEquals((byte)0, sony.getVolumenActual());
		
	}	
}
