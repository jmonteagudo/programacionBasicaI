	import java.util.Scanner;
	
	
public class Prueba {
	


	         public static void main(String[] args) {
	        	 
	        	 int matriz[][] = new int[4][4];
	        	 
	         System.out.println("Ingrese valores: ");
	         Scanner teclado=new Scanner(System.in);
	         int i;
	         int[] enteros;
	         int numero=0;
	         int maximo=0, minimo=0;
	         int posMaximo=0;
	         int posMinimo=0;
	         int buscar=3;
	         int posBuscar=0;
	         boolean encontrado=false;
	         enteros= new int [5];
	         for ( i = 0; i < enteros.length; i++) {
	         numero = teclado.nextInt();
	         enteros[i]=numero;
	         }
	         
	         maximo=enteros[0];
	         for ( i = 0; i < enteros.length; i++) {
	         
	             if (maximo < enteros [i]) {
	                 maximo =  enteros [i];
	                 posMaximo=i;
	                                 }
	          }
	         System.out.println("Valor maximo: " + maximo + "Posicion: " + posMaximo);
	         
	         minimo=enteros[0];
	         for ( i = 0; i < enteros.length; i++) {
	             
	             if (minimo > enteros [i]) {
	                 minimo =  enteros [i];
	                 posMinimo=i;
	                                 }
	          }
	         System.out.println("Valor minimo: " + minimo + "Posicion: " + posMinimo);

	         System.out.println("Ingrese el valor a buscar");


	         buscar=teclado.nextInt();
	         for ( i = 0; i < enteros.length; i++) {
		         if (buscar == enteros [i]) {
		         encontrado=true;   
		         posBuscar = i;
		         }
		         }
		         
		         if(encontrado==true){
		         System.out.println("El valor esta en la posicion: " + posBuscar );
		         }
		         else{
		         System.out.println("El valor no fue encontrado");     
		         }
	         
	}
	
}
