/**
 * Nesse programa vamos estudar a classe ArrayList
 * com números inteiros
 */
package aula06a;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Aula06a2 {
    public static void main (String args[]){
        
        ArrayList<Integer> idades = new ArrayList<Integer>();
        
        String idadeStr = ""; 
        do {
            idadeStr = JOptionPane.showInputDialog(null, "Digite a idade do aluno ou 0 para encerrar:", "Sistema Escola", 3);
            idades.add(Integer.parseInt(idadeStr));
        } while (!idadeStr.equals("0"));
        idades.remove(idades.indexOf(0)); //para retirar o 0 quando digitar para parar e não aparecer na lista
        System.out.println(idades);
        
        int somaIdades = 0;
        
        for (int idade: idades) {  // Idades in idades, a cada looping ele vai pegar uma idade de idades e jogar nessa variavel depois...
            somaIdades += idade;                // vai somando as idades e mostrar no final
        }
        int mediaIdades = somaIdades / idades.size();
        JOptionPane.showMessageDialog(null, "A média das idades é: " + mediaIdades, "Sistema escola",1);
    }
}
