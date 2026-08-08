/**
 * Nesse Programa vamos estudar a etrutura de controle switch...case 
*/
package aula04a;

import javax.swing.JOptionPane;

public class Aula04a {

    public static void main(String[] args) {
        
        String opcaoStr = JOptionPane.showInputDialog(null,"Digite uma opção (1, 2 ou 3", "Menu do Sistema", 1);
        
        int opcao = Integer.parseInt(opcaoStr);
        
        
        switch (opcao) {
            case 1:
                JOptionPane.showConfirmDialog(null, "Você escoheu a opção 1", "Menu do Sistema", 2);
                break;
            case 2:
                JOptionPane.showConfirmDialog(null, "Você escoheu a opção 2", "Menu do Sistema", 2);
                break;
            case 3:
                JOptionPane.showConfirmDialog(null, "Você escoheu a opção 3", "Menu do Sistema", 2);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Opção Inválida", "Menu do Sistema", 2);
                break;
                
                
        }   
        
        
        
    }
    
}
