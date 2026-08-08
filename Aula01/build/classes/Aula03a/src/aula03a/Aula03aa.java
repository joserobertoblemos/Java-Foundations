/**
 * Nesse programa vamos estudar os operadores de incremento e decremento
 */
package aula03a;

public class Aula03aa {
    
    public static void main (String args[]){
        
        int numero = 5;
        
        System.out.println("Valor de Numero: " + numero);
        
        numero++; // equivalente a numero = numero + 1
        
        System.out.print("Novo valor de Numero (++): " + numero);
        
        numero--; // equivalente a numero = numero - 1 
        
        System.out.println("Novo valor de Numero (-1): " + numero);
        
        int numero2 = numero++;
        
        System.out.println("Variavel Numero: " + numero);
        System.out.println("Variavel Numero2: " + numero2);
        
        numero2 = ++numero;
        
        System.out.println("Variavel Numero: " + numero);
        System.out.println("Variavel Numero2: " + numero2);
    }
    
}
