/*
 * Nesse Programa vamos fazer uma revisão do tratamento de exceção e depuração
 */
package aula07a;

import javax.swing.JOptionPane;

public class Aula07a {

    public static void main(String[] args) {

        double[] notas = new double[4];
        while (true) {                                                   // while true para caso a pessoa queira digitar mais notas
            try {                                                        // try catch para caso a pessoa digite uma letra não uma nota 
                for (int i = 0; i < 4; i++) {
                    String nota = JOptionPane.showInputDialog("Entre com a nota" + (i + 1)); // (i + 1) vai exibir qual a nota vai ser inserida ex: nota 1, nota 2...
                    nota = nota.replace(",", ".");                       // .replace para trocar , por . para não dar erro 
                    notas[i] = Double.parseDouble(nota);

                }
                double somaNotas = 0;
                for (int i = 0; i < 4; i++) {
                    somaNotas += notas[i];
                }
                double media = somaNotas / notas.length;                 // .leangth vai dizer quantos elemetos tem numa array 
                JOptionPane.showMessageDialog(null, "Média do aluno " + media);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números para as notas dos alunos");
                JOptionPane.showMessageDialog(null, "Digite as notas novamente.");
            }
        }
    }

}
