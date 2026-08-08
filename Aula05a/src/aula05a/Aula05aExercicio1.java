/**
 * Usando a estrutura do while, faça um programa para receber numeros decimais
 * e fazer a soma desses números. O usuário deve digitar cada número em uma 
 * caixa de diálogo JOptionPane. Quando o usuário digitar o número 0, 
 * interrompa a soma e imprima o resultado total acumulado.
 * A mensagem da caixa de diálogo pode ser:
 * Digite um número para a soma ou 0 para encerrar.
 */
package aula05a;
import javax.swing.JOptionPane;
public class Aula05aExercicio1 {
public static void main (String args []) {
    
    String tit = "Escola SENAI";
    double somaNumeros = 0;
    double numero = 0;
    
    
    do {
        String numeroStr = JOptionPane.showInputDialog(null, "Digite um número para a soma ou 0 para encerrar ", tit, 3);
        numeroStr = numeroStr.replace (",",".");
        numero = Double.parseDouble(numeroStr);
        somaNumeros += numero;
    }while (numero != 0);
    
        JOptionPane.showMessageDialog(null, "A Soma dos numeros " + somaNumeros);
        
        
    }
    
    
    
    }
            
            
    
    

