/**
 * Nesse Programa vamos explorar o JOptionPane solicitando o nome, a idade 
 * o peso e a altura do usuario e calcular o seu indice de massa corporal
 * Ao final, exibir essas informações na janela do JOptionPane
 */
package aula02f;

import javax.swing.JOptionPane;

public class Aula02f {

    public static void main(String[] args) {
        String tit = "Indice de Massa Corporal (IMC)";
        String nome = JOptionPane.showInputDialog(null,"Digitite seu nome: ", tit, 3);
        String strIdade = JOptionPane.showInputDialog(null, "Digite sua idade:",tit, 3);
        String strPeso = JOptionPane.showInputDialog(null,"Digite seu peso em quilos", tit, 3);
        String strAltura = JOptionPane.showInputDialog(null,"Digite sua altura em metro:");
        
        strAltura = strAltura.replace(",",".");
        
        int idade = Integer.parseInt(strIdade);
        double peso = Double.parseDouble(strPeso);
        double altura = Double.parseDouble(strAltura);
        
        double imc = peso / Math.pow(altura, 2);   // peso/ altura / idade
        
        String msg = "Nome do usuario: " + nome.toUpperCase() + "\n";
        msg = msg + "idade: " + idade + "\n";
        msg = msg + "Peso; " + peso + " quilos\n";
        msg = msg + "Altura: " + altura + "metros\n";
        msg = msg + "IMC: " + String.format("%.1f",imc);
        
        JOptionPane.showMessageDialog(null, msg, tit, 1);
        
        
        
        
    }
    
}
