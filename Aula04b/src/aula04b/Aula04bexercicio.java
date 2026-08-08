/**
 *  Faça um programa para receber o nome de um aluno e as notas que esse 
 * aluno recebeu ao longo do ano. nesse programa voce deve criar um loop infinito,
 * pois não sabemos quantas notas o professor ira lancar, a cada nota 
 * lançada receba uma perguntando se o professor deseja lançar outra nota, Depois 
 * de todas as notas lançadas, calcule a média e exiba uma caixa com APROVADO ou
 * REPROVADO e o nome do aluno. Para ser aprovado o aluno precisa ter a média maior ou = a 50.
 */
package aula04b;
import javax.swing.JOptionPane;

public class Aula04bexercicio {
    public static void main (String args[]) {
        
        String tit = "Calculo de Média do aluno";
        String nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", tit, 3);
        
        int contador = 0;
        int bimestre = 1;
        double somaNotas = 0;
        while (true) {
            String notaStr = JOptionPane.showInputDialog(null, "Digite a nota do " + bimestre + "ºbimeste:", tit,3);
            double notas = Double.parseDouble(notaStr);
            somaNotas += notas;
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja Digitar outra nota?", tit, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION){
             break;   
            }
            contador++;
            bimestre++;
                    
            
        }
            
        double media = somaNotas / contador;
        
        String conceitoFinal;
        if (media >= 7) {
         conceitoFinal = "APROVADO";
     } else if (media >= 4 && media < 7) {
         conceitoFinal = "RECUPERAÇÂO";
     } else {
         conceitoFinal = "REPROVADO";
     }
     
        JOptionPane.showMessageDialog(null, " o aluno: " + nomeAluno + "\n" + "teve media de: " + media + "\n" + "resultado: " + conceitoFinal,tit,3  );
        
    }
    
}
