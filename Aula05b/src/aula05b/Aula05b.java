/*
 * Nesse Programa vamos estudar a estrutura de repetição for 
 */
package aula05b;

public class Aula05b {

    public static void main(String[] args) {
        for (int contador = 1; contador <=10; contador++) {
            System.out.println("Contador: " + contador);
        }
        System.out.println("=".repeat(40));
        for (int i = 10; i >= 0; i--){
            System.out.print(i + "...");
            
        }
        System.out.println("F O G O ! ! !" );
        
        System.out.println("=".repeat(40));
        
        for (int i = 0; i<= 50; i+=2) {
            System.out.print(1 + " ");
        }           
        System.out.println("=".repeat(40));
        int soma = 0;
        for (int i = 1; i<=100; i++){
            soma += i;
        }
        System.out.println("A soma dos números de 1 ate 100 é" + soma);
        
    }
    
    
}
