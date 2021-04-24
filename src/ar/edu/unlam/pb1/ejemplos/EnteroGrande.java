package ar.edu.unlam.pb1.ejemplos;

public class EnteroGrande {
	
	// Sabiendo que el valor hexadecimal 0x7fffffff (2147483647) representa el entero mas grande que puede almacenar java,
	// Asignar a una variable dicho valor, y luego multiplicar ese valor * 4, guardando el resultado en otra variable. 
	// a. ¿Que sucederá?
	// b. ¿Cómo lo corregiría?
	
    public static void main(String[] args){
        int gran = 0x7fffffff;//maximo valor int
        prt("gran  = " + gran);
        gran=gran+1;
        prt("gran  = " + gran);
        
        long mas_grande = ((long)gran)*4;
        prt("mas_grande = "+ mas_grande);
    }
    
    static void prt(String s){
        System.out.println(s);
    }

}
