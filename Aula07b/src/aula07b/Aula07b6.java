/**
 * Nesse programa vamos estudar a visibilidade de uma variável  
 */
package aula07b;

public class Aula07b6 {
    
    public static int valor;
    
    public static void main (String args[]){
         valor = 10;
        calculartabuada();
    }
    
    public static void calculartabuada() {
        for ( int i = 1; i <= 10; i++){
            int total = i * valor;
            System.out.println(valor + " X " + i + " = " + total);
        } 
    }
}
