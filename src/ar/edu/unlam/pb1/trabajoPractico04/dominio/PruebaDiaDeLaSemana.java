package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class PruebaDiaDeLaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiasDeLaSemana dia = DiasDeLaSemana.LUNES;
		
		switch(dia) {
		case LUNES:
			System.out.println("Lunes");
			break;
		case MARTES:
			System.out.println("Martes");
			break;
		case MIERCOLES:
			System.out.println("Miercoles");
			break;
		case JUEVES:
			System.out.println("Jueves");
			break;			
			
		}
	}

}
