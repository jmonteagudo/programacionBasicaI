package ar.edu.unlam.pb1.trabajopractico01.dominio;

import ar.edu.unlam.pb1.trabajoPractico03.domain.Persona;

public class Ascensor {

	
	public boolean puertaAbierta = false;
	public boolean sobrecarga = false;
	public static int pisoActual = 0;
	public final int PISO_MAXIMO = 10;
	public final int PISO_MINIMO = 0;
	public double pesoActual = 0.0;
	public final double PESO_MAXIMO;
	public int capacidadActual = 0;
	public final int CAPACIDAD_MAXIMA;
	private Persona ocupantes[];
	
	public Ascensor(int capacidadMaxima, double pesoMaximo){
		CAPACIDAD_MAXIMA = capacidadMaxima;
		PESO_MAXIMO = pesoMaximo;
		ocupantes = new Persona[100];
	}
	
	public void ingresar(Persona elQueSube){
		if(puertaAbierta){
			capacidadActual++;
			pesoActual+=elQueSube.pesar();
			ocupantes[capacidadActual] = elQueSube;
			if(capacidadActual>CAPACIDAD_MAXIMA || pesoActual > PESO_MAXIMO){
				System.out.println("Alerta. Sobrecarga");
				sobrecarga = true;
			}
			else{
				sobrecarga = false;
			}
		}
		else{
			System.out.println("La puerta esta cerrada");
		}
	}
	
	public void salir(Persona elQueBaja){
		// Buscar la persona que quiere bajar. Mientras tanto se baja al último que subió
		if(puertaAbierta){
			ocupantes[capacidadActual] = null;
			capacidadActual--;
			pesoActual-=elQueBaja.pesar();	
			if(capacidadActual>CAPACIDAD_MAXIMA || pesoActual > PESO_MAXIMO){
				System.out.println("Alerta. Sobrecarga");
				sobrecarga = true;
			}
			else{
				sobrecarga = false;
			}
		}
		else{
			System.out.println("La puerta esta cerrada");
		}
	}
	
	public void abrirPuerta(){
		puertaAbierta = true;
	}

	public void cerrarPuerta(){
		if(sobrecarga == false){
			puertaAbierta = false;
		}
		else{
			System.out.println("Para cerrar la puerta debe descender algun ocupante");
		}
	}

	public void subir(){
		if(puertaAbierta==false){
			pisoActual++;
		}
		else{
			System.out.println("La puerta esta abierta");
		}
	}

	public void bajar(){
		if(puertaAbierta==false){
			pisoActual--;
		}
		else{
			System.out.println("La puerta esta abierta");
		}
	}
	
	public int getPisoActual(){
		return pisoActual;
	}
	
	public void irAlPiso(int pisoDeseado){
	
		if(puertaAbierta==false){
			if (pisoDeseado < PISO_MINIMO || pisoDeseado > PISO_MAXIMO){
			} 
			else{
				while(pisoActual != pisoDeseado){
					if (pisoActual < pisoDeseado){
						// Invocamos al método subir de la clase Ascensor
						subir();
					}
					else{
						// Invocamos al método bajar de la clase Ascensor
						bajar();
					}
				}
			}
		}
		else{
			System.out.println("La puerta esta cerrada");
		}
	}
	
}
