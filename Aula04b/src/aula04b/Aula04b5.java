/**
 * Nesse Programa vamos estudar a estrutura de repetição while com a condição
 * de loop infinito sendo interropido pela ação do usuário
 */
package aula04b;
import javax.swing.JOptionPane;
public class Aula04b5 {
 public static void main (String args []) {
     String titulo = "Nome Diversos";
     String msg = "";
     
     while (true) {
         String nome = JOptionPane.showInputDialog(null, "Digite um nome qualquer: ", titulo, 1);
         msg = msg + nome;
         int resposta = JOptionPane.showConfirmDialog(null, "Deseja Digitar outro nome?", titulo, JOptionPane.YES_NO_OPTION);
         if (resposta == 1) {
             msg = msg + ".";
             break;
         } else {
             msg = msg + ", ";
         }
     }
     JOptionPane.showMessageDialog(null, msg, "nomes digitados", 1);
 }    
}
