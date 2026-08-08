/**
 * Nesse Programa vamos estudar a estrutura de repetição while e desvio 'continue'
 */
package aula04b;

public class Aula04b3 {
    
 public static void main (String args[]) {
     int contador = 0;
     
     while (contador <= 20) {
         contador++; // 0 + 1 = 1 que é o ++
         if (contador % 2 != 0) {
             continue;
         }
         System.out.println("Numero par: " + contador);
     }
     
 }  
}
