/**
 * Nesse Programa vamos continuar explorando a estrutura de controle switch...case
 */
package aula04a;
import javax.swing.JOptionPane;

public class Aula04b {

public static void main(String args[]) {
    //Notas A, B, C, D, E
    String nota = JOptionPane.showInputDialog(null,"Digite a nota do aluno","Escola Celso Cheruri",3);
    
    nota = nota.toUpperCase();
    
    switch(nota){
        case "A":
        case "B":
        case "C":
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado com a nota " + nota,
                    "Escola Celso Charuri",1);
            break;
        case    "D":
            JOptionPane.showMessageDialog(null,"O aluno ficou de recuperação. Sua nota foi " + nota,"Escola Celso Charuri",1);
            break;
        case "E":
            JOptionPane.showMessageDialog(null,"O aluno foi reprovado. Sua nota foi " + nota,"Escola Celso Charuri",1);
            break;
        default: 
            JOptionPane.showMessageDialog(null,"Nota digitada inválida ","Escola Celso Charuri",1);
            
            
            
            
    }
}    

}
