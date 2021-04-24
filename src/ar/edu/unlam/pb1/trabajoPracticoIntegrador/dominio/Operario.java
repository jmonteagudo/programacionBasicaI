package ar.edu.unlam.pb1.trabajoPracticoIntegrador.dominio;

import ar.edu.unlam.pbi.utils.Fecha;
import ar.edu.unlam.pbi.utils.Hora;

public class Operario {
	private int legajo;
	private String nombre;
	private String apellido;
	private String fechaIngreso;
	private int cantidadDiasTabajados;
	private String fecha[];
	private String horaIngreso[];
	private String horaSalida[];
	
	private static int cantidadOperarios = 0;
	
	private final String FECHA_INGRESO_DEFAULT = "01/01/2018";
	
	public Operario(int legajo, String nombre, String apellido, int cantidadDiasLaborables) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = FECHA_INGRESO_DEFAULT;
		this.cantidadDiasTabajados = cantidadDiasLaborables;
		this.fecha = new String[cantidadDiasTabajados];
		this.horaIngreso = new String[cantidadDiasTabajados];
		this.horaSalida = new String[cantidadDiasTabajados];
		Operario.cantidadOperarios++;
	}
	
	public Operario (int legajo, String nombre, String apellido, int cantidadDiasLaborables, String fechaIngreso) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
		this.cantidadDiasTabajados = cantidadDiasLaborables;
		this.fecha = new String[cantidadDiasTabajados];
		this.horaIngreso = new String[cantidadDiasTabajados];
		this.horaSalida = new String[cantidadDiasTabajados];
		Operario.cantidadOperarios++;
	}
	
	public int calcularAntiguedad(String fechaActual) {
		int antiguedad=0;

		if(Fecha.getAño(fechaActual)==Fecha.getAño(fechaIngreso)) {
			antiguedad = 0;
		}
		else {
			if(Fecha.getMes(fechaActual)<Fecha.getMes(fechaIngreso)) {
				antiguedad = (Fecha.getAño(fechaActual)-Fecha.getAño(fechaActual))-1;
			}
			else if(Fecha.getMes(fechaActual)==Fecha.getMes(fechaActual)) {
				if(Fecha.getDia(fechaActual)<Fecha.getDia(fechaIngreso)) {
					antiguedad=(Fecha.getAño(fechaActual)-Fecha.getAño(fechaIngreso))-1;
				}
				else {
					antiguedad = (Fecha.getAño(fechaActual)-Fecha.getAño(fechaIngreso));
				}
			}
			else {
				antiguedad = (Fecha.getAño(fechaActual)-Fecha.getAño(fechaIngreso));
			}
		}	
		return antiguedad;
	}
	
	public int calcularHorasTrabajadas() {
		int horasTrabajadas = 0;
		for(int i=0; i<cantidadDiasTabajados; i++) {
			if(Hora.getMinutos(horaSalida[i])>=Hora.getMinutos(horaIngreso[i])) {
				horasTrabajadas += Hora.getHora(horaSalida[i])-Hora.getHora(horaIngreso[i]);				
			}
			else {
				horasTrabajadas += (Hora.getHora(horaSalida[i])-Hora.getHora(horaIngreso[i])-1);
			}
		}
		
		return horasTrabajadas;
	}
	
	public static int getCantidadOperarios() {
		return Operario.cantidadOperarios;
	}
	
	public void setFechaLaboral(int posicionFecha, String fecha) {
		this.fecha[posicionFecha] = fecha;
	}
	
	public void setHoraIngreso(int posicionFecha, String hora) {
		this.horaIngreso[posicionFecha] = hora;
	}
	
	public void setHoraSalida(int posicionFecha, String hora) {
		this.horaSalida[posicionFecha] = hora;
	}
	
	public String toString() {
		return "(" + this.legajo + ")" +  this.nombre + " " + this.apellido;
	}
}
