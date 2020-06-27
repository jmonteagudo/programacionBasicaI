package ar.edu.unlam.pb1.trabajoPractico10.dominio;

public class Casillero {

	private EstadosDelCasillero estado;
	private Nave nave;
	
	public Casillero() {
		estado = EstadosDelCasillero.LIBRE;
	}
	
	public EstadosDelCasillero getEstado() {
		return estado;
	}
	public void setEstado(EstadosDelCasillero estado) {
		this.estado = estado;
	}
	public Nave getNave() {
		return nave;
	}
	public void setNave(Nave nave) {
		this.nave = nave;
	}
	
	

}
