/**
 * jogo da Adivinhação
 * Nesse Jogo o Algoritmo vai sortear um numero entre 1 e 10. o jogador tera 3 chances 
 * de acertar o numero sorteado. Cada palpite errado do jogador dispara uma dica iformando se o palpite é 
 * maior ou menor que o numero sorteado.
 */
package aula04b;
import javax.swing.JOptionPane;
import java.util.Random;

public class Aula04d6 {
public static void main (String args[]) {
    
    Random rd = new Random();
    int numeroSecreto = rd.nextInt(100)+ 1;
    int tentativas;
    int tentativasRestantes = 10;
    JOptionPane.showMessageDialog(null, "Você tem 10 tentativas para adivinhar um número entre 1 e 100", "Jogo de adivinhação",1);
    while (tentativasRestantes > 0) {
        tentativas = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite seu palpite: ", "Jogo de adivinhação ", 3));
        if(tentativas == numeroSecreto) {
            JOptionPane.showMessageDialog(null, "PARABENS: Voce acertou o número secreto. ", "Jogo de Adivinhação", 1);
            break;
        } else if (tentativas < numeroSecreto) {
            JOptionPane.showMessageDialog(null, "Seu palpite é menor do que o número secreto.", "Jogo de Adivinhação", 2);
        } else {
            JOptionPane.showMessageDialog(null,"Seu palpite é maior que o número secreto", "Jogo da adivinhação", 2);
        }
        tentativasRestantes--;
        if (tentativasRestantes > 0) {
            JOptionPane.showMessageDialog(null,"Tente novamente!", "Jogo de Adivinhação", 1);
        }
    }
    if (tentativasRestantes == 0 ) {
        JOptionPane.showMessageDialog(null, "PERDEU! O Número sorteado era : " + numeroSecreto,"jogo de Adivinhação", 0);
    }
}    
}
