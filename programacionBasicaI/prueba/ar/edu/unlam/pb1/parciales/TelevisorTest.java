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
				System.out.println("Opción Invalida");
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
		 * El televisor cuenta con 5 entradas (Televisión de aire, Televisión por cable, HDMI1, HDMI2 y USB). Por
			norma los códigos de entrada para todos los televisores son los siguientes:
			• ENTRADA_TELEVISION_DE_AIRE = ‘A’
			• ENTRADA_TELEVISION_POR_CABLE = ‘C’
			• ENTRADA_HDMI1 = ‘1’
			• ENTRADA_HDMI2 = ‘2’
			• ENTRADA_USB = ‘U’
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
		 * Cada plaqueta tiene asociado un número de serie, que es un identificador único. Esta numeración se
			definirá automáticamente en el momento de la creación. Sabiendo que esta plaqueta se podrá utilizar
			para distintos modelos de televisores, incluso reconvertir televisores en desuso, se estima que a lo
			largo del tiempo se podrán fabricar alrededor de tres mil millones de plaquetas (3.000.000.000)
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
		 * Las únicas dos entradas que permiten la visualización y modificación de canales son las de “Televisión
			de aire” y “Televisión por cable”
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
		 *  Es importante señalar que la cantidad máxima de canales de la
			televisión abierta es de 127 mientras que para la televisión por cable es de 32767 canales. Sin
			embargo, al momento de la instanciación de un televisor determinado, se realiza el proceso de
			sintonización. Esto consiste en determinar el máximo canal de aire y el máximo canal de cable.
		 */
		
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		
		sony.encenderOApagar();
				
		sony.seleccionarEntrada(Televisor.getEntradaTelevisionDeAire());
		// Modificar para que cuando llega al máximo empice del inicio.
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
			Este rango sólo está definido para los canales de televisión por cable, no habiendo restricción alguna
			para los canales de aire. Cuando el control parenteral esté activo, no se podrá sintonizar ningún canal
			que se encuentre dentro de este rango. La clave para activar o desactivar el control parenteral se
			establece al momento de la instalación y sólo se comparte con el propietario adulto del dispositivo.
			Esta clave está compuesta de un valor numérico de 4 dígitos. De igual manera, los rangos de canales
			exclusivos para mayores se establecen al momento de la creación del dispositivo, y exclusivamente
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
		 * a. encenderOApagar [Botón Power]: Invierte el estado del televisor. Si se encuentra apagado, lo
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
		 * b. toString [Botón Display]: Devuelvo la información con el estado actual del televisor
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
		 * c. seleccionarEntrada [Botón Input]: Selecciona la entrada deseada
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
		 * d. subirOBajarAnalogicamente [+ / - / < / >] Según lo que recibe de parámetro sube o baja el
			volumen o de canal:
			i. ‘+’ Sube el volumen
			ii. ‘-‘ Baja el volumen
			iii. ‘>’ Sube de canal
			iv. ‘<’ Baja de canal
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
		 * e. cambiarDeCanal: Disponible en varios formatos (Sólo disponible para las entradas de televisión
			de aire o cable):
			i. [0 – 9] Cambio digital un digito (recibe el canal deseado)
			ii. [10+] Cambio digital dos dígitos (recibe la decena y la unidad. A partir de ahí construye
			el canal deseado)
			iii. [100 +] Cambio digital tres dígitos (recibe la centana, la decena y la unidad, a partir de
			ahí construye el canal deseado)
			iv. [1000 +] Cambio digital cuatro dígitos (recibe los cuatro dígitos que formarán el canal)
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
		 * f. volverAlCanalAnterior [Prev.]: Retorna al último canal seleccionado.
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
