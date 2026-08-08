/**
 * nesse programa vamos estudar o uso da depuração de codigos do NetBeans
 */
package aula06b;
public class Aula06b4 {
   public static void main (String args[]){
       
       int numero = 8;
       int contador = 1;
       int total;
       
       while (contador <= 10){
           total = numero * contador;
           System.out.println(numero + " x " + contador + " = " + total);
           contador++;
       }
   } 
}
