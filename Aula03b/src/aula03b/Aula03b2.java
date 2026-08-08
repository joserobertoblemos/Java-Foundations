/**
 * Nesse Programa vamos estudar a estrutura de repetição if...else
 */
package aula03b;

import javax.swing.JOptionPane;

public class Aula03b2 {
    
    public static void main (String args[]){
        
        String salarioStr = JOptionPane.showInputDialog(null, "Digite o salario do funcionario:","Sistema de RH", 3);
        
        double salario = Double.parseDouble(salarioStr);
        
        if (salario < 5000) {
            salario = salario + (salario * 0.15);
        } else { 
            salario = salario + (salario * 0.09);
        }
        JOptionPane.showMessageDialog(null,"Seu novo salário é R$" + String.format("%.2f", salario),"Sistema de RH", 1);
        
        
        
    }
    
}
