/*
 * Nesse Programa vamos estudar a estrutura de repetição do...while 
 */
package aula05a;
import javax.swing.JOptionPane;

public class Aula05a2 {
public static void main (String args[]) {
    String tit = "Escola Senai";
    String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno ", tit, 3);
    
    double somaNotas = 0;
    double media = 0;
    int numeroNotas = 0;
    int resposta = 0;
    do {
        String notaStr = JOptionPane.showInputDialog(null, "Digite a nota do aluno: ", tit, 3);
        notaStr = notaStr.replace(",",".");
        double nota = Double.parseDouble(notaStr);
        somaNotas += nota;
        numeroNotas++;
        resposta = JOptionPane.showConfirmDialog(null, "Deseja lançar outra nota?", tit, JOptionPane.YES_OPTION,3);
    } while (resposta != JOptionPane.YES_NO_CANCEL_OPTION);
    media = somaNotas / numeroNotas;
    String conceito;
    if (media >= 50 ){
         conceito = "APROVADO! ";
        
    }else {
         conceito = "REPROVADO! ";
    }
    String msg = "O aluno " + nomeAluno + " foi " + conceito + "com a média " + String.format("%.1f",media);
    JOptionPane.showMessageDialog(null, msg, tit, 1);
            
}    
}
