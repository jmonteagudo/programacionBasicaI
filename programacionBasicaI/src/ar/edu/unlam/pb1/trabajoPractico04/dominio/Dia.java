package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class Dia {
	private byte numeroDeDia=0;
	
	public Dia(byte numeroDeDia) {
		setNumeroDeDia(numeroDeDia);
	}

	public byte getNumeroDeDia() {
		return numeroDeDia;
	}

	public void setNumeroDeDia(byte numeroDeDia) {
		if(numeroDeDia >= 1 && numeroDeDia <= 7) {
			this.numeroDeDia = numeroDeDia;	
		}
	}
	
	public byte numeroDeDia(String nombreDelDia) {
		byte numeroDeDia = 0;
		
		switch(nombreDelDia) {
		case "Domingo":
			numeroDeDia = 1;
			break;
		case "Lunes":
			numeroDeDia = 1;
			break;
		case "Martes":
			numeroDeDia = 1;
			break;
		case "Miercoles":
			numeroDeDia = 1;
			break;
		case "Jueves":
			numeroDeDia = 1;
			break;
		case "Viernes":
			numeroDeDia = 1;
			break;
		case "Sabado":
			numeroDeDia = 1;
			break;
		default:
			numeroDeDia = 1;
			break;
		}
		return numeroDeDia;
	}
	
	public String nombreDelDia() {
		String nombre = "";
		
		switch(numeroDeDia) {
		case 1:
			nombre = "Domingo";
			break;
		case 2:
			nombre = "Lunes";
			break;			
		case 3:
			nombre = "Martes";
			break;
		case 4:
			nombre = "Miercoles";
			break;
		case 5:
			nombre = "Jueves";
			break;
		case 6:
			nombre = "Viernes";
			break;
		case 7:
			nombre = "Sabado";
			break;
		default:
			nombre = "No indicado";
		}
		
		return nombre;	
	}
}
