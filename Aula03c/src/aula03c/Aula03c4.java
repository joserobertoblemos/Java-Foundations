/**
 * Nesse programa vamos estudar a estrutura de decisão if...else
 * com o operador lógico || (OR -> ou )
*/
package aula03c;

import javax.swing.JOptionPane;
public class Aula03c4 {
    
    public static void main(String args[]) {
        
        int idade = 15;
        String acompanhadoResponsavel = "sim";
        
        if (idade >= 18 || acompanhadoResponsavel.equals("Sim")){
            JOptionPane.showMessageDialog(null, "Entrada liberada");
        } else {
            JOptionPane.showMessageDialog(null, "Entrada bloqueada");
        }
    }
}
