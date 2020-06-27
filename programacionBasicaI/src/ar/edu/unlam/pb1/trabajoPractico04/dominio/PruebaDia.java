package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class PruebaDia {

	public static void main(String[] args) {
		Dia hoy = new Dia((byte)15);
		
		if(hoy.getNumeroDeDia()!=15) {
			System.out.println("Algo funciono mal. Aparentemente el objeto no acepta el 15");
		}
		else {
			System.out.println("Hoy es: " + hoy.nombreDelDia());	
		}
	}

}
