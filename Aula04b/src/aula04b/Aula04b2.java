/**
 * Nesse Programa vamos estudar a estrutura de repetição while
 * e o uso do break para interromper o loop
*/
package aula04b;

public class Aula04b2 {
    public static void main(String args[]) {
        
        int contador = 10;
        
        while (contador <= 10) {
            System.out.println("Contador: " + contador);
            contador--;
            if (contador < 0) {
                break;
            }
        }
    }
}
