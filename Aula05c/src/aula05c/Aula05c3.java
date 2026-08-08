/**
 * Nesse Programa vamos estudar a array em conjunto com a estrutura de repetição 
 * foreach
 */
package aula05c;
import java.util.Random;
public class Aula05c3 {
public static void main(String args []){
    
  String[] frutas = {"Banana", "pera", "Uva","maca"};
  
  for (String fruta : frutas) { // le-se fruta em frutas
      System.out.println("Eu gosto de " + fruta);
  }
  Random rd = new Random ();
  int numero = rd.nextInt(10) + 1;
  System.out.println("Numero sorteado: " + numero);
}
  
  
}  
    
     

