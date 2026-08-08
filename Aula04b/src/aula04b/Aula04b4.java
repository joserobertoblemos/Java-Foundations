/**
 * Nesse Programa vamos solicitar as notas de um aluno e imprimir seu conceito 
 * final
 */
package aula04b;
import javax.swing.JOptionPane;

public class Aula04b4 {
 public static void main (String args[]) {
     
     String titulo = "Escola Celso Charuri";
     String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno:", titulo, 3);
     String disciplina = JOptionPane.showInputDialog(null, "Digite sua disciplina: ", titulo, 3);
     
     int contador = 1;
     double somaNotas = 0;
     while (contador <= 4) {
         String notaStr = JOptionPane.showInputDialog(null, "Digite a nota do " + contador + "ºbimeste:", titulo,3);
         notaStr = notaStr.replace(",", "."); // esse comando vai substituir a ',' por '.' ex: 5,5 muda 5.5
         double nota = Double.parseDouble(notaStr);
         somaNotas += nota;
         contador++;
     }
     
     double media = somaNotas / 4;
     String conceitoFinal;
     if (media >= 7) {
         conceitoFinal = "APROVADO";
     } else if (media >= 4 && media < 7) {
         conceitoFinal = "RECUPERAÇÂO";
     } else {
         conceitoFinal = "REPROVADO";
     }
     String msg = "O aluno " + nomeAluno + "\n";
     msg = msg + "obteve a média " + String.format("%.1f",media) + "\n";
     msg = msg + "na disciplina " + disciplina + ".\n";
     msg = msg + "Seu conceito final foi: " + conceitoFinal;
     
     JOptionPane.showMessageDialog(null, msg, titulo, 1);
     
     }
 }    

