/**
 * Nesse programa vamos estudar o tratamento de exceção usando a estrutura try - catch
 */
package aula06b;
import javax.swing.JOptionPane;
public class Aula06b2 {
    public static void main (String args[]){
    
        try{
            int numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numerador da divisão"));
            int denominador = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o denominador da divisão: "));
            int divisao = numerador / denominador;
            JOptionPane.showMessageDialog(null,"O resultado da divisão é " + divisao);
        } catch (ArithmeticException e) {
         JOptionPane.showMessageDialog(null,"Não é possível dividir um número por zero.");
         JOptionPane.showMessageDialog(null,"Digite um número diferente de 0 no denominador");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Digite apenas números para a divisão");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro do Sistema: informe ao suporte o erro abaixo\n"
            + e);
        }
        
    }    
}
