/**
 * Nesse programa vamos estudar a estrutura de decisão if...else if...else
 */
package aula03b;

import javax.swing.JOptionPane;
public class Aula03b4 {
    
    public static void main(String args[]) {
        
        String nomeAluno = JOptionPane.showInputDialog(null,"Digite o nome do aluno:","Escola Celso Charuri",3);
        String mediaStr = JOptionPane.showInputDialog(null,"Digite a media do aluno:", "Escola Celso Charuri", 3); 
    
        double media = Double.parseDouble(mediaStr);
        
        String msg = "";
        
        if (media >= 9) {
            msg = "O aluno " + nomeAluno + " foi aprovado com louvor.";
        } else if (media >= 6){
            msg = "O aluno " + nomeAluno + " foi aprovado";
        } else if (media >= 4) {
            msg = "O aluno " + nomeAluno + " ficou de recuperação.";
            
        } else { 
            msg = "O aluno " + nomeAluno + " foi reprovado.";
            
        }
                
        JOptionPane.showMessageDialog(null,msg,"Escola Celso Charuri", 1);
        
    }
    

    
}
