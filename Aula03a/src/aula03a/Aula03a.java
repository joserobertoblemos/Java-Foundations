/**
 * Nesse programa vamos estudar o uso operadores aritméticas
 */
package aula03a;

public class Aula03a {

    public static void main(String[] args) {
     
        int numero = 10;
        
        System.out.println("Valor da variavel Numero: " + numero );
        
        numero = numero + 5 ;
        
        System.out.println("Novo valor da variavel Numero (+5): " + numero);
        
        numero += 20; // equivalente a numero = numero + 20
        
        System.out.println("Novo valor de Numero (+20) : " + numero);
        
        
        // Subtração
        numero -= 7; // equivalente a numero = numero - 7
        
        System.out.println("Novo vaor de Numero (-7) : " + numero);
        
        // multiplicação 
        
        numero *= 3;    // equivalente a numero = numero * 3
        
        System.out.println("Novo valor de Numero (*3) : " + numero);
        
        // Divisão
        
        numero /= 2;  // equivalente a numero = numero / 2
        
        System.out.println("Novo valor de numero (/2) : " + numero);
        
        numero %= 5; //equivalente a numero = numero % 5
        
        
        System.out.println("Novo valor de Numero (%5) : " + numero);
        
        
        
        
    }   
    
    
}
