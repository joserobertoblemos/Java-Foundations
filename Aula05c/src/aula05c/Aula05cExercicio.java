/**
 * Crie um programa com uma array de 5 elementos. utilizando a bibilioteca random
 * sorteie 5 números entre 1 e 100 e coloque cada número em um elementos da array.
 * imprima no console, cada número da array
 * Desafio: não insira números repetidos.
 */
package aula05c;
import java.util.Random;
public class Aula05cExercicio {
    public static void main (String args[]){
        
        int[] numeros = new int[5];
        int temp = 0;
        
        Random random = new Random ();
        
        
        for (int i = 0; i < numeros.length;i++) {
            
            temp = random.nextInt(100) + 1;
            
            for (int n : numeros) {
                if (temp == n) {
                    
                }
            }
        numeros[1] = temp;
  System.out.println(numeros +"Numero sorteado: " + random + " ");
  numeros[i] = temp;
  
      
  }
          
        }
        
         
        
    }
    
    
    

