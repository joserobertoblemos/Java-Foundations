/**
 * Nesse programa vamos estudar a estrutura de repetição for com comandos break
 * e continue
 */
package aula05b;

public class Aula05b5 {
    
    public static void main(String args []) {
        
        for (int i = 1; i <=9999; i++){
            
            System.out.println("Contador: " + 1);
            if (i >= 15) {
                break;
            }
        }
        System.out.println("Fim do 1 loop.");
        System.out.println("=".repeat(40));
        
        for (int i = 0; i <= 20; i++){
            
            if (i % 2 !=0){
                continue;
            }
            System.out.println("Numero Par: " + i);
        }
        
    }
}
