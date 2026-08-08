/**
 * Nesse programa vamos estudar a importação de bibliotecas java e 
 * o uso da biblioteca JOptionPane
 */
package aula02e;
import javax.swing.JOptionPane;

public class Aula02e {

    public static void main(String[] args) {
        
        String titulo = "curso de Java";
        
        
        JOptionPane.showMessageDialog(null,"Olá Mundo!", titulo,
                JOptionPane.WARNING_MESSAGE);
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno", titulo, 3);
        JOptionPane.showMessageDialog(null, "Você digitou " + nome, titulo, 1);
        
        String strNota1 = JOptionPane.showInputDialog(null,"digite a 1 nota do aluno: ", titulo, 2);
        String strNota2 = JOptionPane.showInputDialog(null,"digite a 2 nota do aluno: ", titulo, 2);
        String strNota3 = JOptionPane.showInputDialog(null,"digite a 3 nota do aluno: ", titulo, 2);
        
        double nota1 = Double.parseDouble(strNota1);      
        double nota2 = Double.parseDouble(strNota2);
        double nota3 = Double.parseDouble(strNota3);
        
        double media = (nota1 + nota2 + nota3) /3;
        
        String msg = String.format ("O Aluno %s obteve a Media %.1f nas " + "avaliaçoes.", nome, media);
        JOptionPane.showMessageDialog(null, msg,titulo, 1);
        
    }
    
    
    
}
