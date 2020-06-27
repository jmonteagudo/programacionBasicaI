package ar.edu.unlam.pbi.utils;

public class Hora {
	public static final int POSICION_HORA = 0;
	public static final int POSICION_MINUTO = 1;
	public static final String SEPARADOR_HORA = ":";
	
	public static int[] convertirHora(String hora) {
		String[] horaComoString = new String[2];
		int[] horaComoInt = new int[3];
		horaComoString = hora.split(SEPARADOR_HORA);
		horaComoInt[POSICION_HORA] = Integer.parseInt(horaComoString[POSICION_HORA]);
		horaComoInt[POSICION_MINUTO] = Integer.parseInt(horaComoString[POSICION_MINUTO]);
		
		return horaComoInt;
	}
	
	public static boolean esHoraValida(String hora) {
		return hora.matches("\\d{1,2}:\\d{1,2}");
	}
	
	public static int getHora(String hora) {
		String[] horaComoString = hora.split(":");
		return Integer.parseInt(horaComoString[POSICION_HORA]);
	}
	
	public static int getMinutos(String hora) {
		String[] horaComoString = hora.split(":");
		return Integer.parseInt(horaComoString[POSICION_MINUTO]);
	}
}
