/**
 * Nesse programa vamos estudar a estrutura de decisão if...else
 * o operador lógico || (or -> ou)
 */
package aula03c;

import javax.swing.JOptionPane;

public class Aula03c5 {

    public static void main (String args []) {
        
        int idade = 20;
        
        if (idade < 18 || idade > 65) {
            JOptionPane.showMessageDialog (null,"Você não atende os requisitos para doação de sangue");
        } else { 
            JOptionPane.showMessageDialog(null,"Dirija-se ao balcão e triagem");
        }
        
    }
}
