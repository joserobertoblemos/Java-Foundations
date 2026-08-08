/**
 * Nesse Programa vamos estudar a estrutura de decisão if... else usando a caixa de dialogo JOptionPane
 */
package aula03b;

import javax.swing.JOptionPane;

public class Aula03b3 {
    public static void main (String args[]){
        
        String nomeArquivo = JOptionPane.showInputDialog (null,"Digite o nome do arquivo:", "Salvar arquivo no disco", 3);
        
        int resposta = JOptionPane.showConfirmDialog(null,"Deseja salvar esse aquivo?", "Salvar arquivo no disco", JOptionPane.YES_NO_OPTION,3);
        
        if(resposta == JOptionPane.YES_OPTION)  {
             JOptionPane.showMessageDialog(null,"Arquivo salvo com sucesso", "Salvar arquivo no disco", 1);
        } else { 
            JOptionPane.showMessageDialog(null, "Salvamento de arquivo cancelado.", "Salvar arquivo no disco", 1);
            
        }
        
    }
}
