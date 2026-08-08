/**
 * 
 */
package aula09exercicio1;

import javax.swing.JOptionPane;

public class Aula09exercicio1 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Gaspar",20,75,1.78);
        aluno.calcularIMC();
        aluno.mostrarDados();
        aluno.setPeso(82);
        aluno.mostrarDados(); 
        aluno.setPeso(-10);
        aluno.setIdade(-5);
        aluno.setAltura(0);
    }
    
}
