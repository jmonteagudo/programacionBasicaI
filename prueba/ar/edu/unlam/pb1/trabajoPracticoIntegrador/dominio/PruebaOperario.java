package ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio;

import ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio.Operario;

public class PruebaOperario {
	
	private static final int CANTIDAD_DIAS_LABORALES = 3;
	private static final String FECHA_ACTUAL = "28/06/2018";

	public static void main(String[] args) {
		
		Operario operarioDePrueba;
		
		operarioDePrueba = PruebaOperario.cargarOperarioPuntual();
			
		System.out.println("Antiguedad de " + operarioDePrueba.toString() + " " + operarioDePrueba.calcularAntiguedad(FECHA_ACTUAL));
		System.out.println("Cantidad horas trabajadas de " + operarioDePrueba.toString() + " " + operarioDePrueba.calcularHorasTrabajadas());

		operarioDePrueba = PruebaOperario.cargarOperarioImpuntual();
		System.out.println("Antiguedad de " + operarioDePrueba.toString() + " " + operarioDePrueba.calcularAntiguedad(FECHA_ACTUAL));
		System.out.println("Cantidad horas trabajadas de " + operarioDePrueba.toString() + " " + operarioDePrueba.calcularHorasTrabajadas());

	}
	
	public static Operario cargarOperarioPuntual() {
		Operario operarioPuntual = new Operario(1, "Juan", "Perez", CANTIDAD_DIAS_LABORALES, "26/06/2017");

		operarioPuntual.setFechaLaboral(0, "25/06/2018");
		operarioPuntual.setFechaLaboral(1, "26/06/2018");
		operarioPuntual.setFechaLaboral(2, "27/06/2018");
		operarioPuntual.setHoraIngreso(0, "09:00");
		operarioPuntual.setHoraIngreso(1, "09:10");
		operarioPuntual.setHoraIngreso(2, "08:59");
		operarioPuntual.setHoraSalida(0, "18:00");
		operarioPuntual.setHoraSalida(1, "18:00");
		operarioPuntual.setHoraSalida(2, "18:00");
		
		return operarioPuntual;
	}

	public static Operario cargarOperarioImpuntual() {
		
		Operario operarioImpuntual = new Operario(2, "Camila", "Lopez", CANTIDAD_DIAS_LABORALES, "29/06/2018");
		
		
		operarioImpuntual.setFechaLaboral(0, "25/06/2018");
		operarioImpuntual.setFechaLaboral(1, "26/06/2018");
		operarioImpuntual.setFechaLaboral(2, "27/06/2018");
		operarioImpuntual.setHoraIngreso(0, "09:50");
		operarioImpuntual.setHoraIngreso(1, "10:05");
		operarioImpuntual.setHoraIngreso(2, "09:30");
		operarioImpuntual.setHoraSalida(0, "18:00");
		operarioImpuntual.setHoraSalida(1, "17:59");
		operarioImpuntual.setHoraSalida(2, "18:01");
		
		return operarioImpuntual;
	}
}
