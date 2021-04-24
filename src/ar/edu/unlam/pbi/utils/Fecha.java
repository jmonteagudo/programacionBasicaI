package ar.edu.unlam.pbi.utils;

public class Fecha {
	
	public static final int POSICION_DIA = 0;
	public static final int POSICION_MES = 1;
	public static final int POSICION_A�O = 2;
	public static final String SEPARADOR_FECHA = "/";

	public static int[] convertirFecha(String fecha) {
		String[] fechaComoString = new String[3];
		int[] fechaComoInt = new int[3];
		fechaComoString = fecha.split(SEPARADOR_FECHA);
		fechaComoInt[POSICION_DIA] = Integer.parseInt(fechaComoString[POSICION_DIA]);
		fechaComoInt[POSICION_MES] = Integer.parseInt(fechaComoString[POSICION_MES]);
		fechaComoInt[POSICION_A�O] = Integer.parseInt(fechaComoString[POSICION_A�O]);
		
		return fechaComoInt;
	}
	
	public static int getA�o(String fecha) {
		String[] fechaComoString = fecha.split(SEPARADOR_FECHA);
		return Integer.parseInt(fechaComoString[POSICION_A�O]);
	}
	
	public static int getMes(String fecha) {
		String[] fechaComoString = fecha.split(SEPARADOR_FECHA);
		return Integer.parseInt(fechaComoString[POSICION_MES]);
	}
	
	public static int getDia(String fecha) {
		String[] fechaComoString = fecha.split(SEPARADOR_FECHA);
		return Integer.parseInt(fechaComoString[POSICION_DIA]);
	}
	
	public static boolean esFechaValida(String fecha) {
		return fecha.matches("\\d{1,2}/\\d{1,2}/\\d{2,4}");
	}
}
