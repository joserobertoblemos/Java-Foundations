/**
 * Nesse Programa vamos estudar a estrutura de decisão 
 * if...else com o operador && (and -> e)
 */
package aula03c;

import javax.swing.JOptionPane;


public class Aula03c3 {

    public static void main (String args[]) {
        
        double valorCompra = 1300;
        String formaPagamento = "PIX";
        
        if (valorCompra >= 1000 && formaPagamento.equals("PIX")){
            JOptionPane.showMessageDialog(null, "PARABÉNS! Você ganhou 15% de desconto");
        } else if (valorCompra >= 1000 && formaPagamento.equals("CARTÃO")) {
            JOptionPane.showMessageDialog(null, "Você ganhou 10% de desconto");
        } else {
            JOptionPane.showMessageDialog(null, "Valor total R$ " + String.format("%.2f",valorCompra));
        }
    }
}
