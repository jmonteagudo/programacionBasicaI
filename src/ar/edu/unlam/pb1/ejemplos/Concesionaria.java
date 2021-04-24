package ar.edu.unlam.pb1.ejemplos;

public class Concesionaria {
	
	private Coche[] flota;
	
	public Concesionaria (int cantidadCochesEnLaFlota) {
		flota = new Coche[cantidadCochesEnLaFlota];
	}
	
	public void ingresarCoche(Coche nuevoCoche) {
		flota[Coche.getCantidadCoches()] = nuevoCoche;
	}
	
	public int calcularCantidadDeUsados() {
		int cantidadDeUsados = 0;
		
		for(int i=0; i<Coche.getCantidadCoches(); i++) {
			if(flota[i].getKilometros()!=0) {
				cantidadDeUsados++;
			}
		}
		
		return cantidadDeUsados;
	}
	
	public int calcularCantidadDe0Km() {
		int cantidadDe0Km = 0;
		
		for(int i=0; i<Coche.getCantidadCoches(); i++) {
			if(flota[i].getKilometros()==0) {
				cantidadDe0Km++;
			}
		}
		return cantidadDe0Km;
	}
	
	public double calcularPrecioPromedio() {
		double sumatoriaDePrecio=0.0;
		
		for(int i=0; i<Coche.getCantidadCoches(); i++) {
			sumatoriaDePrecio+=flota[i].getPrecio();
		}
		
		return (sumatoriaDePrecio/Coche.getCantidadCoches());
	}
}
