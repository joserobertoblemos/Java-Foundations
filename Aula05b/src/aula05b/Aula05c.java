/**
 * Nesse Programa vamos estudar a estrutura de repetição for para imprimir a tabuada 
 * de um número solicitado pelo usuário
 */
package aula05b;
import javax.swing.JOptionPane;
public class Aula05c {
    public static void main(String args[]){
        
        String numeroStr = JOptionPane.showInputDialog(null, "Digite um número inteiro para Tabuada:","Sistema de Tabuada", 3);
        
        int numero = Integer.parseInt(numeroStr);
        String msg = "";
        for (int i = 1; i <= 10; i++) {
            int total = i * numero;
            msg += numero + " X " + i + " = " + total + "\n";
        }
        JOptionPane.showMessageDialog(null, msg, "Sistema de tabuada", 1);
    }
    
}
