/**
 * Utilizando ArrayList faça um programa que simule uma lista de 
 * tarefas. O programa deve permitir que o usuário adicione varias 
 * tarefas. Para isso crie um loop que se encerra quando o usuário 
 * Não quiser inserir novas tarefas. Ao final exiba as tarefas adicionadas
 * usando no console do NetBeans (System.ou.println).
 * Para encerrar remova uma das tarefas simulando que a mesma foi executada
 * e exiba novamente as tarefas.
 * Utilize JOptionPane para inserção de tarefas o for-each para exibição das
 * tarefas no console do Netbeans.
 */
package aula06a;
import java.util.ArrayList; 
import javax.swing.JOptionPane;
public class Aula06aExercicio1 {
    public static void main(String args[]){
        
    ArrayList<String> tarefas = new ArrayList<String>();
        
        String tarefa = "";
        
        do {
            tarefa = JOptionPane.showInputDialog(null, "Insira a tarefa que deseja ou digite 'sair' ", "Lista de tarefas", 3);
            tarefas.add (tarefa);
            
        } while (!tarefa.equals("sair"));
        
        tarefas.remove ("sair");
        
        for(String tar : tarefas) {
            System.out.println(tar);
        }
        
        
        System.out.println("=".repeat(20));
        tarefas.remove (JOptionPane.showInputDialog(null, "Qual tarefa deseja retirar? ", "Lista de tarefas", 3));
         for(String tar : tarefas) {
        System.out.println(tar);
    }
    }
}