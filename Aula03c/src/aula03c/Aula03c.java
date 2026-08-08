/**
 * Nesse Programa vamos estudar a estrutura de decisão 
 * if...else para verificar valores do tipo String
 */
package aula03c;

import javax.swing.JOptionPane;
public class Aula03c {
    
    public static void main(String[] args) {
        String unidade = JOptionPane.showInputDialog("Digite a unidade SENAI desejada" 
                +  "\n na região de Guarulhos "
                + " Centro, Dutra, Mariporã ou Aruja");
        String msg;
        if (unidade.equalsIgnoreCase ("Centro")) {
            msg = "Dirija-se ao centro de Guarulhos";
        } else if (unidade.equalsIgnoreCase("Dutra")){
            msg = "Dirija-se a unidade Guarulhos Dutra";
        } else if (unidade.equalsIgnoreCase("Mariporã")) {
            msg = "Dirija-se a unidade de Mariporã";
        } else if (unidade.equalsIgnoreCase ("Aruja")) {
            msg = "Dirija-se a unidade de Aruja";
        } else {
            msg = "Você não digitou uma unidade válida";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
