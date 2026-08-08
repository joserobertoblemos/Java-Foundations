/**
 * faça um programa para receber o nome do usuario, seu peso em quilos e sua altura em metros. calcule o IMC 
 * deste usuario usando a formula imc = peso / (altura * altura)
 * Crie uma estrutura de decisão para verificar a classificação do usuário na tabela abaixo:
 *  IMC             Classificação
 *  Menor que 18.5  Abaixo do Peso Normal
 *  Entre 18,5 e 24.9 Normal
 *  Entre 25,0 e 29.9 Sobrepeso
 *  Entre 30,0 e 34.9 Obesidade Grau I
 *  Entre 35,0 e 39.9 Obesidade Grau II
 *  Maior que 40.0    Obesidade Grau III
 * Utilize a biblioteca JOptionPane para receber os dados e imprimir a resposta para o usuário
 */

package aula03b;

import javax.swing.JOptionPane;

public class Aula03bExercicio1 {
    
    public static void main (String args[]) {
        
          String tit = "Indice de Massa Corporal (IMC)";
        String nome = JOptionPane.showInputDialog(null,"Digitite seu nome: ", tit, 3);
        String strPeso = JOptionPane.showInputDialog(null,"Digite seu peso em quilos", tit, 3);
        String strAltura = JOptionPane.showInputDialog(null,"Digite sua altura em metro:");
        
        strAltura = strAltura.replace(",",".");
        
      
        double peso = Double.parseDouble(strPeso);
        double altura = Double.parseDouble(strAltura);
        
        double imc = peso / Math.pow(altura, 2);   // peso/ altura / idade
        
        String msg = "Nome do usuario: " + nome.toUpperCase() + "\n";
        msg = msg + "Peso; " + peso + " quilos\n";
        msg = msg + "Altura: " + altura + "metros\n";
        msg = msg + "IMC: " + String.format("%.1f",imc);
        
        JOptionPane.showMessageDialog(null, msg, tit, 1);
        
        
        if (imc <= 18.5) {
            msg = "O aluno " + nome + " está abaixo do Peso.";
        } else if (imc <=24.9 ){
            msg = "O aluno " + nome + " está Normal. ";
        } else if (imc <= 34.9) {
            msg = "O aluno " + nome + " está Sobre-peso.";
            } else if (imc <= 39.9) {
            msg = "O aluno " + nome + " está com Obesidade Grau I. ";
            } else if (imc <= 40.0) {
            msg = "O aluno " + nome + " está com Obesidade Grau II.  ";
            } else if (imc <= 4) {
            msg = "O aluno " + nome + " está com Obesidade Grau III. ";
            } else if (imc <= 4) {
            
        }
                
        JOptionPane.showMessageDialog(null,msg,"Escola Celso Charuri", 1);
        
        
    }
    
}
