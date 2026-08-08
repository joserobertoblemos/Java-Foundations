/**
 *  nesse Programa vamos estudar o desvio condicional a estrutura de decisão if...else
 * usando o operador ! (not -> não)
 */
package aula03c;

import javax.swing.JOptionPane;

public class Aula03c7 {

    public static void main (String args[]) {
        
        int quantidadeEstoque = 100;
        boolean emPromocao = true;  //false
        
        if (!(quantidadeEstoque > 0)) {
            JOptionPane.showMessageDialog(null,"Produto esgotado no momento");
        } else if (emPromocao) {
            JOptionPane.showMessageDialog(null,"Produto disponível com 10% de desconto");
        } else {
            JOptionPane.showMessageDialog(null, "Produto disponivel para compra sem desconto");
        }
    }
}
