/**
 * Nesse programa vamos estudar métodos (funções) com parametros / argumentos
 * e com retorno
 */
package aula07b;

import javax.swing.JOptionPane;

public class Aula07b4 {
    
    public int calcularDobro(int numero) {
        return numero * 2;
    }
    public int calcularTriplo(int numero) {
        return numero * 3;
    }
    
    public int calcularQuadrado (int numero) {
        return numero * numero;
    }
    
    public int calcularCubo (int numero) {
        return numero * numero * numero;
    }
    
    public static void main (String args[]) {
        Object[] opcoes = {"Calculadora Dobro","Calcular Triplo", "Elevar ao Quadrado","Elevar ao Cubo"};
        int resposta = JOptionPane.showOptionDialog(null," Selecione a operação desejada: ", "Calculadora Simples", 
                JOptionPane.YES_NO_CANCEL_OPTION, 3, null, opcoes, opcoes[0]);
        String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");
        
        int numero = 0;
        int resultado = 0;
        Aula07b4 msg = new Aula07b4();
        switch (resposta) {
        case 0:
            numero = Integer.parseInt(numeroStr);
            resultado = msg.calcularDobro(numero);
            break;
        case 1:
            numero = Integer.parseInt(numeroStr);
            resultado = msg.calcularTriplo(numero);
            break;
        case 2:
            numero = Integer.parseInt(numeroStr);
            resultado = msg.calcularQuadrado(numero);
            break;
        case 3:
            numero = Integer.parseInt(numeroStr);
            resultado = msg.calcularCubo(numero);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Você fechou a janela sem escolher uma opção. ");
    }
        JOptionPane.showMessageDialog(null, "O resultado esperado é " + resultado);
    }
}
