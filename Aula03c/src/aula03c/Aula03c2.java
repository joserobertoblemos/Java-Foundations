/**
 * Nesse Programa vamos estudar o uso da estrutura de decisão 
 * if...else com os operadores lógicos && (and = e)
 */
package aula03c;

import javax.swing.JOptionPane;


public class Aula03c2 {
    
    public static void main (String args[]) {
        
        double media = 5;
        
        if (media >= 4 && media < 6 ) {
            JOptionPane.showMessageDialog(null,"Aluno de recuperação");
        } else if (media >= 6 && media <= 10) {
            JOptionPane.showMessageDialog(null, "Aluno aprovado");
        } else if (media >= 0 && media < 4) {
            JOptionPane.showMessageDialog(null, "Aluno reprovado");
        } else {
            JOptionPane.showMessageDialog(null, "Média informada inválida");
        }
    }
}
