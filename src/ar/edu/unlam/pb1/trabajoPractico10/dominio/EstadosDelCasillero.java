package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public enum EstadosDelCasillero {
	LIBRE ("Libre"),
	OCUPADO ("Ocupado"),
	AGUA ("Agua"),
	IMPACTADO ("Impactado");
	
	private final String descripcion;
	
	private EstadosDelCasillero(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String toString(){
		return descripcion;
	}
}
