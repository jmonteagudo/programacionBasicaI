package ar.edu.unlam.pb1.ejemplos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PruebaSistema {

	public static void main(String[] args) {
		
		Usuario nuevo;
		Sistema linux;
		boolean resultadoLogin = false;

		linux = new Sistema("Linux");
		nuevo= new Usuario("sofia", "pepe");
		linux.ingresarUsuario(nuevo);
		
		resultadoLogin = linux.loguearUsuario("juan", "pepe");
		
		if(resultadoLogin==false) {
			System.out.println("El metodo loguearUsuario esta bien");
		}
		else {
			System.out.println("El metodo loguearUsuario esta mal");
		}
		
		resultadoLogin = linux.loguearUsuario("sofia", "pepe");
		
		if(resultadoLogin==true) {
			System.out.println("El metodo loguearUsuario esta bien");
		}
		else {
			System.out.println("El metodo loguearUsuario esta mal");
		}
	}

}
