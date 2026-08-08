/**
 * nesse Programa vamos estudar o desvio condicional a estrutura de decisão if...else
 * usando o operador ! (not -> não)
  */
package aula03c;

import javax.swing.JOptionPane;

public class Aula03c6 {

    public static void main (String args[]) {
        
        String camisa = "verde";
        
        if (!(camisa.equals("verde"))){
            JOptionPane.showMessageDialog(null, "Essa cor de camisa eu aceito");
        } else { 
            JOptionPane.showMessageDialog(null, "Essa cor de camisa eu não aceito");
        }
    }
}
