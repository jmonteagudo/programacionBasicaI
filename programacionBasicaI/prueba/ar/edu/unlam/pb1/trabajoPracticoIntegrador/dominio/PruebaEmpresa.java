package ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio.Empresa;
import ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio.Operario;

public class PruebaEmpresa {

	private static Empresa empresa;
	private static Scanner teclado = new Scanner(System.in);
	private static final int CANTIDAD_OPERARIOS = 2;
	private static final int CANTIDAD_DIAS_LABORABLES = 3;
	
	private static final int INGRESAR_OPERARIOS = 1;
	private static final int BUSCAR_EMPLEADO_CON_MAYOR_ANTIGUEDAD = 2;
	private static final int CALCULAR_HORAS_DE_TRABAJO_PROMEDIO = 3;
	private static final int SALIR = 99;
	
	public static void main(String[] args) {
		
		empresa = new Empresa(CANTIDAD_OPERARIOS, CANTIDAD_DIAS_LABORABLES);
		
		/* Los siguientes métodos permiten probar la clase empresa. 
		 Comentar y descomentar los que requiera para hacer una prueba automática o una prueba manual
		 */
		// Prueba automática
		cargarEmpresaDePrueba();
		buscarOperarioConMayorAntiguedad();
		calcularHorasDeTrabajoPromedio();
		// Prueba manual
		//manejadorInterfaz();
	}
	
	private static void manejadorInterfaz() {
		int opcionIngresada=0;
		
		do {
			mostrarMenuOpciones();
			opcionIngresada = teclado.nextInt();
			ejecutarMenu(opcionIngresada);
		}while(opcionIngresada!=SALIR);
	}
	
	private static void mostrarMenuOpciones() {
		System.out.println("Menu de opciones");
		System.out.println("1. Ingresar operarios");
		System.out.println("2. Buscar operario con mayor antiguedad");
		System.out.println("3. Calcular horas de trabajo promedio");
		System.out.println("99. Salir");
	}

	private static void ejecutarMenu(int opcionSeleccionada) {
		switch(opcionSeleccionada){
		case INGRESAR_OPERARIOS:
			ingresarOperarios();
			break;
		case BUSCAR_EMPLEADO_CON_MAYOR_ANTIGUEDAD:
			buscarOperarioConMayorAntiguedad();
			break;
		case CALCULAR_HORAS_DE_TRABAJO_PROMEDIO:
			calcularHorasDeTrabajoPromedio();
			break;
		default:
			break;
		}
	}
	
	private static void ingresarOperarios() {
		Operario nuevoOperario;
		
		int legajo;
		String valorIngresado, nombre, apellido, fechaIngreso;
		
		for(int i = 0; i<CANTIDAD_OPERARIOS; i++) {
			do {
				System.out.println("Ingrese legajo");
				valorIngresado = teclado.next();
			}while(valorIngresado=="");
			
			legajo = Integer.parseInt(valorIngresado);
			
			do {
				System.out.println("Ingrese nombre");
				valorIngresado = teclado.next();
			}while(valorIngresado=="");
			
			nombre = valorIngresado;
			
			do {
				System.out.println("Ingrese apellido");
				valorIngresado = teclado.next();
			}while(valorIngresado=="");
			
			apellido = valorIngresado;
			
			System.out.println("Ingrese fecha ingreso");
			valorIngresado = teclado.next();
			
			fechaIngreso = valorIngresado;
			
			if(fechaIngreso == "") {
				nuevoOperario = new Operario(legajo, nombre, apellido, CANTIDAD_DIAS_LABORABLES);
			}
			else {
				nuevoOperario = new Operario(legajo, nombre, apellido, CANTIDAD_DIAS_LABORABLES, fechaIngreso);
			}
			
			String fecha = "";
			String horaIngresada = "";

			for(int j=0; j<CANTIDAD_DIAS_LABORABLES; j++) {
				System.out.println("Ingrese el día (dd/mm/aaaa): ");
				fecha = teclado.next();
				for(int k=0; k<Operario.getCantidadOperarios(); k++) {
					nuevoOperario.setFechaLaboral(j, fecha);
					System.out.println("Ingrese hora ingreso de " + nuevoOperario.toString() + ":");
					horaIngresada = teclado.next();
					nuevoOperario.setHoraIngreso(j, horaIngresada);
					System.out.println("Ingrese hora salida de " + nuevoOperario.toString() + ":");
					horaIngresada = teclado.next();
					nuevoOperario.setHoraSalida(j, horaIngresada);
				}
			}
			
			empresa.nuevoOperario(nuevoOperario);
		}
	}

	private static void buscarOperarioConMayorAntiguedad() {
		String fechaActual = "";
		Operario operarioConMayorAntiguedad;
		
		do {
			System.out.println("Ingrese fecha actual:");
			fechaActual = teclado.next();
		}while(fechaActual=="");
		
		operarioConMayorAntiguedad = empresa.buscarOperarioConMayorAntiguedad(fechaActual);
		
		System.out.println("El operario con mas antiguedad es: " + operarioConMayorAntiguedad.toString() + " con " + operarioConMayorAntiguedad.calcularAntiguedad(fechaActual) + " años.");
	}
	
	private static void calcularHorasDeTrabajoPromedio() {
		
		int horasDeTrabajoPromedio = empresa.calcularHorasDeTrabajoPromedio();

		System.out.println("El promedio de horas trabajadas es: " + horasDeTrabajoPromedio);
	}
	
	private static void cargarEmpresaDePrueba() {
		Operario operarioPuntual = new Operario(1, "Juan", "Puntualidad", CANTIDAD_DIAS_LABORABLES, "26/06/2017");
	
		operarioPuntual.setFechaLaboral(0, "25/06/2018");
		operarioPuntual.setFechaLaboral(1, "26/06/2018");
		operarioPuntual.setFechaLaboral(2, "27/06/2018");
		operarioPuntual.setHoraIngreso(0, "09:00");
		operarioPuntual.setHoraIngreso(1, "09:10");
		operarioPuntual.setHoraIngreso(2, "08:59");
		operarioPuntual.setHoraSalida(0, "18:00");
		operarioPuntual.setHoraSalida(1, "18:00");
		operarioPuntual.setHoraSalida(2, "18:00");
		
		empresa.nuevoOperario(operarioPuntual);
		
		Operario operarioImpuntual = new Operario(2, "Camila", "Impuntualidad", CANTIDAD_DIAS_LABORABLES, "29/06/2018");
		
		operarioImpuntual.setFechaLaboral(0, "25/06/2018");
		operarioImpuntual.setFechaLaboral(1, "26/06/2018");
		operarioImpuntual.setFechaLaboral(2, "27/06/2018");
		operarioImpuntual.setHoraIngreso(0, "09:50");
		operarioImpuntual.setHoraIngreso(1, "10:05");
		operarioImpuntual.setHoraIngreso(2, "09:30");
		operarioImpuntual.setHoraSalida(0, "18:00");
		operarioImpuntual.setHoraSalida(1, "17:59");
		operarioImpuntual.setHoraSalida(2, "18:01");
		
		empresa.nuevoOperario(operarioImpuntual);
	}
}
