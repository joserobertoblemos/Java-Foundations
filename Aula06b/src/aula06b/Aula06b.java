/**
 * Nesse programa vamos estudar o uso do tratamento de exceção com a estrutura
 * try - catch
 */
package aula06b;
import javax.swing.JOptionPane;
public class Aula06b {
    public static void main(String[] args) {
        
        String idadeStr = JOptionPane.showInputDialog(null, "Digite a idade do candidato");
        
        try {
            int idade = Integer.parseInt(idadeStr);
            if (idade < 0) {
                JOptionPane.showMessageDialog(null, "A idade não pode ser negativa.");
            }
        
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Digite apenas números inteiros para a idade.");
        }
        
    }
    
}
