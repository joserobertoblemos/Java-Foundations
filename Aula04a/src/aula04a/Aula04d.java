/**
 * Nesse Programa vamos rever o metodo substring da classe String 
 * Para extrair partes de uma string
 */
package aula04a;
import javax.swing.JOptionPane;

public class Aula04d {
    public static void main (String args[]){
        String texto = "Celso Charuri";
        
        System.out.println("Segundo nome do texto: " + texto.substring(6));
        System.out.println("Primeiro nome do texto: " + texto.substring(0,5));
        
    } 
    
}
